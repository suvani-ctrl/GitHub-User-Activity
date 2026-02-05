package GithubActivityTracker;
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
            }
            String final_url = "https://api.github.com/users/"+username;
            try {
               HttpResponse<String> result =  Api.makeRequest(final_url);
               System.out.println("The result is" +result);
               System.out.println(result.body());
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("CRASH CRASH");
                e.printStackTrace();
            }
            return final_url;
            }

}

