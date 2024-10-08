package Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyMain {
    public static void main(String[] args) {
        String pathName = "Resources/sample.txt";
        File file = new File(pathName);
        FileReader fileReader;
        try{
            // opening the stream
            fileReader = new FileReader(file);
            //read
            int data = 0;
            while(data!=-1){
                data = fileReader.read();
                char character = (char)data;
                System.out.print(character);
            }
            // closing the stream
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        catch (IOException e){
            System.out.println("IOException");
        }
    }
}
