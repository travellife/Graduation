package com.lsj.alarm.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 开机启动广播接收类
 * 
 * @author Lion
 * 
 */
public class BootCompleteReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String action = intent.getAction();
		if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
			/**
			 * 启动一个Service，遍历闹钟数据库，重新设置闹钟
			 */
		}
	}

}
