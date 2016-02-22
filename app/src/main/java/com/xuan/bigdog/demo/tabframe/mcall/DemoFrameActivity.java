package com.xuan.bigdog.demo.tabframe.mcall;

import android.os.Bundle;

import com.xuan.bigdog.lib.tabframe.mcall.DGFrameActivity;

/**
 * Demo例子
 * 
 * @author xuan
 * @version $Revision: 1.0 $, $Date: 2015-4-14 上午11:19:13 $
 */
public class DemoFrameActivity extends DGFrameActivity {

	@Override
	protected Class<?>[] initFragment() {
		return new Class<?>[] { Fragment1.class, Fragment2.class,Fragment3.class,
				Fragment4.class };
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setUnreadNum(0, 0);
		setUnreadNum(1, 1);
		setUnreadNum(2, 11);
		setUnreadNum(3, 999);
	}

}
