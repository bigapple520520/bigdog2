package com.xuan.bigdog.lib.bservice.bupload;

import java.io.File;

/**
 * 文件上传
 *
 * Created by xuan on 16/2/16.
 */
public class BDUpLoadModel {
    private static BDUpLoadModel instance;

    private BDUpLoadModel() {

    }

    public static BDUpLoadModel getInstance() {
        if (null == instance) {
            instance = new BDUpLoadModel();
        }
        return instance;
    }

    /**
     * 上传代码
     *
     * @param website
     * @param file
     * @param l
     */
    public void doUpload(String website, File file, BDUploadListener l){
        String url = website + "/file/upload.htm";
        //TODO:写你的代码
    }
}
