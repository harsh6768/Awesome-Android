package com.technohack.custom_baseadapter_listview.custom_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.technohack.custom_baseadapter_listview.R;

import java.util.ArrayList;

public class CustomGridViewAdapter extends BaseAdapter {

    ArrayList<GridItemModel> gridItemModelArrayList;
    Context context;

    public CustomGridViewAdapter(ArrayList<GridItemModel> gridItemModelArrayList, Context context) {
        this.gridItemModelArrayList = gridItemModelArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return gridItemModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return gridItemModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.single_grid_item,parent,false);
        }

        //to get the object of gridItemModel class
        GridItemModel gridItemModel=(GridItemModel)getItem(position);

        ImageView imageView=convertView.findViewById(R.id.custom_imageId);
        TextView textView=convertView.findViewById(R.id.custom_titleId);

        imageView.setImageResource(gridItemModel.getImageUrl());
        textView.setText(gridItemModel.getImageTitle());

        return convertView;

    }
}
