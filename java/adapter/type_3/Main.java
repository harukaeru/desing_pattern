import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("options.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("appended_options.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
