package com.lsj.alarm.receiver;

import com.lsj.alarm.util.AppConstant;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * 闹钟事件接收广播
 * 
 * @author Lion
 * 
 */
public class AlarmReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		String action = intent.getAction();
		if (action.equals(AppConstant.Action.ALARM_RECEIVER)) {
			/**
			 * 启动闹钟，从数据库中获取相关信息，打开一个显示闹钟的Activity
			 */
		}
	}

}
