package com.xuan.bigdog.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.xuan.bigapple.lib.ioc.InjectView;
import com.xuan.bigapple.lib.ioc.app.BPActivity;
import com.xuan.bigdog.R;
import com.xuan.bigdog.demo.dialog.DemoDialogActivity;
import com.xuan.bigdog.demo.tabframe.mcall.DemoFrameActivity;
import com.xuan.bigdog.demo.view.layout.input.DemoTitleAndInputActivity;
import com.xuan.bigdog.lib.update.UpdateHelper;
import com.xuan.bigdog.lib.update.core.UpdateConfig;

/**
 * 测试主界面
 * 
 * @author xuan
 */
public class Main extends BPActivity {
	@InjectView(R.id.content)
	private LinearLayout content;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		addButton("tabframe.mcall测试", DemoFrameActivity.class);
		addButton("dialog测试", DemoDialogActivity.class);
		addButton("title & input测试", DemoTitleAndInputActivity.class);

		addButton("检测新版本", new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				UpdateConfig config = new UpdateConfig();
				config.setCheckUrl("http://xuanner.com/demo.html");
				UpdateHelper h = new UpdateHelper(Main.this, config);
				h.check();
			}
		});
	}

	private void addButton(String text, final Class<?> clazz) {
		Button button = new Button(Main.this);
		button.setText(text);
		button.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(Main.this, clazz);
				startActivity(intent);
			}
		});
		content.addView(button);
	}

	private void addButton(String text,
			final Button.OnClickListener onClickListener) {
		Button button = new Button(Main.this);
		button.setText(text);
		button.setOnClickListener(onClickListener);
		content.addView(button);
	}

}
