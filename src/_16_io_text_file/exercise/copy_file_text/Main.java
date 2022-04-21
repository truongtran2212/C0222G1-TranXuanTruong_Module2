package _16_io_text_file.exercise.copy_file_text;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WriteAndReadFile writeAndReadFile = new WriteAndReadFile();
        String string = "";
        try{
            List<String> stringList = writeAndReadFile.readFile("src\\_16_io_text_file\\exercise\\copy_file_text\\source_file.txt");
            for (String item: stringList) {

                 string += item +"\n";

            }
            writeAndReadFile.writeFile("src\\_16_io_text_file\\exercise\\copy_file_text\\target_file.txt",string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
