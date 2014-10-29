package com.lsj.alarm;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * 闹钟初始界面
 * 
 * @author Lion
 * 
 */
public class AlarmHomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
