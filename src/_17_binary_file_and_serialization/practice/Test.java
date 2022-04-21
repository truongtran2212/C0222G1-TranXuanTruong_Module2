package _17_binary_file_and_serialization.practice;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(
                    new FileOutputStream("src\\_17_binary_file_and_serialization\\practice\\Test.dat"));
            dataOutputStream.writeUTF("John");
            dataOutputStream.writeDouble(70.34);


            dataOutputStream.writeUTF("Trường");
            dataOutputStream.writeInt(30);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(
                    new FileInputStream("src\\_17_binary_file_and_serialization\\practice\\Test.dat"));
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readDouble());
            System.out.println(dataInputStream.readUTF() + " " + dataInputStream.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
