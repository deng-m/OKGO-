package com.example.okgo.Entity;


public class User {

    /**
     * user : {"id":11,"username":"dengxiaomin","password":"1231","machinecode":"1231","project":"","registdate":"2020-03-03","registcode":"1231"}
     */

    private UserBean user;

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public static class UserBean {
        /**
         * id : 11
         * username : dengxiaomin
         * password : 1231
         * machinecode : 1231
         * project :
         * registdate : 2020-03-03
         * registcode : 1231
         */

        private int id;
        private String username;
        private String password;
        private String machinecode;
        private String project;
        private String registdate;
        private String registcode;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getMachinecode() {
            return machinecode;
        }

        public void setMachinecode(String machinecode) {
            this.machinecode = machinecode;
        }

        public String getProject() {
            return project;
        }

        public void setProject(String project) {
            this.project = project;
        }

        public String getRegistdate() {
            return registdate;
        }

        public void setRegistdate(String registdate) {
            this.registdate = registdate;
        }

        public String getRegistcode() {
            return registcode;
        }

        public void setRegistcode(String registcode) {
            this.registcode = registcode;
        }
    }
}
