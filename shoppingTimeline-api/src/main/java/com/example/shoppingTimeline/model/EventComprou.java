package com.example.shoppingTimeline.model;

import java.util.List;

public class EventComprou {
    private String event;
    private String timestamp;
    private double revenue;
    private List<CustomData> custom_data;

    public String getValueByKey(String key) {
        for (CustomData customData : custom_data) {
            if(customData.getKey().equals(key))
                return customData.getValue();
        }
        return null;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public List<CustomData> getCustomData() {
        return custom_data;
    }

    public void setCustomData(List<CustomData> custom_data) {
        this.custom_data = custom_data;
    }
}
