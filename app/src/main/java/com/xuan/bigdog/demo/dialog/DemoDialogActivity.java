package com.xuan.bigdog.demo.dialog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.xuan.bigapple.lib.ioc.InjectView;
import com.xuan.bigapple.lib.ioc.app.BPActivity;
import com.xuan.bigapple.lib.utils.ToastUtils;
import com.xuan.bigdog.lib.dialog.DGAlertDialog;
import com.xuan.bigdog.lib.dialog.DGConfirmDialog;
import com.xuan.bigdog.lib.dialog.DGPromptDialog;
import com.xuan.bigdog.lib.dialog.DGPromptDialog.PromptDialogListener;
import com.xuan.bigdog.R;

/**
 * 自定义对话框测试
 * 
 * @author xuan
 * 
 */
public class DemoDialogActivity extends BPActivity {
	@InjectView(R.id.content)
	private LinearLayout content;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		addButton("alert", new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				DGAlertDialog builder = new DGAlertDialog.Builder(
						DemoDialogActivity.this).setTitle("alert")
						.setMessage("ok message").setbuttonText("OK")
						.setOnButtonListener(new View.OnClickListener() {
							@Override
							public void onClick(View view) {
								ToastUtils.displayTextShort("Click OK!!!");
							}
						}).create();
				builder.show();
			}
		});

		addButton("confirm", new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				DGConfirmDialog confirm = new DGConfirmDialog.Builder(
						DemoDialogActivity.this)
						.setTitle("confirm")
						.setMessage("confirm message!!!")
						.setLeftBtnText("Left Btn")
						.setOnLeftBtnListener(new View.OnClickListener() {
							@Override
							public void onClick(View arg0) {
								ToastUtils.displayTextShort(
										"Click Left Btn!!!");
							}
						}).setRightBtnText("Right Btn")
						.setOnRightBtnListener(new View.OnClickListener() {
							@Override
							public void onClick(View arg0) {
								ToastUtils.displayTextShort(
										"Click Right Btn!!!");
							}
						}).create();
				confirm.show();
			}
		});

		addButton("prompt", new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				DGPromptDialog prompt = new DGPromptDialog.Builder(
						DemoDialogActivity.this)
						.setTitle("prompt")
						.setMessage("prompt message!!!")
						.setLeftBtnText("Left Btn")
						.setOnLeftBtnListener(new PromptDialogListener() {
							@Override
							public void onClick(View view, String inputText) {
								ToastUtils.displayTextShort(
										"Click Left Btn!!!Say:" + inputText);
							}
						}).setRightBtnText("Right Btn")
						.setOnRightBtnListener(new PromptDialogListener() {
							@Override
							public void onClick(View view, String inputText) {
								ToastUtils.displayTextShort(
										"Click Right Btn!!!Say:" + inputText);
							}
						}).create();
				prompt.show();
			}
		});
	}

	private void addButton(String text,
			final Button.OnClickListener onClickListener) {
		Button button = new Button(DemoDialogActivity.this);
		button.setText(text);
		button.setOnClickListener(onClickListener);
		content.addView(button);
	}
}
