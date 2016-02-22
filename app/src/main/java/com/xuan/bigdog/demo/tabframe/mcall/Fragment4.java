package com.xuan.bigdog.demo.tabframe.mcall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xuan.bigapple.lib.ioc.InjectView;
import com.xuan.bigdog.lib.tabframe.mcall.DGFrameFragment;
import com.xuan.bigdog.lib.widgets.title.DGTitleLayout;
import com.xuan.bigdog.R;

public class Fragment4 extends DGFrameFragment {
	@InjectView(R.id.textView)
	private TextView textView;

	@InjectView(R.id.titleLayout)
	private DGTitleLayout titleLayout;

	@Override
	protected View getFragmentView() {
		return LayoutInflater.from(getActivity()).inflate(
				R.layout.demo_fragment4, null);
	}

	@Override
	protected void initFragmentWidgets(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		textView.setText("fragment4");

		titleLayout.configTitle("右边有图标").configRightIcon(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				//默认＋
			}
		}).configRightIcon(R.drawable.dg_widgets_title_right_icon2, new View.OnClickListener() {
			@Override
			public void onClick(View v) {

			}
		});
	}
}
