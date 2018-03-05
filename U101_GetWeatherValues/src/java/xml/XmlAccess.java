package xml;

import beans.CurrentRoot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlAccess {

    private static XmlAccess instance;
    private static final String APP_ID = "&appid=14f48d4c1f37ab85b7edbfd0b2933100";

    private XmlAccess() {

    }

    public static XmlAccess getInstance() {
        if (instance == null) {
            instance = new XmlAccess();
        }
        return instance;
    }

    public CurrentRoot getRootFromCityName(String cityName) {
        CurrentRoot root = null;
        try {
            URL url = new URL("http://api.openweathermap.org/data/2.5/weather?q=" + cityName + APP_ID);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            JAXBContext context = JAXBContext.newInstance(CurrentRoot.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            root = (CurrentRoot)unmarshaller.unmarshal(connection.getInputStream());
            
            connection.disconnect();

        } catch (Exception ex) {
            Logger.getLogger(XmlAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return root;
    }
    public static void main(String[] args) {
        XmlAccess.getInstance().getRootFromCityName("London");
    }
}
