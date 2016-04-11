package com.xuan.bigdog.lib.bservice.bversioncheck;

import android.content.Context;

import com.xuan.bigdog.lib.update.UpdateHelper;
import com.xuan.bigdog.lib.update.core.UpdateConfig;

/**
 * 版本监测
 *
 * Created by xuan on 16/2/16.
 */
public class BDVersionCheckModel {
    private static BDVersionCheckModel instance;

    private BDVersionCheckModel() {

    }

    public static BDVersionCheckModel getInstance() {
        if (null == instance) {
            instance = new BDVersionCheckModel();
        }
        return instance;
    }

    /**
     * 检查版本更新
     *
     * @param context
     * @param checkUrl
     * @param apkSaveFilePath
     */
    public void doCheck(Context context, String checkUrl, String apkSaveFilePath){
        UpdateConfig config = new UpdateConfig();
        config.setCheckUrl(checkUrl);
        config.setSaveFileName(apkSaveFilePath);
        config.setPasreUpdateInfoHandler(new BDVersionCheckPasreHandler());

        UpdateHelper updateHelper = new UpdateHelper(context, config);
        updateHelper.check();
    }

}
