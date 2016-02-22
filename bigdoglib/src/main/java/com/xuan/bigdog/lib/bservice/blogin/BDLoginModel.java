package com.xuan.bigdog.lib.bservice.blogin;

/**
 * 登录模块
 * <p/>
 * Created by xuan on 16/2/16.
 */
public class BDLoginModel {
    private static BDLoginModel instance;

    private BDLoginModel() {

    }

    public static BDLoginModel getInstance() {
        if (null == instance) {
            instance = new BDLoginModel();
        }
        return instance;
    }

    /**
     * 登录操作
     *
     * @param website
     * @param username
     * @param password
     * @param ext
     * @param l
     */
    public void doLogin(String website, String username, String password, String ext, BDLoginListener l) {
        String os = "ANDROID";
        String url = website + "/passport/login.htm";

        //TODO:写你的代码
    }

    /**
     * 登录操作
     *
     * @param website
     * @param username
     * @param password
     * @param l
     */
    public void doLogin(String website, String username, String password, BDLoginListener l) {
        doLogin(username, password, null, l);
    }

}
