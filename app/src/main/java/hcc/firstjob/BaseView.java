package hcc.firstjob;

import android.view.View;

/**
 * Created by Administrator on 2017-02-08.
 */

public interface BaseView<T> {
	//为view设置Presenter
	void setPresenter(T presenter);
	//初始化界面控件
	void initViews(View view);
}
