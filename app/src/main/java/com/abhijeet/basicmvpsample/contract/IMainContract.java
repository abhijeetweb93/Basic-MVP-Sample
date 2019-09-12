package com.abhijeet.basicmvpsample.contract;

import com.abhijeet.basicmvpsample.data_model.Data;

import java.util.List;

public interface IMainContract {
    interface View {
        void initView();

        void getDataSuccess(List<Data> data);

        void getDataError(String errorMsg);
    }

    interface Presenter {
        void getData();
    }

    interface Model {
        List<Data>  getData();
    }
}
