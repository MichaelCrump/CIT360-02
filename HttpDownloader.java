package HttpUrlConnection;
 
import java.io.IOException;
 
public class HttpDownloader {
 
    public static void main(String[] args) {
        String fileURL = "https://github.com/MichaelCrump/CIT360-02/blob/master/HttpUrlConnection.java";
        String saveDir = "C:/Users";
        try {
            HttpUrlConnection.downloadFile(fileURL, saveDir);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
