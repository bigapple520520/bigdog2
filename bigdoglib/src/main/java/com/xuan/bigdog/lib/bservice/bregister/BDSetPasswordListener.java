package com.xuan.bigdog.lib.bservice.bregister;

/**
 * 设置密码回调
 * Created by xuan on 16/2/16.
 */
public interface BDSetPasswordListener {
    void success();
    void fail(String message);
}
