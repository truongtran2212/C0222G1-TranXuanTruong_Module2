package _16_io_text_file.exercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadCountry {
    public List<String[]> readFile(String path) throws IOException{

        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        List<String[]> list = new ArrayList<>();
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null && !line.equals("")){
                String[] arr = line.split(",");
                list.add(arr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
            bufferedReader.close();
        }
        return list;
    }
}
