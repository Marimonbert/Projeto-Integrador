package com.example.fastmeal.Conect;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.example.fastmeal.MainActivity;
import com.example.fastmeal.R;

import java.util.concurrent.ExecutionException;

public class conexao extends MainActivity {
    Button btnComidas;

    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComidas = (Button) findViewById(R.id.btnComidas);

        try {
            stringBuilder = new FastConect().execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        btnComidas.setText(stringBuilder.toString().trim());
    }
}




