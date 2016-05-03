package com.xuan.bigdog.lib.bservice.bregister;

/**
 * 发送手机验证码回调
 * Created by xuan on 16/2/16.
 */
public interface BDSendSmsCodeListener {
    void success();
    void fail(String message);
}
