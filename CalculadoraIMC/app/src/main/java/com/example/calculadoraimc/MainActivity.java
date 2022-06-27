package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String mensagem="";
    EditText editPeso;
    EditText editAltura;
    TextView txtResultado;
    Button btnCalcularIMC;
    RadioButton Homem,Mulher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPeso = findViewById(R.id.txtPeso);
        editAltura = findViewById(R.id.txtAltura);
        btnCalcularIMC = findViewById(R.id.btnCalcularIMC);
        txtResultado = findViewById(R.id.txtResultado);
        Homem = findViewById(R.id.btnHomem);
        Mulher = findViewById(R.id.btnMulher);
    }
    public void CalcularIMC(View view) {
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double result = peso/(altura*altura);
        txtResultado.setText(Double.valueOf(result).toString());
        if (Homem.isChecked()) {
            if(result < 20){
                txtResultado.setText("Abaixo do normal");
            } else if(result >= 20 && result <= 24.9) {
                txtResultado.setText("Normal");
            } else if(result >= 25 && result <= 29.9){
                txtResultado.setText("Obesidade leve");
            } else if(result >= 30 && result <= 39.9) {
                txtResultado.setText("Obesidade Moderada");
            } else if(result >= 43) {
                txtResultado.setText("Obesidade Mórbida");
            }
        } else if(Mulher.isChecked() == false && Mulher.isChecked() == true) {
            if(result < 19){
                txtResultado.setText("Abaixo do normal");
            } else if(result >= 19 && result <= 23.9) {
                txtResultado.setText("Normal");
            } else if(result >= 24 && result <= 28.9){
                txtResultado.setText("Obesidade leve");
            } else if(result >= 29 && result <= 38.9) {
                txtResultado.setText("Obesidade Moderada");
            } else if(result >= 39) {
                txtResultado.setText("Obesidade Mórbida");
            }

        }
    }
}
