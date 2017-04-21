package demo.liaoli.www.mvp.manager;

/**
 * Created by Administrator on 2017/4/21 0021.
 */

public class DataManagerImpl implements IDataManager {
    @Override
    public String getDataFromCache() {
        return "data from cache";
    }

    @Override
    public String getDataFromRemote() {
        return "data from remote";
    }
}
