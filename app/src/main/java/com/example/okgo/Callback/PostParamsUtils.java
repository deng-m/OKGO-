package com.example.okgo.Callback;

import com.lzy.okgo.model.HttpParams;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @ProjectName:
 * @Package: com.allynav.JsjFarm.Utils
 * @ClassName: PostParamsUtils
 * @Description: 请求服务器消息字段封装类
 * @Author: dengmin
 * @CreateDate: 2020/4/7 13:18
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020/4/7 13:18
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class PostParamsUtils {

    public static HttpParams LOGIN(String username, String password) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("username", username);
        httpParams.put("password", password);
        return httpParams;
    }
    public static HttpParams GETREGIST(String machinecode, String num) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("machinecode", machinecode);
        httpParams.put("num", num);
        return httpParams;
    }
    public static HttpParams insertUser(int id, String Username, String password, String machinecode,String project,String registdate, String registcode) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("id", id);
        httpParams.put("username", Username);
        httpParams.put("password", password);
        httpParams.put("machinecode", machinecode);
        httpParams.put("project", project);
        httpParams.put("registdate", registdate);
        httpParams.put("registcode", registcode);
        return httpParams;
    }

    public static HttpParams setId(int id) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("id", id);
        return httpParams;
    }

    public static HttpParams setVersion(String version) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("version", version);
        return httpParams;
    }
    public static HttpParams setVersionDate(String startdate,String enddate) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("startdate", startdate);
        httpParams.put("enddate", enddate);
        return httpParams;
    }

    public static HttpParams setVersionInfo(String history,int id,String time,String version) {
        HttpParams httpParams = new HttpParams();
        httpParams.put("history", history);
        httpParams.put("id", id);
        httpParams.put("time", time);
        httpParams.put("version", version);
        return httpParams;
    }
}
