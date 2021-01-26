package com.khidrew.soundrecorder_clone.models;

import java.util.Date;

public class RecordModel {
    private String name ;
    private String path ;
    private long id ;
    private long duration ;
    private Date creationDate ;

    public RecordModel(String name, String path, long id, long duration, Date creationDate) {
        this.name = name;
        this.path = path;
        this.id = id;
        this.duration = duration;
        this.creationDate = creationDate;
    }

    public RecordModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
