package com.example.fastmeal;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class PaginaInicial extends Activity {
    Button BtnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_inicial);





    BtnEntrar = (Button) findViewById(R.id.BtnEntrar);

        BtnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            Intent i = new Intent(PaginaInicial.this,cardapios.class);
            startActivity(i);
        }
    });


}
}