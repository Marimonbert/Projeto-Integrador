package com.example.fastmeal.Conect;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class FastConect extends AsyncTask<Void, Void, StringBuilder> {


    @Override
    protected StringBuilder doInBackground(Void... voids) {

        StringBuilder stringBuilder = new StringBuilder();

        try {
            URL url = new URL("http://3.19.60.179/fastmeal/cardapio/json");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-type", "application/json");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);
            connection.setConnectTimeout(5000);

            connection.connect();

            Scanner scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.next());
            }


        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringBuilder;
    }
}


