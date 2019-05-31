package com.example.fastmeal.conexao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IinterConect {

        @GET("/api/get-cardapio/")
        Call<List<cardapio>> getComidas();

        @GET("/cardapios/{id}")
        Call<cardapio> getcardapio(@Path("id") int id);

        @GET("/cardapios")
        Call<List<cardapio>> getcardapioUsingQuery(@Query("nome") String nome, @Query("categoria")
                int id_categoria, @Query("descrição") String descrição , double valor);

        @POST("/cardapios")
        Call<cardapio> postcardapio(@Body cardapio Cardapio);

    }



