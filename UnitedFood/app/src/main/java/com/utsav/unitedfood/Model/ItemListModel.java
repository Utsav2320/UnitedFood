package com.utsav.unitedfood.Model;

public class ItemListModel {
    int imgItem;
    String itemName;

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }

    public ItemListModel(int imgItem,String itemName) {
        this.imgItem = imgItem;
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
