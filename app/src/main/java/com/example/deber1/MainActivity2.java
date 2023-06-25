package com.example.deber1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Datos = (TextView)findViewById(R.id.txtmostrar);
        Bundle b  = this.getIntent().getExtras();
        Datos.setText("Se registro correctamente el contacto con los datos: "+"\n"
                +"Nombre: "+b.getString("NOMBRE")+"\n"
                +"Ciudad: "+b.getString("CIUDAD")+"\n"
                +"Telefono: "+b.getString("TELEFONO")+"\n"
                +"Fecha: "+b.getString("FECHA")+"\n"
                +"Correo: "+b.getString("CORREO")+"\n"
                +"Cedula: "+b.getString("CEDULA")+"\n"
                +"Genero: "+b.getString("GENERO"));
    }
}