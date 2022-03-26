import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileInput = "INPUT.txt";
        String fileOutput = "OUTPUT.txt";
        String[] list = Files.lines(Paths.get(fileInput)).reduce("", String::concat).split(" ");
        String result = String.valueOf(GetValue(list[0], list[1]));
        Files.write(Paths.get(fileOutput), Collections.singleton(result));
    }

    public static int GetValue(String a, String b){
        int n1 = Integer.parseInt(String.valueOf(a.charAt(a.length()-1)));
        int n2 = Integer.parseInt(String.valueOf(b));
        String result = String.valueOf((int)(Math.pow(n1,n2)));
        return Integer.parseInt(String.valueOf(result.charAt(result.length()-1)));
    }
}