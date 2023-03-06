package OopHomeWork_3;

import java.util.ArrayList;
import java.util.HashMap;

public  class Relationships implements GenTree {

    public static HashMap<String, Person> persons = new HashMap<>();  // Тут хранятся все представители класса Person

    public HashMap<Person, ArrayList<Person>> parents = new HashMap();  // Ключи - Дети, значения  - список родителей

    public  HashMap<Person, ArrayList<Person>> children = new HashMap(); // Ключи - Родители, значения - Список детей


    public void newPerson(String name, String gender) {
        persons.put(name, new Person(name, gender));
    }

    @Override    // Возвращает список детей, в списке экземпляры класса Person
    public ArrayList<Person> getChildren(String name) {
        return children.get(persons.get(name));
    }

    @Override   // Выводит список детей в консоль
    public void showChildren(String name) {
        System.out.print(name + "'s children are: ");
        for (int i = 0; i < getChildren(name).size(); i++) {
            System.out.print(getChildren(name).get(i).getName() + " ");
        }
        System.out.println();
    }

    @Override   // Этот метод возвращает список родителей, в списке экземпляры класса Person
    public ArrayList<Person> getParents(String name) {
        return parents.get(persons.get(name));
    }

    @Override  // Выводит список родителей в консоль
    public void showParents(String name) {
        System.out.print(name + "'s parents are: ");
        for (int i = 0; i < getParents(name).size(); i++) {
            System.out.print(getParents(name).get(i).getName() + " ");
        }
        System.out.println();
    }
    // Создает пару муж-жена, в экземпляре класса одного супруга появляется ссылка
    // на экземпляр класса другого супруга
    @Override
    public void wedding(String husband1, String husband2) {
        if(persons.get(husband1).getGender().equalsIgnoreCase(persons.get(husband2).getGender())){
            System.out.println(persons.get(husband1).getName() + " and " + persons.get(husband2).getName() +
                    " are " + persons.get(husband1).getGender() +", they can't be married now. ");
        }else{
            persons.get(husband1).setHusband(persons.get(husband2));
            persons.get(husband2).setHusband(persons.get(husband1));
        }
    }
    // Изменил типы аргументов wedding для упрощения работы в main,
    // теперь можно передать просто имя

    @Override
    public void makeParent(Person parent, Person child) {   // Создаем связь родитель - ребенок и ребенок - родитель
        if (parents.containsKey(child)){
            if(!parents.get(child).contains(parent)){
                parents.get(child).add(parent);
            }
        }else{
            parents.put(child, new ArrayList<Person>());
            parents.get(child).add(parent);
        }

        if (children.containsKey(parent)){
            if(!children.get(parent).contains(child)){
                children.get(parent).add(child);
            }
        }else{
            children.put(parent, new ArrayList<Person>());
            children.get(parent).add(child);
        }
    }

    @Override  // Создает связь родитель - ребенок и
    // ребенок - родитель, проверяет наличие супруга,
    // если связь есть, то автоматически создается с ребенком
    public void birth(String parent, String child) {  //
        makeParent(persons.get(parent), persons.get(child));
        if (persons.get(parent).getHusband() != null) {
            makeParent(persons.get(parent).getHusband(), persons.get(child));
        }
    }

}
