package GithubActivityTracker;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public class Parser{
    public static class Repo{
        String name;
    }

    public static class GithubEvent{
        String type;
        Repo repo;
    }

    public static String EventParser(String response)throws IOException,InterruptedException,URISyntaxException{
       Gson gson = new Gson();
       GithubEvent[] events = gson.fromJson(response,GithubEvent[].class);

       StringBuilder sb = new StringBuilder();
       
       for (GithubEvent e: events){

        if(("PushEvent").equals(e.type)){
            sb.append("Pushed to ").append(e.repo.name).append("\n");
        }
        else if(("IssueCommentEvent").equals(e.type)){
            sb.append("Issued comment ").append(e.repo.name).append("\n");
        }
        else if(("WatchEvent").equals(e.type)){
            sb.append("Starred ").append(e.repo.name).append("\n");
        }
       }
       if(sb.length() == 0){
        return "No recent activity for this user";
       }else{
        return sb.toString();
       }

    }

}