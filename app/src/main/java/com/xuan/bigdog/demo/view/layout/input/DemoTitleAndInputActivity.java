package com.xuan.bigdog.demo.view.layout.input;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.xuan.bigapple.lib.ioc.InjectView;
import com.xuan.bigapple.lib.ioc.app.BPActivity;
import com.xuan.bigapple.lib.utils.ToastUtils;
import com.xuan.bigdog.lib.widgets.edittext.DGCanClearEditText;
import com.xuan.bigdog.lib.widgets.title.DGTitleLayout;
import com.xuan.bigdog.R;

/**
 * 输入界面demo
 * 
 * @author xuan
 * @version $Revision: 1.0 $, $Date: 2015-4-14 下午6:49:29 $
 */
public class DemoTitleAndInputActivity extends BPActivity {
	@InjectView(R.id.titleLayout)
	private DGTitleLayout titleLayout;

	@InjectView(R.id.canClearEditText)
	private DGCanClearEditText canClearEditText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.demo_title_and_input);

		titleLayout.configTitle("测试标题")
				.configReturn(new View.OnClickListener() {
					@Override
					public void onClick(View view) {
					}
				}).configRightText("点我啊", new View.OnClickListener() {
					@Override
					public void onClick(View view) {
						ToastUtils.displayTextShort("你真的点我啊");
					}
				});

		canClearEditText.getInputEt().setGravity(Gravity.TOP);
	}

}
