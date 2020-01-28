package com.apicoletora.APIcoletora.model;

import javax.persistence.*;

@Entity
@Table(name = "event")
public class Event {

    @Id    
    private String event;

    private String timestamp;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
