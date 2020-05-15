package com.example.okgo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.okgo.Callback.JsonCallback;
import com.example.okgo.Callback.OkgoUtils;
import com.example.okgo.Callback.PostParamsUtils;
import com.example.okgo.Callback.ResponseBean;
import com.example.okgo.Entity.AppVerionByDateBean;
import com.example.okgo.ConstantUtils;
import com.example.okgo.Entity.AppVersion;
import com.example.okgo.Entity.AppVersions;
import com.example.okgo.Entity.User;
import com.example.okgo.LoginBean;
import com.example.okgo.R;
import com.lzy.okgo.model.Response;
import com.tamsiree.rxkit.RxSPTool;
import com.tamsiree.rxkit.RxTool;
import com.tamsiree.rxkit.view.RxToast;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RxTool.init(this);

        login();
    }

    /* app-login-controller : App登录接口*/

    //        登录界面获取token
    void login() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.LOGIN, this, PostParamsUtils.LOGIN("13667415810", "123456"), new JsonCallback<ResponseBean<LoginBean>>() {
            @Override
            public void onSuccess(Response<ResponseBean<LoginBean>> response) {
                int code = response.body().code;
                if (code == 0) {
                    RxToast.success("登录成功");
                    String token = response.body().data.getToken();
                    RxSPTool.putString(getApplicationContext(), ConstantUtils.LOGIN_TOKEN, token);
//        get30dayRegis();
//        getYearRegis();
//        logout();
                    getUserRegis();

       /*用户管理*/
//        insertUser();
//        deleteuser();
//        selectUser();
//        updateUser();

     /*版本控制*/
//        getVersion();
//        getVersionList();
//        getVersions();
//        addVersions();

                }
            }

            @Override
            public void onError(Response<ResponseBean<LoginBean>> response) {
                super.onError(response);

            }
        });
    }


    //        退出界面接口
    void logout() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.LOGOUT, this, null, new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                int code = response.body().code;
                if (code == 0) {
                    RxToast.success(response.body().msg);
                }

            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);

            }
        });
    }

    //    30天注册接口
    void get30dayRegis() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.GETREGISTMONTHCODE, this, PostParamsUtils.GETREGIST("111", "11"), new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                String data = response.body().data;
                RxToast.success(data);
            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);
            }
        });
    }


    //    一年注册接口
    void getYearRegis() {
//        num >30
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.GETREGISTYEARCODE, this, PostParamsUtils.GETREGIST("300", "31"), new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                String msg = response.body().msg;
                if (response.code() == 0) {
                    String data = response.body().data;
                    RxToast.success(data);
                } else if (response.code() == 500) {
                    RxToast.error(msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);
            }
        });
    }

    //    用户注册接口
    void getUserRegis() {

        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.REGIST, this, PostParamsUtils.insertUser(5, "liyuyue","456","4556","","2020-05-08","456"), new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                int code  =response.body().code;
                String msg = response.body().msg;

                if (code == 0){
                RxToast.success(msg);
                }else if (code == 500){
                    RxToast.error(msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);
            }
        });
    }



    /*app用户管理*/

    //    删除用户
    void deleteuser() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.DELETEUSER, this, PostParamsUtils.insertUser(12, "dengminmin", "123", "123", "", "2020/05/06", "123"), new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                String data = response.body().data;
                RxToast.success(data);
            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);
            }
        });
    }

    //    查询用户
    void selectUser() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.SELECTUSER, this, PostParamsUtils.setId(11), new JsonCallback<ResponseBean<User>>() {
            @Override
            public void onSuccess(Response<ResponseBean<User>> response) {
                if (response.body().code == 0) {
                    RxToast.success(response.body().msg);
                    User dengmin = response.body().data;
                } else if (response.body().code == 500) {
                    RxToast.error(response.body().msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<User>> response) {
                super.onError(response);

            }
        });
    }


    //    更新用户
    void updateUser() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.UPDATEUSER, this, PostParamsUtils.insertUser(11, "dengminmin", "1231", "1231", "", "2020/03/03", "1231"), new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                if (response.body().code == 0) {
                    RxToast.success(response.body().msg);
                } else if (response.body().code == 500) {
                    RxToast.error(response.body().msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);

            }
        });
    }

    //    APP版本获取
    void getVersion() {
//        或者1.0.1当前可用
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.GETAPPVERSION, this, PostParamsUtils.setVersion("1.0.0"), new JsonCallback<ResponseBean<AppVersion>>() {
            @Override
            public void onSuccess(Response<ResponseBean<AppVersion>> response) {
                if (response.body().code == 0) {
                    RxToast.success(response.body().msg);
                    AppVersion appVersion = response.body().data;
                } else if (response.body().code == 500) {
                    RxToast.error(response.body().msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<AppVersion>> response) {
                super.onError(response);

            }
        });
    }


    //    APP版本列表获取
    void getVersionList() {
//        假数据起止时间2018-12-12 ver:1.0.0
//                     2019-01-20 ver:1.0.1
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.GETAPPVERSIONBYDATE, this, PostParamsUtils.setVersionDate("2018/12/11", "2020/02/02"), new JsonCallback<ResponseBean<AppVerionByDateBean>>() {
            @Override
            public void onSuccess(Response<ResponseBean<AppVerionByDateBean>> response) {
                if (response.body().code == 0) {
                    RxToast.success(response.body().msg);
                    AppVerionByDateBean verionBean = response.body().data;
                } else if (response.body().code == 500) {
                    RxToast.error(response.body().msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<AppVerionByDateBean>> response) {
                super.onError(response);

            }
        });
    }


    //    APP版本S获取
    void getVersions() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.GETAPPVERSIONS, this, null, new JsonCallback<ResponseBean<AppVersions>>() {
            @Override
            public void onSuccess(Response<ResponseBean<AppVersions>> response) {
                if (response.body().code == 0) {
                    RxToast.success(response.body().msg);
                    List<AppVersions.AppVersionsBean> appVersions = response.body().data.getAppVersions();
                } else if (response.body().code == 500) {
                    RxToast.error(response.body().msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<AppVersions>> response) {
                super.onError(response);

            }
        });
    }

    //    APP版本添加
    void addVersions() {
        OkgoUtils.postRequest(ConstantUtils.BASE_URL + ConstantUtils.INSERTAPPVERSION, this, PostParamsUtils.setVersionInfo("修复bug",1,"2020-05-06","1.0.2"), new JsonCallback<ResponseBean<String>>() {
            @Override
            public void onSuccess(Response<ResponseBean<String>> response) {
                if (response.body().code == 0) {
                    RxToast.success(response.body().msg);
                } else if (response.body().code == 500) {
                    RxToast.error(response.body().msg);
                }
            }

            @Override
            public void onError(Response<ResponseBean<String>> response) {
                super.onError(response);

            }
        });
    }





}