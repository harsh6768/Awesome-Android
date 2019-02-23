package com.technohack.custom_baseadapter_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button customListBtn;
   Button customGridBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customListBtn=findViewById(R.id.curtom_list_BtnId);
        customListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,CustomList.class));

            }
        });

        customGridBtn=findViewById(R.id.custom_girdViewId);
        customGridBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,CustomGrid.class));

            }
        });


    }
}
