package com.example.deber1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btguardar(View view) {

        TextView cedula = findViewById(R.id.txtcedula);
        EditText nombre = findViewById(R.id.txtnombre);
        EditText fecha = findViewById(R.id.txtfecha);
        EditText ciudad = findViewById(R.id.txtciudad);
        RadioButton genero = findViewById(R.id.rbmasculino);
        EditText correo = findViewById(R.id.txtcorreo);
        EditText telefono = findViewById(R.id.txttelefono);

        String name, ciu, tel , date, email, ced, gen;
        name = nombre.getText().toString();
        ciu = ciudad.getText().toString();
        tel = telefono.getText().toString();
        date = fecha.getText().toString();
        email = correo.getText().toString();
        ced = cedula.getText().toString();
        gen = genero.isChecked() ? "Masculino" : "Femenino";

        Intent dates = new Intent(MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("CEDULA", ced);
        b.putString("NOMBRE", name);
        b.putString("FECHA", date);
        b.putString("CIUDAD", ciu);
        b.putString("CORREO", email);
        b.putString("GENERO", gen);
        b.putString("TELEFONO", tel);
        dates.putExtras(b);
        startActivity(dates);

    }

    public void btborrar(View view) {
        EditText nombre = findViewById(R.id.txtnombre);
        EditText ciudad = findViewById(R.id.txtciudad);
        EditText fecha = findViewById(R.id.txtfecha);
        EditText telefono = findViewById(R.id.txttelefono);
        EditText correo =findViewById(R.id.txtcorreo);
        EditText cedula = findViewById(R.id.txtcedula);
        RadioButton genero =  findViewById(R.id.rbmasculino);
        nombre.setText("");
        ciudad.setText("");
        fecha.setText("");
        telefono.setText("");
        correo.setText("");
        cedula.setText("");

    }
}