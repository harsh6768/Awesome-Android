package com.technohack.dialogs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dialog extends AppCompatActivity {

    private AlertDialog.Builder alertDialogBuilder;

    private Button alertDialogBtn;

    private android.app.Dialog customDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        alertDialogBtn=findViewById(R.id.alert_dialog_Id);

        alertDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //making the alert dialog
                alertDialogBuilder=new AlertDialog.Builder(new ContextThemeWrapper(Dialog.this, R.style.myDialog))
                        .setTitle("Who am I?")
                        .setMessage("Do you know?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                finish();
                                Toast.makeText(getApplicationContext(), "You have Pressed Yes Button!!!", Toast.LENGTH_SHORT).show();

                            }
                        })

                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                //to cancel the dialog
                                dialogInterface.cancel();
                                Toast.makeText(getApplicationContext(),"You have pressed the No button!!!",Toast.LENGTH_SHORT).show();

                            }
                        });


                //creating the alert dialog
                AlertDialog alertDialog=alertDialogBuilder.create();
                //You need to show the alert dialog
                alertDialog.show();

            }
        });

    }
}
