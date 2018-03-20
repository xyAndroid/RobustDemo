package com.xy.lib;


import android.content.Context;
import android.util.Log;

import com.meituan.robust.Patch;
import com.meituan.robust.PatchExecutor;
import com.meituan.robust.RobustCallBack;
import com.meituan.robust.patch.annotaion.Modify;
import com.xy.lib.robust.PatchManipulateImp;

import java.util.List;

public class Test {
	@Modify
	public static String getTeString() {
		String str = "";
        for (int i=0;i<20;i++){
            str= str+i+"good  day 2018 bbbbbbbbbbbbb";
        }
		return str;
	}

	public static void runRobust(Context context) {
		new PatchExecutor(context, new PatchManipulateImp(), new Callback()).start();
	}
	static class Callback implements RobustCallBack {

		@Override
		public void onPatchListFetched(boolean result, boolean isNet, List<Patch> patches) {
			Log.i("robust","robust arrived in onPatchListFetched");
		}

		@Override
		public void onPatchFetched(boolean result, boolean isNet, Patch patch) {
			Log.i("robust","robust arrived in onPatchFetched");
		}

		@Override
		public void onPatchApplied(boolean result, Patch patch) {
			Log.i("robust","robust arrived in onPatchApplied");

		}

		@Override
		public void logNotify(String log, String where) {
			Log.i("robust"," robust arrived in logNotify " + where);
		}

		@Override
		public void exceptionNotify(Throwable throwable, String where) {
			throwable.printStackTrace();
			Log.i("robust"," robust arrived in exceptionNotify " + where);
		}
	}


}
