package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static Properties getProp() throws IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("..\\java_workspace\\src\\test\\java\\util\\data.properties");
        props.load(file);
        return props;

    }

    public String getKey(String key) throws IOException {
        Properties prop = getProp();
        return prop.getProperty(key);

    }

}
