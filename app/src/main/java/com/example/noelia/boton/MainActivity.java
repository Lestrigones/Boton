package com.example.noelia.boton;

import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;


//import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void cambiarMensaje(View v){
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        Date fechaActual = Calendar.getInstance().getTime();

        String s = formato.format (fechaActual);
        texto.setText(String.format ("Boton presionado: %s", s));
    }
}
