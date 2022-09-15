package com.example.rx.Bean;

import java.io.Serializable;

public class SomeThing implements Serializable {
    private String title;
    private String name;
    private String url;
    private String type;
    private String avatar;


    public SomeThing(String title, String name, String url, String type, String avatar) {
        this.title = title;
        this.name = name;
        this.url = url;
        this.type = type;
        this.avatar = avatar;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
