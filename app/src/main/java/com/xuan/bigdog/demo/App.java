package com.xuan.bigdog.demo;

import android.app.Application;

import com.xuan.bigapple.lib.Bigapple;
import com.xuan.bigdog.lib.BigDog;

public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		Bigapple.init(this);
		BigDog.getInstance().init(this);

		initTitle();
	}

	private void initTitle(){
	}

}
