package com.example.okgo.Entity;

import java.util.List;

public class AppVersions {

    private List<AppVersionsBean> appVersions;

    public List<AppVersionsBean> getAppVersions() {
        return appVersions;
    }

    public void setAppVersions(List<AppVersionsBean> appVersions) {
        this.appVersions = appVersions;
    }

    public static class AppVersionsBean {
        /**
         * id : 1
         * version : 1.0.0
         * history : 内测版本：第一版软件发布
         * time : 2018-12-11T16:00:00.000+0000
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
}
