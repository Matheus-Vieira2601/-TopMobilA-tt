package br.unicamp.topmobil;

//Consertar as importações da classe/biblioteca retrofit
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface RotasUsuarios
{
    // retorna a lista com todos usuários
    @GET("/usuario/get")
    Call<List<Service>> getUser();

    // retorna usuário com seu nome
    @GET("/usuario/getEmail/{email}")
    Call<Service> selecionarEmail(@Path("email") String email);

    // insere um novo usuário
    @POST("/cadastrocliente")
    Call<Service> inserirCliente(@Body Service service);

    // altera os dados de um usuário
    @PUT("/usuario/put/{email}")
    Call<Service> alterarUsuario(@Path("email") String email, @Body Service service);

    //deletar um animal
    @DELETE("/api/usuario/delete/{id}")
    Call<Service> excluirUsuario(@Path("id") String id);
}