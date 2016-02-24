package com.xuan.bigdog.demo.zxing;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.xuan.bigdog.R;
import com.xuan.bigdog.lib.zxing.ZxConfig;
import com.xuan.bigdog.lib.zxing.ZxingUtils;

/**
 * 扫一扫工具类测试demo
 *
 * Created by xuan on 16/2/24.
 */
public class DemoZxingActivity extends Activity {
    private EditText editText;
    private Button buttonLeft;
    private Button buttonMiddle;
    private Button buttonRight;
    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo_zxing);

        editText = (EditText) findViewById(R.id.editText);
        buttonLeft = (Button) findViewById(R.id.buttonLeft);
        buttonMiddle = (Button) findViewById(R.id.buttonMiddle);
        buttonRight = (Button) findViewById(R.id.buttonRight);
        textView = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.imageView);

        //生成
        buttonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ZxConfig config = new ZxConfig();
                String saveFilePath = Environment.getExternalStorageDirectory()+"/bigdog/zxing/er.jpg";
                config.setSaveFileName(saveFilePath);
                ZxingUtils.encodeToBitmap(editText.getEditableText().toString(), config);

                Bitmap b = BitmapFactory.decodeFile(saveFilePath);
                imageView.setImageBitmap(b);
                textView.setText("二维码图片存放在[" + saveFilePath + "]不信你去看");
            }
        });

        //识别
        buttonMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String saveFilePath = Environment.getExternalStorageDirectory() + "/bigdog/zxing/er.jpg";
                Bitmap b = BitmapFactory.decodeFile(saveFilePath);
                String text = ZxingUtils.decodeFromBitmap(b);
                String ret = "识别内容:\n" + text;
                textView.setText(ret);
            }
        });

        //扫一扫
        buttonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(DemoZxingActivity.this, DemoScanActivity.class);
                startActivityForResult(intent, 111);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 111 && resultCode == 222){
            String ret = "扫描内容:\n" + data.getStringExtra("SCAN_TEXT");
            textView.setText(ret);
        }
    }

}
