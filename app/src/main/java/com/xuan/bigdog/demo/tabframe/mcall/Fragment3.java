package com.xuan.bigdog.demo.tabframe.mcall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xuan.bigapple.lib.ioc.InjectView;
import com.xuan.bigapple.lib.utils.ToastUtils;
import com.xuan.bigdog.lib.tabframe.mcall.DGFrameFragment;
import com.xuan.bigdog.lib.widgets.title.DGTitleLayout;
import com.xuan.bigdog.R;

public class Fragment3 extends DGFrameFragment {
	@InjectView(R.id.textView)
	private TextView textView;

	@InjectView(R.id.titleLayout)
	private DGTitleLayout titleLayout;

	@Override
	protected View getFragmentView() {
		return LayoutInflater.from(getActivity()).inflate(
				R.layout.demo_fragment3, null);
	}

	@Override
	protected void initFragmentWidgets(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		textView.setText("fragment3");

		titleLayout.configTitle("右边有操作文字").configReturn(-1, "取消", new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ToastUtils.displayTextShort("点击了返回");
			}
		}).configRightText("点我", new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ToastUtils.displayTextShort("你真点");
			}
		});

	}
}
