package com.example.mvptemplate.presenter;

import com.example.mvptemplate.interfaces.AlCuadrado;
import com.example.mvptemplate.model.AlCuadradoModel;

public class AlCuadradoPresenter implements AlCuadrado.Presenter {
    private AlCuadrado.View view;
    private AlCuadrado.Model model;

    public AlCuadradoPresenter(AlCuadrado.View view) {
        this.view = view;
        model = new AlCuadradoModel(this);
    }

    @Override
    public void showResult(String result) {
        if (view != null) {
            view.showResult(result);
        }
    }

    @Override
    public void alCuadrado(String data) {

        if (view != null) {
            model.alCuadrado(data);
        }
    }

    @Override
    public void showError(String error) {
        if (view != null) {
            view.showError(error);
        }
    }
}
