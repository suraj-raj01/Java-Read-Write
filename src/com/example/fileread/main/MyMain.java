package com.example.fileread.main;
import com.example.fileread.io.ReadFileData;
import java.io.IOException;
public class MyMain {
    public static void main(String[] args) throws IOException {
        String pathname = "Resources/sample.txt";
        ReadFileData readFileData = new ReadFileData();
        try {
            System.out.println(readFileData.readData(pathname));
        }catch (IOException e){
            System.err.println("IOException"+e.getMessage());
        }
    }
}
