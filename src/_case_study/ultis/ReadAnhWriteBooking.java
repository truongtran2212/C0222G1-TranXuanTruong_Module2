package _case_study.ultis;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReadAnhWriteBooking {
    public static Set<String[]> readFile(String path) {
        File file = new File(path);
        Set<String[]> list = new LinkedHashSet<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] array = line.split(",");
                list.add(array);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String path, String listLine) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            bufferedWriter.write(listLine);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

