package com.ifsc.contaclicks;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Integer i = 0;

    EditText edpeso, edaltura;
    TextView tvresultado;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        edpeso = findViewById(R.id.edpeso);
        edaltura = findViewById(R.id.edaltura);
        tvresultado = findViewById(R.id.tvresultadoimc);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        //Define um tratamento para o click do button
        buttonCalcular.setOnClickListener(v -> {

            //calcular o IMC
            //Recuperar os dados de peso e altura

            double peso, altura, imc;

            peso = Double.parseDouble(edpeso.getText().toString());
            altura = Double.parseDouble(edaltura.getText().toString());

            imc = peso / (altura * altura);

            tvresultado.setText(Double.toString(imc));

        });

    }
}