package com.technohack.gridview;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;

    private static String []values={
      "Value1",
      "Value2",
      "Value3",
      "Value4",
            "Value5",
            "Value6",
            "Value7",
            "Value8",
            "Value9",
            "Value10",
            "Value11",
            "Value12",

    };
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Taking the reference of the GridView so that we can take the add some functionality on the GricView
        mGridView=findViewById(R.id.main_gridViewId);

        //set the adapter to add the data
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);


        //displaying the toast when we click any of the item in the GridView
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                view.setBackgroundColor(Color.parseColor("#ff6600"));
                view.setElevation(10);


                Toast.makeText(MainActivity.this, "Item Clicked At Position:"+(position+1), Toast.LENGTH_SHORT).show();

            }
        });

        //setting adapter in grigView
        mGridView.setAdapter(arrayAdapter);


    }
}
