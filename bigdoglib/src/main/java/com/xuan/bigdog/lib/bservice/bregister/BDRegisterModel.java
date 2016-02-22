package com.xuan.bigdog.lib.bservice.bregister;

/**
 * 注册忘记密码
 *
 * Created by xuan on 16/2/16.
 */
public class BDRegisterModel {
    private static BDRegisterModel instance;

    private BDRegisterModel() {

    }

    public static BDRegisterModel getInstance() {
        if (null == instance) {
            instance = new BDRegisterModel();
        }
        return instance;
    }

    /**
     * 发送手机验证码
     *
     * @param website
     * @param type
     * @param phone
     * @param l
     */
    public void sendSmsCode(String website, String type, String phone, BDSendSmsCodeListener l){
        //TODO:写你的代码
    }

    /**
     * 发送手机验证码-注册
     *
     * @param website
     * @param phone
     * @param l
     */
    public void sendSmsCode4Register(String website,String phone, BDSendSmsCodeListener l){
        String type = "REGISTER";
        sendSmsCode(website,type, phone, l);
    }

    /**
     * 发送手机验证码-忘记密码
     *
     * @param website
     * @param phone
     * @param l
     */
    public void sendSmsCode4forgetPassword(String website,String phone, BDSendSmsCodeListener l){
        String type = "FORGET_PASSWORD";
        sendSmsCode(website,type, phone, l);
    }

    /**
     * 设置密码,可以用来注册或者忘记密码
     *
     * @param website
     * @param phone
     * @param password
     * @param smsCode
     * @param l
     */
    public void setPassword(String website,String phone, String password, String smsCode, BDSetPasswordListener l){
        //TODO:写你的代码
    }

}
