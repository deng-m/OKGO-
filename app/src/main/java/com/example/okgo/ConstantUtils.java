package com.example.okgo;

import android.os.Environment;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ConstantUtils {

    public static final String BASE_URL = "http://192.168.1.119:8080/";
    public static String LOGIN_TOKEN="LOGIN_TOKEN";

//   app-login-controller : App登录接口 5
    public static String LOGIN="farmservice/app/login";
    public static String REGIST="farmservice/app/regist";
    public static String GETREGISTMONTHCODE="farmservice/app/getmonthcode";
    public static String GETREGISTYEARCODE="farmservice/app/getyearcode";
    public static String LOGOUT="farmservice/app/logout";

//    app-user-controller : App用户接口 4
    public static String DELETEUSER="farmservice/app/deleteuser";
    public static String INSERTUSER="farmservice/app/insertuser";
    public static String SELECTUSER="farmservice/app/selectuser";
    public static String UPDATEUSER="farmservice/app/updateuser";

//    版本控制 4
    public static String GETAPPVERSION="farmservice/app/getappversion";
    public static String GETAPPVERSIONBYDATE="farmservice/app/getappversionbydate";
    public static String GETAPPVERSIONS="farmservice/app/getappversions";
    public static String INSERTAPPVERSION="farmservice/app/insertappversion";

}
