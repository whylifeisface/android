package com.example.databinding.RoomClass;

import android.app.Application;

public class Init {

    public void Insert(Application application){
        User user = new User("哔哩哔哩"
                ,"https://www.bilibili.com/favicon.ico","https://www.bilibili.com",1L);
        User user1 = new User("p站",
                "https://pixivic.com/favicon.ico", "https://pixivic.com", 2L);
        User user2 = new User("淘宝", "https://www.taobao.com/favicon.ico", "https://www.taobao.com/", 3L);

        new RoomRepository(application).Insert(user);
        new RoomRepository(application).Insert(user1);
        new RoomRepository(application).Insert(user2);

    }
}
