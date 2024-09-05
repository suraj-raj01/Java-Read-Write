package com.example.fileread.io;
import java.io.*;

public class ReadFileData {
    // return a StringBuilder which contains file data
    public StringBuffer readData(String fileName) throws FileNotFoundException, IOException {
        StringBuffer fileData = new StringBuffer();
        //reading the file data
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        //read line by line
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while (line!=null) {
            line = bufferedReader.readLine();
            if(line!=null){
            fileData.append(line);
            }
        }
        return  fileData;
    }
}
