package Stepik_OOP_Nursery;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;//подключаем бибилиотечный класс для считывания кода

public class Nursery {
    public static final String fileArrayJSON = "\\C:\\Users\\doct2\\Desktop\\Java_OOP\\Java_OOP\\src\\main\\java\\Stepik_OOP_Nursery\\fileAnimalsJSON.json";
    public static Scanner in;

    public static void addnewDog(int i, Dog[] dogs) {
//        in = new Scanner(System.in);
        String breed = " ", size = " ", color = " ";
        int age = 0;
        try {
            System.out.println("Enter breed");
            breed = in.nextLine();
            System.out.println("Enter size");
            size = in.nextLine();
            System.out.println("Enter age");
            age = in.nextInt();
            if (age < 0) {
                throw new NegativeAgeException(age);
            }

        } catch (InputMismatchException e) {//ловим ошибку
            e.printStackTrace();
            System.out.println("Error: InputMismatchException occured!");

        } catch (NegativeAgeException e) {
            e.printStackTrace();
            System.out.println("Error: Exception occured!");
            age = 0;
        } catch (Exception e) {
            System.out.println("Error: Exception occured!");
        }

        in.nextLine(); //in.nextLine();//используем этот метод  in.nextLine() как заглушку
        // для корректного считывания метода
        //age = in.nextInt() - который находится выше.
        System.out.println("Enter color");
        color = in.nextLine();
        dogs[i] = new Dog(breed, size, age, color, "dog");

        JSONObject jsonObject = new JSONObject();//объявляем и подключаем пакет JSON
        jsonObject.put("type", "dog");
        jsonObject.put("breed", breed);
        jsonObject.put("size", size);
        jsonObject.put("age", age);
        jsonObject.put("color", color);

        File file = new File(fileArrayJSON);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }

        JSONArray animalsList;
        Object odj;
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileArrayJSON)) {//открываем файл который может хранить записи
            if (file.length() > 2) {//если размер файла больше 2 байт,
                //значит есть хотя бы 1 JSON запись и считываем всё!
                Object obj = jsonParser.parse(reader);//парсим эти записи
                animalsList = (JSONArray) obj;
            } else {
                animalsList = new JSONArray();//если в файле нет ничего, то запись массива будет пустой!

            }
            animalsList.add(jsonObject);

            try (FileWriter writer = new FileWriter(fileArrayJSON)) {
                writer.write(animalsList.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showAllDogs(int size, Dog[] dogs) {//showAllDogs - метод который распечатывает
        for (int i = 0; i < size; i++) {                  //какие собаки есть в нашем питомнике
            System.out.println((i + 1) + ") " + dogs[i].getBreed() + " " + dogs[i].getSize() + " " + dogs[i].getAge() + " " + dogs[i].getColor());
            System.out.println((i + 1) + ") количество дней(секунд):" + dogs[i].sit());
        }
    }

    public static void editDogFields(int count, Dog[] dogs) throws NegativeArraySizeException {

        int i = 0;
        System.out.println("Enter number of dog:");
        i = in.nextInt();
        in.nextLine();
//        i++;
        if (i >= 0 && i < count) {
            System.out.println("OLD data:" + (i + 1) + ") " + dogs[i].getBreed() + " " + dogs[i].getSize() + " " + dogs[i].getAge() + " " + dogs[i].getColor());
            String breed, size, color;
            int age = 0;

            System.out.println("Enter new size");
            size = in.nextLine();
            dogs[i].setSize(size);

            try {
                System.out.println("Enter new age");
                age = in.nextInt();
                if (age < 0) {
                    throw new NegativeArraySizeException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: InputMismatchException occured!");
                age = 0;
            } catch (NegativeArraySizeException e) {
                e.printStackTrace();
                System.out.println("Error: arithmetic!");
                age = 0;
            }


            in.nextLine();//используем этот метод  in.nextLine() как заглушку для корректного считывания метода
            //age = in.nextInt() - который находится выше.
            dogs[i].setAge(age);


        } else {
            System.out.println("Error: number of dog incorrect");
        }

    }

    public static int readJSONFromFile(Dog[] dogs) {

        int count = 0;
        File file = new File(fileArrayJSON);
        if (!file.exists() || file.length() < 2) {
            return 0;
        }

        JSONArray animalsList;
        Object odj;
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader(fileArrayJSON)) {//открываем файл который может хранить записи
                Object obj = jsonParser.parse(reader);//парсим эти записи
                animalsList = (JSONArray) obj;
                count = animalsList.size();
                if(count > 10) {
                    count = 10;
                }


            for (int i = 0; i < count; i++) {
                JSONObject object = (JSONObject) animalsList.get(i);

                dogs[i] = new Dog((String)object.get("breed"), (String)object.get("size"), (int)(long)object.get("age"), (String)object.get("color"), (String)object.get("type"));
            }
            } catch (Exception e){
                e.printStackTrace();
            }

            return count;
        }

        public static void main (String[]args){
            System.out.println("Питомник для собак: введите команду в консоли!");
            in = new Scanner(System.in);//считывает данные с консоли
            String command; //команда которую будем вводить в консоли

            Dog[] dogs = new Dog[10]; //объявляем массив для хранения наших объектов!Место под ссылки
            int count = 0;

            count = readJSONFromFile(dogs);

            if(count == -1) {
                System.out.println("ERROR: nursery is full!");
                return;
            }

            while (true) {//в цикле считываем команды от пользователей: add, list, exit
                //add - добавляет нову собаку в питомник, list - выводит список тех собак
                //которые уже добавлены, exit - команда выхода.

                System.out.println("Enter command: add, list or exit or edit ?");

                command = in.nextLine();//считывает строку символ которую мы введем в консоли
                switch (command) {//switch case проверяет значение строчек, условий от пользователя
                    case "add":
                        System.out.println("Add new dog");
                        if (count < 10) {
                            addnewDog(count, dogs);
                            count++;
                            System.out.println("New dog was added");
                        } else {
                            System.out.println("Nursery is full");
                        }

                        break; //после проверки завершаем командой break
                    case "list":
                        System.out.println("Show all dogs");
                        if (count > 0) {
                            showAllDogs(count, dogs);
                        } else {
                            System.out.println("Nursery is empty");
                        }
                        break;
                    case "edit":
                        System.out.println("Edit data for some dog");
                        if (count > 0) {
                            editDogFields(count, dogs);
                        } else {
                            System.out.println("Nursery is empty");
                        }
                        break;
                    case "exit":
                        in.close();//in.close() - этот метод закрывает поток
                        return;
                    default:
                        System.out.println("Unknown command");

                }

            }
        }
    }





        /*  Dog mastif = new Dog();
        //создаем 1 объект и назначаем функции полей
        mastif.breed = "Neapolitan Mastiff";
        mastif.size = "large";
        mastif.age = 5;
        mastif.color = "black";

        System.out.println("First dog:"+mastif.breed+", "+mastif.age+", "+ mastif.color);

        //Создаем еще 1 объект нашего класса Dog
        Dog maltese = new Dog("Maltese", "small", 2, "white");
        System.out.println("Second dog:"+maltese.breed+" "+maltese.age+" "+maltese.color);

    */
