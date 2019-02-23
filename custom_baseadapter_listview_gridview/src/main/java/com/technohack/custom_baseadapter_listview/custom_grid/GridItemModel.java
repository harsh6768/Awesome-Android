package com.technohack.custom_baseadapter_listview.custom_grid;

public class GridItemModel {

    private int imageUrl;
    private String imageTitle;

    public GridItemModel(){

    }

    public GridItemModel(int imageUrl, String imageTitle) {
        this.imageUrl = imageUrl;
        this.imageTitle = imageTitle;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }

}
