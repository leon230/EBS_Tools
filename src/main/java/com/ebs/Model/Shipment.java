package com.ebs.Model;

/**
 * Created by lukasz.homik on 2016-09-13.
 */
public class Shipment {
    private String id;
    private String name;
    private String startDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

}
