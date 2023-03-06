package Stepik_OOP_DZ_3;

class Dog {
//создаем поля класса и инициализируем для дальнейшего использования
    String breed;
    String size;
    int age;
    float weight;


    //Создаем конструктор класс
    Dog(String breed, String size, int age) {

        this.breed = breed;
        this.size = size;
        this.age = age;


    }
    //Создаем еще конструктор класса и добавляем поле weight
    Dog(String breed, String size, int age, float weight) {

        this.breed = breed;
        this.size = size;
        this.age = age;
        this.weight = weight;

    }
    //Добавляем в класс Dog метод getInfo без параметров ()
    void getInfo() {
        System.out.println("breed:" + breed + ", " + "size:" + size + ", " + "age:" + age);
    }


    //Метод eat подсчитывает калории, полученные из еды в белках, жирах и углеводах.
    int eat(int carbohydrates, int squirrels, int fats) {

        return 630;
    }


    //Добавляем метод checkCalories с одним параметром (int calories)
    String checkCalories(int calories) {

        String overate;//инициализируем значение overate
        String bad = "bad";//инициализируем значение bad
        String good = "good";//инициализируем значение good
        if (calories - 30 > 53.5 * weight) { //условие с формулой для расчета калорий
            return overate = "good"; //выводим good
        } else if (calories + 30 < 53.5 * weight) {
            return bad;//или выводим bad
        } else {
            return good;
        }
    }
}




