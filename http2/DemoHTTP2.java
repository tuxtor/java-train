import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class DemoHTTP2 {
    public static void main(String[] args) throws Exception{
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://swapi.co/api/starships/9"))
            .GET()
            .build();
 
        HttpResponse<String> response = HttpClient.newHttpClient()
            .send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}