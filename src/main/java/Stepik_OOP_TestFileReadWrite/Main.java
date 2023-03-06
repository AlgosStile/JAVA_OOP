package Stepik_OOP_TestFileReadWrite;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

// FileReader and FileWriter  *************************//
public class Main {

   public static void main(String[] args) {

        System.out.println("Start read and write!");
        //тут инициализируем str
        String str = "Тут будет текст текстовый текстище текстовое: Cools";//инициализировали str
        File file = null;
        try { //обварачиваем в функцию try {...} catch (Exception e) {e.printStackTrace(),
            // (см. ниже) - эта функция ловит любоую ошибку

            file = new File("./Java_OOP/src/main/java/Stepik_OOP_TestFileReadWrite/Test_3.txt");
           // file.createNewFile(); - метод используется для создания .txt файла(использованить не обязательно)
            FileWriter writer = new FileWriter(file);//открываем этот файл
            writer.write(str);//метод - воспользуемся полиморфизмом и выше инициализируем str
            writer.flush();//метод в случае буферизации все данные успешно записываются в: writer.write(str);
            writer.close();//выход из чтения

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //читаем символы из нашего файла
            char[] mas = new char[1000];
            FileReader reader = new FileReader(file);
            reader.read(mas);

            //посимвольно через цикл распечатываем символы из файла
            for (int i = 0; i < 1000; i++) {
                if (mas[i] == 0) {
                    break;
                }
                System.out.print(mas[i]);
            }
            reader.close();


        } catch (Exception e) {

        }


    }

}



