package com.abhijeet.basicmvpsample.presenter;

import com.abhijeet.basicmvpsample.contract.IMainContract;
import com.abhijeet.basicmvpsample.model.MainModel;

public class MainPresenter implements IMainContract.Presenter {

    IMainContract.View view;
    IMainContract.Model model = new MainModel();

    public MainPresenter(IMainContract.View view) {
        this.view = view;
    }

    @Override
    public void getData() {
        try {
            view.getDataSuccess(model.getData());
        } catch (Exception e) {
            view.getDataError(e.getMessage());
        }
    }
}
