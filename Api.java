package GithubActivityTracker;
import java.io.IOException;
import java.net.Authenticator;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.time.Duration;

public class Api {
    public static HttpResponse<String> makeRequest(String get_info) throws IOException,InterruptedException,URISyntaxException{
        
        HttpRequest req = HttpRequest.newBuilder()
        .uri(new URI(get_info))
        .version(HttpClient.Version.HTTP_2)
        .GET()
        .build(); 
        
        HttpClient client = HttpClient.newBuilder()
        .version(Version.HTTP_2)
        .followRedirects(Redirect.NORMAL)
        .connectTimeout(Duration.ofSeconds(20))
        .build();
        
        HttpResponse<String> response = client.send(req,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

        return response;

    }


}
