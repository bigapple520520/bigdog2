package com.xuan.bigdog.demo.widgets.about;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xuan.bigdog.R;
import com.xuan.bigdog.lib.widgets.about.DGAboutConfig;

/**
 * 关于界面测试
 *
 * Created by xuan on 16/3/7.
 */
public class DemoAboutActivity extends Activity {
    private Button aboutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_widgets_about);

        aboutBtn = (Button)findViewById(R.id.aboutBtn);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DGAboutConfig c = new DGAboutConfig();
                        c.setIcon(R.drawable.ic_launcher)
                        .setNameVersion("BigDog工具类V1.0")
                        .setCopyrightTitle("巨柏网路科技版权所有")
                        .setCopyrightDetail("copyright 2016-2022")
                        .startWork(DemoAboutActivity.this);
            }
        });
    }

}
