package com.technohack.intents;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PendingIntents extends AppCompatActivity {


    public static final String NOTIFICAITON_CHANNEL_ID="100";
    private static final String KEY_TEXT_REPLY = "key_text_reply";
    Button showNotificationBtn;
    private EditText messageText;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_intents);

        messageText=findViewById(R.id.notif_messageId);

        message=messageText.getText().toString().trim();

        showNotificationBtn=findViewById(R.id.show_notificationId);
        showNotificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //for creating the notification channel
                createNotificationChannel();

            }
        });

    }

    //creating the notification channel
    private void createNotificationChannel() {

        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){

            //to set the importance of the notification
            int notifImportant= NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel=new NotificationChannel(NOTIFICAITON_CHANNEL_ID,"My Notification",notifImportant);

            //getting the service
            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);

            //show the notification
            showNotification();

        }else{
            //show Notification
            showNotification();

        }

    }
    private void showNotification() {

        //for reply
        String replyMessage = "Reply";
        RemoteInput remoteInput = new RemoteInput.Builder(KEY_TEXT_REPLY)
                .setLabel(replyMessage)
                .build();

        NotificationCompat.Action replyAction = new NotificationCompat.Action.Builder
                (
                        R.drawable.ic_launcher_foreground,
                        replyMessage,
                        //calling method to do action to reply any message
                        getReplyPendingIntent()
                )
                .setAllowGeneratedReplies(true)
                .build();

        //end of reply action


        //this intent is used to show the user the from where notification came
        //If we are not trying to show the user then don't need to write this code
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this,NOTIFICAITON_CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("SomeNotification")
                .setContentText(message)
                .setContentIntent(pendingIntent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                //add action to show from where the notification is coming
                .addAction(R.drawable.ic_launcher_foreground, "Show", pendingIntent)
                //add action to reply the message
                .addAction(replyAction)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        //to notify the notification
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        notificationManager.notify(101, notificationBuilder.build());

    }

    //method for reply the message
    private PendingIntent getReplyPendingIntent() {

        Intent intentForMessageReply = new Intent(this, MainActivity.class);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            // start a
            // (i)  broadcast receiver which runs on the UI thread or
            // (ii) service for a background task to b executed

            return PendingIntent.getBroadcast(
                    getApplicationContext(),
                    100,
                    intentForMessageReply,
                    PendingIntent.FLAG_UPDATE_CURRENT
            );

        } else {
            // start your activity for Android M and below

            intentForMessageReply.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            return PendingIntent.getActivity(
                    this,
                    100,
                    intentForMessageReply,
                    PendingIntent.FLAG_UPDATE_CURRENT
            );

        }

    }
}
