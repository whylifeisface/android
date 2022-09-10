package com.example.myapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.net.URL;

@Entity(tableName = "asa")
public class asa  {
    @PrimaryKey
    public Long id ;
    @ColumnInfo(name = "url")
    public String url ;
    @ColumnInfo(name = "src")
    public String src ;
    @ColumnInfo(name = "content")
    public String content ;

    public asa(Long id, String url, String src, String content) {
        this.id = id;
        this.url = url;
        this.src = src;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getSrc() {
        return src;
    }

    public String getContent() {
        return content;
    }
}
