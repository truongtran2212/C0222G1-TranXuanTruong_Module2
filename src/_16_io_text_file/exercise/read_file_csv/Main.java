package _16_io_text_file.exercise.read_file_csv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        ReadCountry readCountry = new ReadCountry();

        Country country;
        try {
            List<String[]> list = readCountry.readFile("src\\_16_io_text_file\\exercise\\read_file_csv\\file.csv");
            for (String[] item : list) {
               country = new Country(Integer.parseInt(item[0]), item[1], item[2]);
                countryList.add(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Country item : countryList) {
            System.out.println(item);
        }
    }
}
