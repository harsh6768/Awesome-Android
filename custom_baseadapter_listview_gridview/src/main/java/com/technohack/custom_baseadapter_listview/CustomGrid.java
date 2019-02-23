package com.technohack.custom_baseadapter_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.technohack.custom_baseadapter_listview.custom_grid.CustomGridViewAdapter;
import com.technohack.custom_baseadapter_listview.custom_grid.GridItemModel;

import java.util.ArrayList;

public class CustomGrid extends AppCompatActivity {

    ArrayList<GridItemModel> gridItemModelArrayList;
    CustomGridViewAdapter customGridViewAdapter;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid);

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

        gridItemModelArrayList=new ArrayList<>();

        //to add the data into the list
        for(int i=0;i<imageTitle.length;i++){
            gridItemModelArrayList.add(new GridItemModel(images[i],imageTitle[i]));
        }

        gridView=findViewById(R.id.main_gridViewId);

        customGridViewAdapter=new CustomGridViewAdapter(gridItemModelArrayList,this);

        gridView.setAdapter(customGridViewAdapter);
        customGridViewAdapter.notifyDataSetChanged();

    }
}
