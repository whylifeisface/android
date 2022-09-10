package com.example.databinding.RoomClass;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @ColumnInfo(name = "content")

    private String content;
    @ColumnInfo(name = "Src")

    private String Src;
    @ColumnInfo(name = "url")

    private String url;
    @PrimaryKey
    private Long id;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSrc() {
        return Src;
    }

    public void setSrc(String src) {
        Src = src;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User() {
    }

    public User(String content, String src, String url, Long id) {
        this.content = content;
        Src = src;
        this.url = url;
        this.id = id;
    }
}
