package com.example.fastmeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class cardapios extends AppCompatActivity {

    Button btnComidas;
    Button btnSobremesas;
    Button btnPetiscos;
    Button btnBebidas;
    Button btnSanduiches;
    Button btnPizzas;

    private String Comidas;
    private String Sobremesas;
    private String Petiscos;
    private String Bebidas;
    private String Sanduiches;
    private String Pizzas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapios);

        btnComidas = (Button) findViewById(R.id.btnComidas);

        btnComidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Petiscos.class);
                startActivity(i);
            }
        });


        btnSobremesas = (Button) findViewById(R.id.btnSobremesas);

        btnSobremesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Sobremesas.class);
                startActivity(i);
            }
        });


        btnComidas = (Button) findViewById(R.id.btnComidas);

        btnComidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Comidas.class);
                startActivity(i);
            }
        });


        btnPetiscos = (Button) findViewById(R.id.btnPetiscos);

        btnPetiscos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Petiscos.class);
                startActivity(i);
            }
        });


        btnBebidas = (Button) findViewById(R.id.btnBebidas);

        btnBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Bebidas.class);
                startActivity(i);
            }
        });


        btnSanduiches = (Button) findViewById(R.id.btnSanduiches);

        btnSanduiches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Sanduiches.class);
                startActivity(i);
            }
        });


        btnPizzas = (Button) findViewById(R.id.btnPizzas);

        btnPizzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cardapios.this,Pizzas.class);
                startActivity(i);

            }
        });



    }
}

