package com.technohack.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ImplicitIntent extends AppCompatActivity implements View.OnClickListener {

    private Button emailBtn,browserBtn,dialerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

       emailBtn=findViewById(R.id.implicit_email_Id);
       browserBtn=findViewById(R.id.implicit_browser_id);
       dialerBtn=findViewById(R.id.implicit_dialer_BtnId);

       //setting the reference
       emailBtn.setOnClickListener(this);
       browserBtn.setOnClickListener(this);
       dialerBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        int id=v.getId();

        switch (id){
            case R.id.implicit_browser_id:
                //To the browser from any url
                Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://google.com"));
                startActivity(browserIntent);
                break;
            case R.id.implicit_dialer_BtnId:
                // Use format with "tel:" and phoneNumber created is
                Intent dialerIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8969185002"));
                try {
                    startActivity(dialerIntent);
                }catch (SecurityException s) {
                    Toast.makeText(this, s.getMessage(), Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.implicit_email_Id:
                //TODO for sending the email
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("text/plane");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, "abinash248@gmail.com");
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");
                startActivity(Intent.createChooser(emailIntent, "Send Email"));
                break;
                default:
                    Toast.makeText(ImplicitIntent.this,"You have Clicked Somewhere else!!!",Toast.LENGTH_LONG).show();
                    break;
        }
    }
}
