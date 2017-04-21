package demo.liaoli.www.mvp.presenter;

import android.text.TextUtils;

import demo.liaoli.www.mvp.manager.IDataManager;
import demo.liaoli.www.mvp.view.MainView;

/**
 * Created by Administrator on 2017/4/21 0021.
 */

public class MainPresenter {

    private MainView mainView;
    private IDataManager dataManager;

    public MainPresenter(IDataManager dataManager) {
        this.dataManager = dataManager;
    }

    public MainPresenter addTaskListener(MainView mainView){
        this.mainView = mainView;
        return this;
    }

    public void getData(){
        String data = dataManager.getDataFromCache();

        if(TextUtils.isEmpty(data)){
            data = dataManager.getDataFromRemote();

        }
        mainView.updateUI(data);
    }


}
