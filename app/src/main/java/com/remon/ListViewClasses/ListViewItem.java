package com.remon.ListViewClasses;

import com.google.android.gms.maps.model.Marker;

/**
 * Created by lg on 2017-05-13.
 */

public class ListViewItem {
    private String name;
    private String description;
    private Marker marker;

    public void setName(String name) {
        this.name = name ;
    }
    public void setDesc(String desc) {
        description = desc ;
    }
    public void setMarker(Marker marker) {
        this.marker = marker;
    }

    public String getName() {
        return this.name ;
    }
    public String getDescription() {
        return this.description ;
    }
    public Marker getMarker() {
        return marker;
    }
}