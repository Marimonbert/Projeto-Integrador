package com.example.fastmeal;

import android.os.Bundle;
import android.app.Activity;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class cardapios extends MainActivity {
    TextView textView;

    StringBuilder stringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapios);


        textView = (TextView) findViewById(R.id.edtDados);

        try {
            stringBuilder = new FastConect().execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        textView.setText(stringBuilder.toString().trim());
    }

}
