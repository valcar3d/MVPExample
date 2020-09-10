package com.example.mvptemplate.model;

import com.example.mvptemplate.interfaces.AlCuadrado;
import com.example.mvptemplate.presenter.AlCuadradoPresenter;

public class AlCuadradoModel implements AlCuadrado.Model {

    private AlCuadrado.Presenter presenter;
    private double resultado;

    public AlCuadradoModel(AlCuadradoPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void alCuadrado(String data) {
        if (data.equals("")) {
            presenter.showError("Tienes que poner un número");
        } else {
            resultado = Double.parseDouble(data) * Double.parseDouble(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
