package demo.liaoli.www.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import demo.liaoli.www.mvp.manager.DataManagerImpl;
import demo.liaoli.www.mvp.presenter.MainPresenter;
import demo.liaoli.www.mvp.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {
    private MainPresenter mainPresenter;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(new DataManagerImpl());
        mainPresenter.addTaskListener(this);
        tv = (TextView) findViewById(R.id.tv);
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.getData();
            }
        });
    }

    @Override
    public void updateUI(String data) {
        tv.setText(data);
    }
}
