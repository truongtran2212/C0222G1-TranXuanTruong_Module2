package _17_binary_file_and_serialization.exercise;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InputAndOutputStream {

    public static void writeFile(String path, List<Product> product) throws IOException {
        File file = new File(path);

        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(product);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            objectOutputStream.close();
        }
    }

    public static List<Product> readFile(String path) {
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
            List<Product> productList = new ArrayList<>();
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
        }
        return productList;
    }
}
