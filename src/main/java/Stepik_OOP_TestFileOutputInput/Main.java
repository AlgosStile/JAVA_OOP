package Stepik_OOP_TestFileOutputInput;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    // FileOutputStream and FileInputStream *************************//
    public static void main(String[] args) {

        System.out.println("Start read and write: FileOutputStream and FileInputStream!");

        try (FileOutputStream fileOutputStream = new FileOutputStream("./Java_OOP/src/main/java/Stepik_OOP_TestFileOutputInput/Test_1.txt")) {
            String str = "FileOutputStream and FileInputStream!";
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();

        }
        try (FileInputStream fileInputStream = new FileInputStream("./Java_OOP/src/main/java/Stepik_OOP_TestFileOutputInput/Test_1.txt")) {
        int i;
            while((i = fileInputStream.read()) != -1) {
                System.out.print((char)i);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}







