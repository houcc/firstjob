package hcc.firstjob.app;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by Administrator on 2017-02-08.
 */

public class app extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		// 0-->day theme 1-->night theme
		if (getSharedPreferences("user_settings",MODE_PRIVATE).getInt("theme",0)==0){
			AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
		}else{
			AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
		}
	}
}
