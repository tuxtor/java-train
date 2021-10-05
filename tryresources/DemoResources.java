import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoResources{
    public static void main(String[] args) 
    throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader("langs.txt"));
        try(reader){
            System.out.println(reader.readLine());
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}