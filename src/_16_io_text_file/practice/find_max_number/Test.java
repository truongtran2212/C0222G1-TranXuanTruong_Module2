package _16_io_text_file.practice.find_max_number;

import java.util.List;

import static _16_io_text_file.practice.find_max_number.ReadAndWriteFile.findMax;

public class Test {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\_16_io_text_file\\practice\\find_max_number\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\_16_io_text_file\\practice\\find_max_number\\result.txt", maxValue);
    }
}
