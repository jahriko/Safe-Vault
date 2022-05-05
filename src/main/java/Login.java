import com.formdev.flatlaf.FlatLightLaf;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Login {
    
    public static void main(String[] args) throws IOException, ParseException {
        
        FlatLightLaf.setup();
        
        JSONParser parser = new JSONParser();
        JSONObject obj = (JSONObject) parser.parse(new FileReader("login.json"));
        
        if (obj.get("password").toString().isBlank()) {
            new SetPassword(null, true).setVisible(true);
        }
        else {
            new EnterPassword(null, true).setVisible(true);
        }
        
    }

}