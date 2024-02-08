package com.example.aplicacion2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView NombreUsuario;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NombreUsuario = (TextView) findViewById(R.id.usuario);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);


        btn1.setOnClickListener(new.View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                NombreUsuario.setText("Presioné boton uno");
            }
        });

        btn2.setOnClickListener(new.View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                NombreUsuario.setText("Presioné boton dos");
            }
        });

    }

    public double calcularArea(int l1,int l2){
        return l1*l2;
    }
}