package hcc.firstjob;

/**
 * Created by Administrator on 2017-02-08.
 */

public interface BasePresenter {
	//获取数据并改变界面显示，调用时机为fragment的OnResume()方法中
	void start();
}
