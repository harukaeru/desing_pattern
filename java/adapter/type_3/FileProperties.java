import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
    private Properties properties;

    public FileProperties() {
        this.properties = new Properties();
    }

    public void readFromFile(String filename) throws IOException {
        this.properties.load(new FileInputStream(filename));
    }

    public void writeToFile(String filename) throws IOException {
        this.properties.store(new FileOutputStream(filename), "comment");
    }

    public void setValue(String key, String value) {
        this.properties.setProperty(key, value);
    }

    public String getValue(String key) {
        return this.properties.getProperty(key);
    }
}
