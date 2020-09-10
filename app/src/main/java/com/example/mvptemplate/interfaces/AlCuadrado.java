package com.example.mvptemplate.interfaces;

public interface AlCuadrado {
    interface View {
        void showResult(String result);
        void showError(String error);
    }

    interface Presenter {
        void showResult(String result);
        void alCuadrado(String data);
        void showError(String error);
    }

    interface Model {
        void alCuadrado(String data);
    }
}
