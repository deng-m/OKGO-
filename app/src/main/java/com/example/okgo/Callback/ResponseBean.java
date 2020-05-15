package com.example.okgo.Callback;
import java.io.Serializable;

/**
 * Created by ccb on 2017/10/11.
 *
 */
public class ResponseBean<T> implements Serializable {
    public int code;
    public String msg;
    public T data;

}