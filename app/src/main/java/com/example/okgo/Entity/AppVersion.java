package com.example.okgo.Entity;

public class AppVersion {


    /**
     * id : 2
     * version : 1.0.1
     * history : 内测版本：多种坐标全面显示，蓝牙实现掉线重连
     * time : 2019-01-19T16:00:00.000+0000
     */

    private int id;
    private String version;
    private String history;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
