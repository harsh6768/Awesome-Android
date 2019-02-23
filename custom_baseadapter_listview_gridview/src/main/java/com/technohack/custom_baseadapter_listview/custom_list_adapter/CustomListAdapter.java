package com.technohack.custom_baseadapter_listview.custom_list_adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.technohack.custom_baseadapter_listview.R;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {

    Context context;
    ArrayList<ListItemModel> listItemModelArrayList;

    public CustomListAdapter(Context context, ArrayList<ListItemModel> listItemModelArrayList) {
        this.context = context;
        this.listItemModelArrayList = listItemModelArrayList;
    }


    @Override
    public int getCount() {
        return listItemModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return listItemModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
         convertView=LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.single_list_item,parent,false);

        // get current item to be displayed
        ListItemModel listItemModel=(ListItemModel) getItem(position);

        ImageView imageView=convertView.findViewById(R.id.custom_imageId);
        TextView imageTitle=convertView.findViewById(R.id.custom_titleId);

        imageView.setImageResource(listItemModel.getImageUrl());
        imageTitle.setText(listItemModel.getImageTitle());

        return convertView;

    }


}
