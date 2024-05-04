import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Consulta {

    public Monedas buscaDeMoneda(String code1, String code2) {


        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/8bf2c6d22a6e609fc8a9113f/pair/" + code1 + "/" + code2);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        //seccion del codigo que pueda generar exception
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("no encontramos esa moneda");

        }
    }
}