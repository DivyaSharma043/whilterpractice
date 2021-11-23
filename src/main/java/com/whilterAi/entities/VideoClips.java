package com.whilterAi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VideoClips {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String s3Path;

    public VideoClips() {
    }

    public VideoClips(String s3Path) {
        this.s3Path = s3Path;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getS3Path() {
        return s3Path;
    }

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    @Override
    public String toString() {
        return "VideoClips{" +
                "id=" + id +
                ", s3Path='" + s3Path + '\'' +
                '}';
    }
}
