package com.example.fastmeal.conexao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.fastmeal.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class tratando extends AppCompatActivity {

    private static final String TAG = "tratando";

    StringBuilder stringBuilder;

    IinterConect IinterConect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardapios);

        IinterConect = Conexao.getClient().create(IinterConect.class);


    }

    public void getCardapio(View view) {

        Call<List<cardapio>> call = IinterConect.getComidas();
        call.enqueue(new Callback<List<cardapio>>() {
            @Override
            public void onResponse(Call<List<cardapio>> call, Response<List<cardapio>> response) {
                Log.e(TAG, "onResponse: " +  response.body());
            }

            @Override
            public void onFailure(Call<List<cardapio>> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage() );
            }
        });



    }

    public void getcardapioUsingRouteParameter(View view) {

        Call<cardapio> todoCall = IinterConect.getcardapio(3);
        todoCall.enqueue(new Callback<cardapio>() {
            @Override
            public void onResponse(Call<cardapio> call, Response<cardapio> response) {
                Log.e(TAG, "onResponse: " + response.body() );
            }

            @Override
            public void onFailure(Call<cardapio> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getLocalizedMessage() );
            }
        });

    }

    public void getcardapioUsingQuery(View view) {

        Call<List<cardapio>> listCall = IinterConect.getcardapioUsingQuery("maria", 02,"não sei" , 100);
        listCall.enqueue(new Callback<List<cardapio>>() {
            @Override
            public void onResponse(Call<List<cardapio>> call, Response<List<cardapio>> response) {
                Log.e(TAG, "onResponse: " + response.body() );
            }

            @Override
            public void onFailure(Call<List<cardapio>> call, Throwable t) {

            }
        });

    }

    public void postcardapio(View view) {

        cardapio Cardapio = new cardapio(03, "Maria",02 , "gelada", 0);

        Call<cardapio> todoPostCall = IinterConect.postcardapio(Cardapio);
        todoPostCall.enqueue(new Callback<cardapio>() {
            @Override
            public void onResponse(Call<cardapio> call, Response<cardapio> response) {
                Log.e(TAG, "onResponse: " + response.body() );
            }

            @Override
            public void onFailure(Call<cardapio> call, Throwable t) {

            }
        });

    }
}

