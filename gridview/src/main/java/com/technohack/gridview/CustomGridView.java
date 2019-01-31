package com.technohack.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CustomGridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);

        int images[]={
                R.drawable.pica1, R.drawable.pica2, R.drawable.pica3, R.drawable.pica4,
                R.drawable.pica5, R.drawable.pica6, R.drawable.pica8, R.drawable.pica9,
                R.drawable.pica10, R.drawable.pica11, R.drawable.pica12, R.drawable.pica13,
                R.drawable.pica14, R.drawable.pica15, R.drawable.pica16, R.drawable.pica17,
        };

        String imageTitle[]={
                "Title1","Title2","Title3","Title4","Title5","Title6",
                "Title7","Title8","Title9","Title10","Title11","Title12",
                "Title13","Title14","Title15","Title16"
        };


    }
}
