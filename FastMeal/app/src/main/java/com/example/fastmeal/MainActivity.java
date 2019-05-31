package com.example.fastmeal;



import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class MainActivity extends AppCompatActivity {
    Button btnScan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnScan = (Button) findViewById(R.id.btnScanner);


        final Activity activity = this;

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(activity);

                integrator.setDesiredBarcodeFormats (IntentIntegrator.QR_CODE_TYPES);
                integrator.setCameraId(0);

                integrator.initiateScan();


            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents()!= null){
                   if(result.getContents().toString().equals("http://3.19.60.179/fastmeal/cardapio/json")) {
                Intent intent = new Intent (this,PaginaInicial.class);
                        startActivity(intent);


            } else {
                alert("Leitura Cancelada");

            }
            }else{
                alert("falha na leitura");
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);

        }
    }


    private void alert(String msg) {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();


    }


}






