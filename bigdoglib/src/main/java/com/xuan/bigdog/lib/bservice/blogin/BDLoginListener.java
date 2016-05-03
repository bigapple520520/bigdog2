package com.xuan.bigdog.lib.bservice.blogin;

/**
 * 登录操作的回调
 *
 * Created by xuan on 16/2/16.
 */
public interface BDLoginListener {
    void success(BDLoginUser loginUser);
    void fail(String message);
}
