package demo.liaoli.www.mvp.manager;

/**
 * Created by Administrator on 2017/4/21 0021.
 */

public interface IDataManager {
    String getDataFromCache();

    String getDataFromRemote();
}
