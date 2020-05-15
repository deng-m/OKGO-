package com.example.okgo.Callback;


import android.app.Activity;

import com.example.okgo.Callback.JsonCallback;
import com.example.okgo.ConstantUtils;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.HttpParams;
import com.tamsiree.rxkit.RxSPTool;
/**
 * @ProjectName: Utils
 * @Package: com.allynav.JsjFarm.Utils
 * @ClassName: OkgoUtils
 * @Description: 新增okGo类实现网络请求
 * GET/POST  暂时未知服务器返回数据大致格式 是否有code码 暂不封装
 * @Author: 吴升平
 * @CreateDate: 2020/3/27 9:21
 * @UpdateUser: 更新者：
 * @UpdateDate: 2020/3/27 9:21
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class OkgoUtils {
    public static <T> void getRequets(String url, Activity tag, JsonCallback<T> callback) {
        OkGo.<T>get(url)
                .tag(tag)
                .headers("token", RxSPTool.getString(tag, ConstantUtils.LOGIN_TOKEN))
                .headers("version", "1.0.0")
                .execute(callback);
    }

    public static <T> void getRequets(String url, Activity tag, HttpParams params, JsonCallback<T> callback) {
        OkGo.<T>get(url)
                .tag(tag)
                .headers("token", RxSPTool.getString(tag, ConstantUtils.LOGIN_TOKEN))
                .headers("version", "1.0.0")
                .params(params)
                .execute(callback);
    }

    public static <T> void postRequest(String url, Activity tag, HttpParams mApiData, JsonCallback<T> callback) {
        OkGo.<T>post(url)
                .tag(tag)
                .headers("token", RxSPTool.getString(tag, ConstantUtils.LOGIN_TOKEN))
                .headers("version", "1.0.0")
//                .headers("content-type","application/json;charset=utf-8")
                .params(mApiData)
                .execute(callback);
    }

    public static <T> void putRequest(String url, Activity tag, HttpParams mApiData, JsonCallback<T> callback) {
        OkGo.<T>put(url)
                .tag(tag)
                .headers("token", RxSPTool.getString(tag, ConstantUtils.LOGIN_TOKEN))
                .headers("version", "1.0.0")
                .params(mApiData)
                .execute(callback);
    }

    public static <T> void deleteRequest(String url, Activity tag, JsonCallback<T> callback) {
        OkGo.<T>delete(url)
                .tag(tag)
                .headers("token", RxSPTool.getString(tag, ConstantUtils.LOGIN_TOKEN))
                .headers("version", "1.0.0")
                .execute(callback);
    }


}
