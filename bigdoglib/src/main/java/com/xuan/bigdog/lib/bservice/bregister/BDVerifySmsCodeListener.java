package com.xuan.bigdog.lib.bservice.bregister;

/**
 * 验证手机验证码回调
 * Created by wuhk on 2016/3/14.
 */
public interface BDVerifySmsCodeListener {
    void success();
    void fail(String message);
}
