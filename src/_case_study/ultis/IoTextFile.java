package _case_study.ultis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IoTextFile {

    public static void writeToCSVFile(String pathFile, String line) {
        File file = new File(pathFile);
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    // phương thức đọc từ file csv xuống list string
    public static List<String> readFromCSVFile(String pathFile) {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
