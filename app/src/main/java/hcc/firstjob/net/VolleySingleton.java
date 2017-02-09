package hcc.firstjob.net;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 2017-02-08.
 */

public class VolleySingleton {
	private static VolleySingleton mVolleySingleton;
	private RequestQueue mRequestQueue;
	private VolleySingleton(Context context){
		mRequestQueue= Volley.newRequestQueue(context.getApplicationContext());
	}
	public static VolleySingleton getVolleySingleton(Context context){
		if (mVolleySingleton==null){
			synchronized (VolleySingleton.class){
				mVolleySingleton=new VolleySingleton(context);

			}
		}
		return mVolleySingleton;
	}
    public RequestQueue getRequestQueue(){
		return mRequestQueue;
	}
	public <T> void addToRequestQueue(Request<T> req){
		mRequestQueue.add(req);
	}
}
