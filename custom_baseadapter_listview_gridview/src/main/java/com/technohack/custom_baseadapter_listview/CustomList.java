package com.technohack.custom_baseadapter_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.technohack.custom_baseadapter_listview.custom_list_adapter.CustomListAdapter;
import com.technohack.custom_baseadapter_listview.custom_list_adapter.ListItemModel;

import java.util.ArrayList;

public class CustomList extends AppCompatActivity {


    ArrayList<ListItemModel> listItemModelArrayList;
    CustomListAdapter customListAdapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);


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

        listItemModelArrayList=new ArrayList<>();

        //to add the data into the list
        for(int i=0;i<imageTitle.length;i++){
            listItemModelArrayList.add(new ListItemModel(images[i],imageTitle[i]));
        }

        listView=findViewById(R.id.listViewId);
        customListAdapter=new CustomListAdapter(this,listItemModelArrayList);
        listView.setAdapter(customListAdapter);
        customListAdapter.notifyDataSetChanged();

    }
}
