package jp.ac.demekin.passkin;

import android.app.Activity;
import android.os.Bundle;


public class LockActivity extends Activity {
	public static int appStatus = 0;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO 自動生成されたメソッド・スタブ
			super.onCreate(savedInstanceState);
			appStatus = 0;
			
		}

		@Override
		protected void onStart() {
			// TODO 自動生成されたメソッド・スタブ
			super.onStart();
		}
		@Override
		protected void onResume() {
			// TODO 自動生成されたメソッド・スタブ
			super.onResume();
			if(appStatus != 2){
				return;
				
			}
			
		}
		@Override
		protected void onUserLeaveHint() {
			// TODO 自動生成されたメソッド・スタブ
			super.onUserLeaveHint();
			if(appStatus == 3){
				return;
			}
			appStatus = getBoolean(APP_LOCK_FLAG);
			
		}	

}
