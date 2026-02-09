package GithubActivityTracker;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            Main myApp = new Main();
            String summary = myApp.get_info();
            System.out.println(summary);
        }
        public String get_info(){
            System.out.println("Enter the username you want to scan activity of:");
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();
            if(username.isEmpty()){
                System.out.println("no username");
                return "Error: Username cannot be blank";
            }
            String final_url = "https://api.github.com/users/"+username+"/events";
            String finalResult = "Nopo activity found";
            try {
               HttpResponse<String> result =  Api.makeRequest(final_url);
               finalResult = Parser.EventParser(result.body());
            //    System.out.println("The result is" +finalResult);
            //    System.out.println(result.statusCode());
            } catch (IOException | URISyntaxException | InterruptedException e) {

                System.out.println("ERROR");
               
            }
            return finalResult;
            }

}

