// class Main {
//
//    public static void main(String[] args) {
//        int age_1 = 100, age_2 = 200, age_3 = 300;
//        String age_4 = " ";
//        System.out.println(age_1);
//        System.out.println(age_2);
//        System.out.println(age_3);
//        System.out.print(age_1 + " " + age_2 + " " + age_3);
//    }
//}
//public static void main(String[] args) {
//    int age_1 = 2021;
//    double age_2 = 3.1415;
//    String age_3 = "Java";
//    String arg = String.valueOf(5 < 10);
//    System.out.println(age_1);
//    System.out.println(age_2);
//    System.out.println(age_3);
//    System.out.print(arg);
//}
// }
//import java.util.Scanner;
//
//class MySolution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println(st);
//        System.out.println(st);
//        System.out.println(st);
//    }
//}

//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt(), y = sc.nextInt();
//        System.out.println(x + y);
//        sc.close();
//
//    }
//
//}
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble(), y = sc.nextDouble();
//        System.out.println(x*y);
//        System.out.println((x+y)*2);
//
//    }
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        double z = sc.nextDouble();
//        double p = (x+y+z) / 3;
//        System.out.println(p);
//
//
//    }
//}
/*ООО "Круче Гугла" нанимает Java-разработчиков. Месячный бюджет на зарплату разработчиков - X,
 зарплата одного разработчика - Y. Выведите на печать в одной строке через пробел,
 какое максимальное количество разработчиков компания сможет нанять, и какое количество денег
 из ежемесячного бюджета останется неиспользованным.
*/
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int myOoo = x / y;
//        int oooSum = myOoo * y;
//        int e = x - oooSum;
//        System.out.print(myOoo + " " + e);
//    }
//}

//import java.util.Scanner;

//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int ch = (x % 86400) / 3600; //получаем часы 1 day = 86400 second (24 * 3600)
//        int min = ((x % 86400) % 3600) / 60; // тут получаем минуты 1 minute = 60 seconds
//        int sec = ((x % 86400) % 3600) % 60; // тут получаем секудны
//        System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", ch, min, sec);
//        //System.out.format позволяет задать шаблон строки и тут же передать в нее аргументы.
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        int x = 1, y = 5, z = 0;
//        --y; //y = 4
//        x = 4 + y++; // x = 9
//        z += x--; // z=0+8 = 8
//        x = y + z; // 5+8 = 13
//        System.out.print(++x);// тут добавляем 13+1 так как перед
//        // x стоят знаки ++ то есть ++x
//        // ответ будет 14
//    }
//}
//змените программу таким образом, чтобы она выводила
//на печать числа 11, 12, 13. Используйте инкремент.
//class Main {
//    public static void main(String[] args) {
//        int x = 10;
//        ++x;
//        int y = 11;
//        ++y;
//        int z = 12;
//        ++z;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//    }
//}
//На вход подаётся натуральное число n. Выведите на печать
//числа n - 1, n, n + 1 в одну строку, через пробел (см. образец).

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int x = n;
//        --x;
//        int y = n;
//        int z = n+1;
//        System.out.print(x + " " + y + " " + z);
//
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = ((x+1) / (y-1)) + ((y+1) / (x-1));
//        System.out.print(z);
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        String myVar;
//        myVar = "Hello, World!";
//                System.out.print(myVar);
//    }
//}
//На вход подаётся строка. Выведите её длину.
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //ввод данных
//        String str = sc.nextLine(); //ввод данных
//        int len = str.length(); //определяем длину строки
//        System.out.println(len); //выводим длину строки
//    }
//}
//Вывести 1 и последний элеимент строки
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str = sc.nextLine(); // ввод данных
//        char letter_0 = str.charAt(0); //вывели 1 элемент строки
//        char letter_1 = str.charAt(str.length() - 1); //вывели последний элемент строки
//        System.out.println(letter_0 + " " + letter_1);
//        //вывели 1 и последний элементы строки
//
//    }
//}
//На вход подаётся строка текста, затем слово. Выведите на печать true, если слово содержится в
//строке, и false - если не содержится.
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str_1 = sc.nextLine();// ввод данных
//        String str_2 = sc.nextLine();
//        System.out.println(str_1.contains(str_2));
//    }
//}

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str_1 = sc.nextLine();// ввод данных
//        System.out.println(str_1.toLowerCase());
//        System.out.println(str_1.toUpperCase());
//    }
//}


/*На вход подаётся строка, а затем целое число n > 0.
        Выведите n- й символ с начала строки.*/

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str = sc.nextLine();// ввод данных строки
//        int n = sc.nextInt(); // ввод числа n
//        char c = str.charAt(n-1);
//        System.out.println(c);
//    }
//}

/*На вход подаются две строки текста.
Выведите на печать true, если строки совпадают, и false - если нет.*/
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str_1 = sc.nextLine();// ввод данных
//        String str_2 = sc.nextLine();
//        System.out.println(str_1.contains(str_2));
//    }
//}
/*На вход подаются две строки. Объедините их в предложение, а на следующей
строке выведите общее количество знаков в предложении.*/

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String str_1 = sc.nextLine();// ввод данных
//        String str_2 = sc.nextLine();
//        System.out.println(str_1 + " " + str_2);
//        System.out.println(str_1.length() + str_2.length()+1);
//    }
//}
//На вход подаются два числа. Выведите сначала их сумму, а на
// следующей строке переведите
// числа в строковый формат и сложите в строковом формате.
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        Integer str_1 = sc.nextInt();// ввод данных
//        Integer str_2 = sc.nextInt();
//        System.out.println(str_1 + str_2);
//        String str_3 = str_1.toString();
//        String str_4 = str_2.toString();
//        System.out.println(str_3 + str_4);
//    }
//}
/*На вход подаются два слова на одной строке, разделённые пробелом. Выведите true,
если они идут по алфавиту, и false, если нет.
Гарантируется, что слова начинаются с разных букв.*/

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String x = sc.nextLine();// ввод данных
//        System.out.print(x.charAt(0) < x.charAt(x.indexOf(' ') + 1));
//    }
//}
/*Напишите программу, находящую корни квадратного уравнения: ax^2+bx+c = 0
На вход подаются целые числа a, b и c. Выведите сумму и произведение
корней в одной строке, через пробел.
Примечание 1. Гарантируется, что существует два различных корня.*/

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int year = sc.nextInt();// ввод данных
//        System.out.println(((year/4 ) - (year/100) + (year/400)));
//    }
//}

//
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt();// ввод данных
//        int y = sc.nextInt();// ввод данных
//        int z = x + y;
//        int q = x - y;
//        System.out.println("Сложение:" + " " + x + " " + "+" + " " + y + " " + "=" + " " + z);
//        System.out.println("Вычитание:" + " " + x + " " + "-" + " " + y + " " + "=" + " " + q);
//    }
//}
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String x = sc.nextLine();
//        String y = sc.nextLine();// ввод данных
//        if (x.length() >= y.length()) { //длина строки length
//            System.out.println("Махатма");
//        } else {
//            System.out.println("Джавахарлал");
//        }
//    }
//}
/*
На первой строке подаётся пароль, хранящийся в базе данных, на второй - пароль, введённый пользователем.
 Выведите на печать фразу "Access is granted", если пользователь ввёл верный пароль, и "Access is denied" - если нет.
 */
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String x = sc.nextLine();
//        String y = sc.nextLine();// ввод данных
//        if (x.equals(y)) { //сравниваем строковые данные одно с другим
//            System.out.println("Access is granted");
//        } else {
//            System.out.println("Access is denied");
//        }
//    }
//}

/*Выведите на печать наибольшее из трёх целых чисел.*/
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt();// ввод данных
//        int y = sc.nextInt();// ввод данных
//        int z = sc.nextInt();// ввод данных
//        int max = x;
//        if (y > max) {
//            max = y;
//        }
//        if (z > max) {
//            max = z;
//        }
//        System.out.println(max);
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        double x = sc.nextDouble();// ввод данных
//        double y = sc.nextDouble();// ввод данных
//        if (x < y) {
//            System.out.println("Бой продолжается!");
//        } else {
//            System.out.println("Холифилд - чемпион!");
//        }
//    }
//}
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt();
//        System.out.println((x > 2 && x < 6) ? "YES" : "NO");
//
//    }
//}
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt();
//        if (x % 7 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt();
//        if (x % 7 == 0 && x % 5 != 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        String s = "glass table";
//        boolean b = !s.contains(val) || !val.equals("tab");
//        System.out.println(b);
//    }
//}
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        String s = sc.nextLine(), y = sc.nextLine();
//        if (s.contains(y) || s.length() > 20) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt(), y = sc.nextInt();
//        if ((x + y) % 2 == 0 && (x * y) % 2 != 0) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }
//}
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //сканер для ввода данных
//        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
//        System.out.print(x % 2 + y % 2 + z % 2 == 1); //таким образом проверяем
//        // что в выражении есть 2 четных числа и 1 не четное
//    }
//}


//На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
//Выведите true,если эти числа составляют валидную дату, и false - в противном случае.

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        int mouth = sc.nextInt();
//        int year = sc.nextInt();
//        if ((day >= 1 && day <= 31) && (mouth >= 1 && mouth <= 12) && year >= 0) {
//            if (day <= 31 && (mouth == 1 || mouth == 3 || mouth == 5 || mouth == 7 || mouth == 8 || mouth == 10 || mouth == 12)) {
//                System.out.println("true");
//            } else if (day == 29 && mouth != 2) {
//                System.out.println("true");
//            } else if (day <= 30 && (mouth == 4 || mouth == 6 || mouth == 9 || mouth == 11)) {
//                System.out.println("true");
//            } else if (day == 29 && mouth == 2 && (year % 4 == 0 || year % 400 == 0) && (year % 100 != 0)) {
//                System.out.println("true");
//            } else System.out.println("false");
//        } else System.out.println("false");
//    }
//}

/*
На вход подаются три слова на одной строке, разделённые пробелом. Выведите их в алфавитном порядке.
Гарантируется, что слова начинаются с разных букв.
*/

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        String str3 = sc.next();
//        char a = str1.charAt(0); // Ищем первые буквы с charAt в str1
//        char b = str2.charAt(0); // Ищем первые буквы с charAt в str2
//        char c = str3.charAt(0); // Ищем первые буквы с charAt в str3
//        // Сравниваем в условии какой символ больше а какой меньше
//        if ((a < b) && (a < c) && (b < c)) {System.out.println(str1 +"\n" + str2 + "\n" + str3);}
//        if ((b < a) && (a < c) && (b < c)) {System.out.println(str2 + "\n" + str1 + "\n" + str3);}
//        if ((c < a) && (a < b) && (c < b)) {System.out.println(str3 + "\n" + str1 + "\n" + str2);}
//        if ((a < b) && (a < c) && (c < b)) {System.out.println(str1 + "\n" + str3 + "\n" + str2);}
//        if ((b < c) && (b < a) && (c < a)) {System.out.println(str2 + "\n" + str3 + "\n" + str1);}
//        if ((c < b) && (c < a) && (b < a)) {System.out.println(str3 + "\n" + str2 + "\n" + str1);}
//
//    }
//}

//class Main {
//    public static void main(String[] args) {
//        int x = 3;
//        if (x >15)
//            System.out.println("пиу-пиу");
//        if (x <= 25)
//            System.out.println("Ура, заработало!!!");
//    }
//}

//import java.util.Scanner;
//class Example {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
//        int s =(a + b + c)-(Math.max(Math.max(a,b),c) + Math.min(Math.min(a,b),c));
//
//        System.out.print(s);
//
//    }
//}



/*ООО "Круче Гугла" наняло трёх разработчиков. Внезапно разработчики узнали,
что их зарплаты различаются. Разработчики решили объявить забастовку,
если разница максимальной и минимальной зарплаты превысит определённый уровень.
Определите, грозит ли ООО "Круче Гугла" забастовка.
Формат ввода:
В первой строке - зарплаты разработчиков через пробел, три целых числа.
Во второй строке - разница, при превышении которой будет объявлена забастовка. */

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
//        int d = sc.nextInt();
//        if ((c - b > d) || (b - c > d) || (c - a > d) || (a - c > d) || (b - a > d) || (a - b > d))
//            System.out.println("Ура, бастуем!");
//        else {
//            System.out.println("За работу, Солнце ещё высоко");
//        }
//
//    }
//}



/* Задача повышенной сложности

На числовой прямой даны два отрезка, заданных парами целых чисел: a1 b1 и a2 b2
Напишите программу, которая находит их пересечение.
Если пересечение - отрезок, необходимо вывести два числа (границы отрезка),
если единственная точка - единственное
число (точку), если пересечения нет - вывести фразу "Пересечения нет" (без кавычек). */

//import java.util.Scanner;
//class Main {
//    public static void main (String [] args) {
//        Scanner sc = new Scanner(System.in);
//        int a1 = sc.nextInt();
//        int b1 = sc.nextInt();
//        int a2 = sc.nextInt();
//        int b2 = sc.nextInt();
//        if ((b1 < a2) || (b2 < a1)) {
//            System.out.print ("Пересечения нет");
//
//        } else if (b2 > b1) {
//
//            if ((a1 < a2) && (b1 > a2)) {
//                System.out.print (a2 + " " + b1); } else if ((a2 < a1) || (a1 == a2)) {
//                System.out.print (a1 + " " + b1); } else if (b1 == a2)  {
//                System.out.print (b1); }
//        } else if (b1 > b2) {
//            if ((a1 < a2) || (a1 == a2)) {
//                System.out.print (a2 + " " + b2); } else if ((a2 < a1) && (b2 > a1)) {
//                System.out.print (a1 + " " + b2); } else if (b2 == a1) {
//                System.out.print (a1); }
//
//        } else if (b2 == b1) {
//            if ((a2 == a1) || (a1 > a2)) {
//                System.out.print (a1 + " " + b1); } else if (a2 > a1) {
//                System.out.print (a2 + " " + b1); }
//        }
//        sc.close();
//    }
//}


/*
На вход подаётся три целых числа. Выведите максимальное чётное из них.
Если чётных чисел нет, выведите "Чётных чисел нет".
*/

//import java.util.Scanner;
//class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt(); int b = input.nextInt(); int c = input.nextInt();
//        int min = Math.min(Math.min(a, b), c);
//        int max = Math.max(Math.max(a, b), c);
//        int w = (a+b+c)-min-max;
//        if (max%2==0) {
//            System.out.println(max);
//        }
//        else if (w%2==0) {
//            System.out.println(w);
//        }
//        else if (min%2==0) {
//            System.out.println(min);
//        }
//        else System.out.println("Чётных чисел нет");
//    }
//}
//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//        int a = 11;
//        int b = 12;
//        int c = 42;
//
//        switch (a) {
//            case 40:
//                System.out.println(b);
//                break;
//            default:
//                System.out.println(c);
//        }
//    }
//}
/*
Реализуйте простой справочник по командам Java. На вход подаётся команда,
по которой необходима справка (ограничимся тремя командами).
В соответствии с этим выведите текст:
Ввод: System.out.println()
Вывод: Это команда вывода на печать
Ввод: if
Вывод: Это условный оператор
Ввод: else
Вывод: Это альтернативная конструкция условного оператора
*/
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//
//        switch (a) {
//            case "System.out.println()":
//                System.out.println("Это команда вывода на печать");
//                break;
//            case "if":
//                System.out.println("Это условный оператор");
//                break;
//            case "else":
//                System.out.println("Это альтернативная конструкция условного оператора");
//                break;
//            default:
//                System.out.println("Раздел в разработке");
//        }
//    }
//}

//import java.util.Scanner;
//
//class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        if ((a > 99) && (a < 1000)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }
//}
//На вход подается строка, а затем слово. Выведите true,
// если слово содержится в строке, и false - если нет,
//без учёта регистров.

//import java.util.Scanner;
//class MyCode {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine(), b = sc.nextLine().toLowerCase(); sc.close();
//        System.out.println(a.toLowerCase().contains(b.toLowerCase()));
//    }
//}

//На вход подаётся целое трёхзначное число, а затем цифра. Выведите true, если эта цифра является средней в числе
//(разряд десятков), и false - если нет. Если введённое число не является трёхзначным,
//выведите "error".

//import java.util.Scanner;
//class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        System.out.println((a < b) ? "<" : (a > b) ? ">" : "=");
//    }
//}

//Выведите время года по введённому номеру месяца.
//Если введён ошибочный номер месяца, выведите "error".
//
//import java.util.Scanner;
//
//class Test {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        System.out.println(a == 12 || a == 1 || a == 2 ? "Зима" : a == 3 || a == 4 || a == 5 ? "Весна" : a == 6 || a == 7 || a == 8 ? "Лето" : a == 9 || a == 10 || a == 11 ? "Осень" : "error");
//    }
//}

//import java.util.Scanner;

//class Main {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double x = input.nextDouble();
//        double y = input.nextDouble();
//        if (x >= 0 && y <= 2 - x * x && y >= 0 || x < 0 && y >= x && y <= 2 - x * x) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//Богатейшие люди Земли решили создать тайное мировое правительство  ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶
//̶не̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶ ̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶. В кабинет совещаний могут войти только те, кто указан в специальном списке:
// Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс. Чтобы получить допуск, нужно сказать фразу-приветствие.
// Если фраза-приветствие содержит имя из списка, проход разрешается. Если же нет - проход блокируется.
//На ввод подаётся фраза-приветствие. Выведите "Добро пожаловать!", если имя есть в списке, и "Здесь никого нет,
// Вы ошиблись дверью" - если нет.

//import java.util.Scanner;
//
//class MyClass {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String x = s.nextLine();
//        String a = ("Джефф Безос"), b = ("Илон Маск"), c = ("Марк Цукерберг"), d = ("Билл Гейтс");
//        if (x.contains(a) || x.contains(b) || x.contains(c) || x.contains(d)) {
//            System.out.print("Добро пожаловать!");
//        } else {
//            System.out.print("Здесь никого нет, Вы ошиблись дверью");
//        }
//    }
//}
//На вход подаётся слово. Выведите словами количество букв в этом слове.
//Если букв больше пяти - выведите "Длинное слово".

//import java.util.Scanner;
//class MyClass {
//    public static void main(String[] args) {
//        Scanner s = new Scanner (System.in);
//        String x = s.nextLine();
//        int y = x.length();
//        switch (y) {
//            case 0:
//                System.out.println("Ноль букв");
//                break;
//            case 1:
//                System.out.println("Одна буква");
//                break;
//            case 2:
//                System.out.println("Две буквы");
//                break;
//            case 3:
//                System.out.println("Три буквы");
//                break;
//            case 4:
//                System.out.println("Четыре буквы");
//                break;
//            case 5:
//                System.out.println("Пять букв");
//                break;
//            default:
//                System.out.println("Длинное слово");
//        }
//    }
//}

//На вход подаётся натуральное число n.
//Выведите на печать числа от единицы до введённого числа включительно,
//каждое на новой строке.

//import java.util.Scanner;
//class Mainss {
//    public static void main(String[] args) {
//        Scanner vv = new Scanner(System.in);
//        int x = vv.nextInt(), y = 1;
//        while (x>=y) {
//            System.out.println(y++);
//        }
//    }
//}


//import java.util.Scanner;
//class MyClass {
//    public static void main(String[] args) {
//        Scanner s = new Scanner (System.in);
//        int x = s.nextInt(), y = 1;
//        while (x >= y*y) {
//            System.out.print(y*y + " ");
//            ++y; //c каждой итерацией цикла значение переменной y увеличивается на единицу
//            //в этом случае на 2, так как начальное значение y = 1
//        }
//    }
//}

//import java.util.Scanner;
//
//class MyClass {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in); // вводим данные
//        int sum = 0; //
//        int b = 0;  //
//        while ((b = s.nextInt()) != 0) { //пока b = тому что ввели
//            sum += b;                   //с клавиатуры и это значение не
//        }                               //равно 0
//        System.out.println(sum);
//    }
//}

//import java.util.Scanner;
//
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = 0;
//
//        while (sc.hasNext()) {
//            sc.next();
//            x++;
//        }
//        System.out.println(x);
//    }
//}
//class MyTest {
//    public static void main(String[] args) {
//        int x = 1;
//        do {
//            System.out.println(x);
//            x++;
//        }
//        while (x < 6);
//    }
//}
//На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число,
//не делящееся на 11 (это число не входит в последовательность).
//Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.

//import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = 0;
//        int y = 0;
//        int col = 0;
//        while((x = sc.nextInt()) % 11 == 0) {
//            col++;
//            if ( x % 3 == 0) y += x;
//        }
//        System.out.print(col + "\n" + y);
//
//    }
//}
//На вход подаётся последовательность чисел от нуля до 10, являющихся рейтингами фильма,
//выставленными зрителями. Если входящее число отрицательное или больше 10, последовательность прерывается.
//Посчитайте среднюю оценку фильма

//import java.util.Scanner;
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner x = new Scanner(System.in);
//        double t = 0;
//        double y = 0;
//        double p = 0;
//        while (x.hasNext()) {
//            y = x.nextDouble();
//            t++;
//            if (y >= 0 && y <= 10) {
//                p += y;
//            } else {
//                System.out.print(p / (t - 1));
//                break;
//            }
//        }
//    }
//}


//На вход подаётся натуральное число.
//Выведите на печать составляющие его цифры в обратном порядке.
//
//import java.util.Scanner;
//
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner scr = new Scanner(System.in);
//        String num = scr.nextLine();
//        int l = num.length() - 1;
//        do {
//            System.out.print(num.charAt(l));
//            l--;
//        } while (l >= 0);
//    }
//}
//На вход подаётся строка с двумя буквами, а затем - строка, состоящая из слов.
//Выведите на печать все слова,
//которые начинаются на буквы, идущие по алфавиту между буквами с первой строки (включительно).
//Вывести слова необходимо в том же порядке, в котором они подаются на вход.
//import java.util.Scanner;
//class MyProg {
//    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in); //вводим данные с клавиатуры
//        String n = a.next().toLowerCase(); // перводим строки к нижнему регистру
//        int nach = n.charAt(0); // Возвращает значение char по указанному индексу. Индекс находится в диапазоне от 0 до length() - 1
//        String k = a.next().toLowerCase(); // перводим строки к нижнему регистру
//        int kon = k.charAt(0);
//        while (a.hasNext()){
//            String x = a.next();
//            String y = x.toLowerCase();
//            int letter = y.charAt(0);
//            if (letter >= nach && letter <=kon || letter >= kon && letter <=nach){
//                System.out.println(x);
//            }
//        }
//    }
//}
//На вход подаётся натуральное число n. Выведите на печать в одной строке через пробел все числа от 1 до n включительно,
//которые одновременно без остатка делятся на 2 и на 3.
//Если таких чисел в диапазоне нет, выведите "Таких чисел нет".
//
//import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 6; i <= n; i = i + 6) {
//            System.out.print(i+" ");
//        }
//        if (n < 6) {
//            System.out.print("Таких чисел нет");
//        }
//        sc.close();
//    }
//}

//import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for (int i = 1; i <= m; i++)
//        System.out.print(n + " ");
//    }
//}
//import java.util.Scanner;
//class Example {
//    public static void main(String[] args) {
//        Scanner vv = new Scanner(System.in);
//        int a = vv.nextInt(), b = vv.nextInt();
//        for (int i=0; i<a; i++) {
//            for (int j=0; j<b; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        vv.close();
//    }
//}

//import java.util.Scanner;
//
//class Example {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + (j == i ? "\n" : " "));
//            }
//        }
//    }
//}

//Предположим, что мы работаем с последовательностью такого вида:
//1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, ... .
//Выведите на печать n (n > 0) членов данной последовательности в одну строку через пробел.

//import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        sc.close();
//        int count=0;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                count++;
//                if(count>n){break;} System.out.print(i + " ");
//            }
//        }
//    }
//}

//import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        double z = Math.pow(x, y);
//        System.out.println(z);
//    }
//}

//Решите задачу, которой учителя мучают многие поколения школьников.
// Что больше, E^pi или pi^E ?
//В ответе выведите соответствующий знак (<, > или =).

//import static java.lang.Math.E;
//import static java.lang.Math.PI;
//
//import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//        double b = Math.pow(Math.PI, Math.E);
//        double a = Math.pow(Math.E, Math.PI);
//        System.out.println((a > b) ? ">" : (a < b) ? "<" : "=");
//    }
//}


//Дан угол \large\alphaα градусов. Выведите значение угла в радианах.
//
//import java.util.Scanner;
//class MyProgram {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextInt();
//        double y = Math.toRadians(x);
//        System.out.println(y);
//
//
//    }
//}

//import java.util.Scanner;
//
//class MyNumber {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double x = Math.toRadians(sc.nextInt());
//        System.out.print (Math.sin(x) + Math.cos(x));
//    }
//}
//class MyNumber {
//    public static void main(String[] args) {
//        int a = 5;
//        if (a >= 5) {
//            System.out.print(a);
//        }
//    }
//}