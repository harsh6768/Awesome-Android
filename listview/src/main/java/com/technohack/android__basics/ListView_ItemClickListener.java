package com.technohack.android__basics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListView_ItemClickListener extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;

    private String []subjects={
            "C-Programming",
            "Artificial Intelligence",
            "Android App Development",
            "Cyber Security",
            "Machine Learning",
            "Data Science"
    };


    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view__item_click_listener);

        mListView=findViewById(R.id.main_list_Id);

        //arrayAdapter will handle the views that which view it will show onto the list
        arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,subjects);

        //now set the adapter into the listView to display the subjects
        mListView.setAdapter(arrayAdapter);

        //setting the itemClickListener to ListView
        mListView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        String values=(String)adapterView.getItemAtPosition(position);

        if(values.equals("C-Programming")){

            Toast.makeText(this,"You have Clicked "+values,Toast.LENGTH_LONG).show();

        }else if(values.equals("Artificial Intelligence")){

            Toast.makeText(this,"You have Clicked "+values,Toast.LENGTH_LONG).show();

        }else if(values.equals("Android App Development")){

            Toast.makeText(this,"You have Clicked "+values,Toast.LENGTH_LONG).show();

        }else if(values.equals("Cyber Security")){

            Toast.makeText(this,"You have Clicked "+values,Toast.LENGTH_LONG).show();

        }else if(values.equals("Machine Learning")){

            Toast.makeText(this,"You have Clicked "+values,Toast.LENGTH_LONG).show();

        }else if(values.equals("Data Science")){

            Toast.makeText(this,"You have Clicked "+values,Toast.LENGTH_LONG).show();

        }

    }
}
