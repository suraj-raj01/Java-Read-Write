package Read;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        String pathName = "Resources/sample.txt";
        File file = new File(pathName);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            int data = 0;
            while(data!=-1){
                data = fileReader.read();
                char character = (char)data;
                Thread.sleep(5);
                System.out.print(character);
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File not Found Exceptions");
        }catch (IOException e){
            System.out.println("IOException");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
