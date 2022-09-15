package com.example.rx.Bean;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Contract;

public class BaseBean<T> {
    private int code;
    private String message;
    private T data;

    public BaseBean(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
