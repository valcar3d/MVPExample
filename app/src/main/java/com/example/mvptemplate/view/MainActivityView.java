package com.example.mvptemplate.view;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvptemplate.R;
import com.example.mvptemplate.interfaces.AlCuadrado;
import com.example.mvptemplate.presenter.AlCuadradoPresenter;

public class MainActivityView extends AppCompatActivity implements AlCuadrado.View {
    TextView tvResultado;
    EditText etNumero;
    private AlCuadrado.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tvResultado = findViewById(R.id.tvResultado);
        etNumero = findViewById(R.id.etNumero);
        presenter = new AlCuadradoPresenter(this);
    }

    public void calcular(View view) {
        presenter.alCuadrado(etNumero.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvResultado.setText(result);
    }

    @Override
    public void showError(String error) {
        tvResultado.setText(error);
    }
}