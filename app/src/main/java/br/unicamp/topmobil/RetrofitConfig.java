package br.unicamp.topmobil;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    // Conexão com a API
    private static final String BASE_URL = "http://177.220.18.27:5228/cadastrocliente/"; // Traz todos os usuários cadastrados
    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance()
    {
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}