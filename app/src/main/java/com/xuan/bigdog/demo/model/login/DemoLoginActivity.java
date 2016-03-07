package com.xuan.bigdog.demo.model.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.xuan.bigdog.R;
import com.xuan.bigdog.lib.model.login.DGLoginedUser;

/**
 * 登录测试
 *
 * Created by xuan on 16/3/7.
 */
public class DemoLoginActivity extends Activity {
    private TextView textTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_model_login);
        textTv = (TextView)findViewById(R.id.textTv);

        //第一步:模拟登录成功
        DGLoginedUser<CustomUserInfo> loginedUser = new DGLoginedUser<CustomUserInfo>();
        loginedUser.setUserName("userName");
        loginedUser.setPassword("123456");
        loginedUser.setLogined(true);

        //第二步:模拟获取用户信息
        CustomUserInfo userInfo = new CustomUserInfo();
        userInfo.setName("xuan");
        loginedUser.setUserInfo(userInfo);

        //第三步:保存
        loginedUser.saveToFile();

        //在任何地方可以这样
        DGLoginedUser<CustomUserInfo> lUser = DGLoginedUser.getLoginedUser(CustomUserInfo.class);

        CustomUserInfo userInfo1 = lUser.getUserInfo();
        String name = userInfo1.getName();
        textTv.setText(name);
    }
}
