package info.programmador;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author programmador.info
 */
public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            ClassLoader classLoader = Main.class.getClassLoader();
            InputStream stream = classLoader.getResourceAsStream("application_settings.properties");
            properties.load(stream);
            String buildType = properties.getProperty("build_type");
            System.out.println("Application build type: " + buildType);
        } catch (IOException e) {
            System.out.println("Properties not loaded");
        }
    }
}
