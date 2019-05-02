package com.technohack.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        int []images={
                R.drawable.pica1,R.drawable.pica2,R.drawable.pica3,
                R.drawable.pica4,R.drawable.pica5,
                R.drawable.pica5,R.drawable.pica6,
                R.drawable.pica7,R.drawable.pica8,
                R.drawable.pica9,R.drawable.pica10,
                R.drawable.pica11,R.drawable.pica12
        };

        String []imageTitle={
                "Pica1","Pica2","Pica3","Pica4","Pica5","Pica6","Pica7",
                "Pica8","Pica9","Pica10","Pica11","Pica12"
        };


        recyclerView=findViewById(R.id.recyclerViewId);


    }
}
