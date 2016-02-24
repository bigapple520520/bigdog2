package com.xuan.bigdog.demo.zxing;

import com.xuan.bigdog.R;
import com.xuan.bigdog.lib.zxing.DGScanActivity;

/**
 * 扫一扫界面
 *
 * Created by xuan on 16/2/24.
 */
public class DemoScanActivity extends DGScanActivity {
    @Override
    protected void onScanFinish(String text) {
        setResult(222, getIntent().putExtra("SCAN_TEXT", text));
        finish();
    }

    @Override
    protected int onScanViewLayout() {
        //可以进行自定义布局
        return R.layout.demo_zxing_scan;
    }

}
