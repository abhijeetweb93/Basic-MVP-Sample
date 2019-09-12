package com.abhijeet.basicmvpsample.view;


import android.os.Bundle;
import android.widget.TextView;

import com.abhijeet.basicmvpsample.R;
import com.abhijeet.basicmvpsample.base.BaseActivity;
import com.abhijeet.basicmvpsample.contract.IMainContract;
import com.abhijeet.basicmvpsample.data_model.Data;
import com.abhijeet.basicmvpsample.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends BaseActivity implements IMainContract.View {

    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);

        presenter.getData();
    }

    @Override
    public void initView() {

    }

    @Override
    public void getDataSuccess(List<Data> data) {
        if (data != null && data.size() > 0) {
            String s = "";
            for (Data info : data) {
                s = s + "\n Name: " + info.getName() + " Age: " + info.getAge();

            }
            ((TextView) findViewById(R.id.tvHello)).setText(s);
        }

    }

    @Override
    public void getDataError(String errorMsg) {

    }
}
