package Stepik_OOP_TestBufferedReaderWriter;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//BufferedReader and BufferedWriter *************************//

public class Main {
    public static void main(String[] args) {
        System.out.println("Start read and wtite: BufferedReader and BufferedWriter!");

//        String fileName = "./Java_OOP/src/main/java/Stepik_OOP_TestBufferedReaderWriter/Test_input.txt";
        String inputFileName = "./Java_OOP/src/main/java/Stepik_OOP_TestBufferedReaderWriter/Test1_input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))){//открыли наш файл

            String line;//объявляем стринговую переменную.

            while((line = reader.readLine()) != null) {//считываем построчно содержимое файла (метод readLine),
                //как только дойдем до конца файла получим null и выйдем из цикла while
                System.out.println(line);
            }
            // метод try автоматически закрывает все ресурсы,
            //поэтому принудительные команды завершения/выха, не нужны.

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        String outputFileName = "./Java_OOP/src/main/java/Stepik_OOP_TestBufferedReaderWriter/Test2_output.txt";
//        String str = "Hello, Oleg. Welcome";
        String[] mas = {"red, green, blue + black"};

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName, true))) {//true в этом методе означает перезапись

            for(String str: mas) {//запись цикла for по новому, что он делает:
                //пробегается по элемантам массива mas от нуля до конца массива, вытаскивает очередной элемент
                //в нашем случае это строка и сохраняет его в переменной str

                writer.write(str+ "\n");//добавляем "\n"- перенос строки в файле Test2_output.txt
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

