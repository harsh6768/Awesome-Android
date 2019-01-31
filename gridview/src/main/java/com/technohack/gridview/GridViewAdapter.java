package com.technohack.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {

    Context context;
    List<GridModelClass> gridModelClassList;

    public GridViewAdapter(Context context, List<GridModelClass> gridModelClassList) {
        this.context = context;
        this.gridModelClassList = gridModelClassList;
    }

    @Override
    public int getCount() {
        return gridModelClassList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= LayoutInflater.from(context).inflate(R.layout.activity_custom_grid_view,parent);
        return view;
    }

}
