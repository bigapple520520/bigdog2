package com.xuan.bigdog.demo.tabframe.mcall;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.xuan.bigapple.lib.ioc.InjectView;
import com.xuan.bigapple.lib.utils.ToastUtils;
import com.xuan.bigdog.lib.tabframe.mcall.DGFrameFragment;
import com.xuan.bigdog.lib.widgets.title.DGTitleLayout;
import com.xuan.bigdog.R;
import com.xuan.bigdog.demo.view.layout.input.DemoTitleAndInputActivity;

public class Fragment1 extends DGFrameFragment {
	@InjectView(R.id.textView)
	private TextView textView;

	@InjectView(R.id.demoInputActivityBtn)
	private Button demoInputActivityBtn;

	@InjectView(R.id.titleLayout)
	private DGTitleLayout titleLayout;

	@InjectView(R.id.textButton)
	private TextView textButton;

	@Override
	protected View getFragmentView() {
		return LayoutInflater.from(getActivity()).inflate(
				R.layout.demo_fragment1, null);
	}

	@Override
	protected void initFragmentWidgets(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		textView.setText("fragment1");

		demoInputActivityBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent();
				intent.setClass(getActivity(), DemoTitleAndInputActivity.class);
				startActivity(intent);
			}
		});

		textButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ToastUtils.displayTextShort("1111");
			}
		});

		titleLayout.configTitle("返回");

		titleLayout.configReturn(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ToastUtils.displayTextShort("111");
			}
		});
	}

}
