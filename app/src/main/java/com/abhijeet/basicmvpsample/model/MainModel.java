package com.abhijeet.basicmvpsample.model;

import com.abhijeet.basicmvpsample.contract.IMainContract;
import com.abhijeet.basicmvpsample.data_model.Data;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements IMainContract.Model {
    @Override
    public List<Data> getData() {
        List<Data> data = new ArrayList<>();
        data.add(new Data("Abhijeet", 26));
        data.add(new Data("Anuj", 25));
        data.add(new Data("rahul", 28));


        return data;
    }
}
