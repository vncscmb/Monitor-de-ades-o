package negocio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoDicas {
    private static final String API_URL = "https://api.adviceslip.com/advice";
    private static final int POS_INICIAL_ADVICE = 10;

    public String obterDicaDoDia() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(
                    request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return extrairConselho(response.body());
            }
        } catch (Exception e) {
            // Se a internet falhar, o sistema não quebra
        }
        return "Beba água e mantenha o foco no seu tratamento!";
    }

    private String extrairConselho(String json) {
        try {
            int inicio = json.indexOf("\"advice\":\"") + POS_INICIAL_ADVICE;
            int fim = json.indexOf("\"}", inicio);
            if (inicio > POS_INICIAL_ADVICE && fim > inicio) {
                return json.substring(inicio, fim);
            }
        } catch (Exception e) {
            // Fallback caso o formato mude
        }
        return "Cuide bem da sua saúde hoje!";
    }
}