package OopHomeWork_2;

import java.util.LinkedList;

public class Person {
    private String name;
    private int age;
    private String sex;
    private LinkedList<Person> parents = new LinkedList();
    private LinkedList<Person> childs = new LinkedList();
    private Person husband;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {
        return "Person{name='" + this.name + "', age=" + this.age + "}";
    }

    public String getName() {
        return this.name;
    }

    public void isParent(Person name) {
        this.childs.add(name);
    }

    public void isChild(Person name) {
        this.parents.add(name);
    }

    public void isHusband(Person name) {
        this.husband = name;
    }

    public Person getHusband() {
        return this.husband;
    }

    public String getSex() {
        return this.sex;
    }

    public LinkedList<Person> getParents() {
        return this.parents;
    }

    public LinkedList<Person> getChilds() {
        return this.childs;
    }

    public void showChildrens() {
        System.out.print(this.name + "'s childs is: ");

        for(int i = 0; i < this.childs.size(); ++i) {
            System.out.print(((Person)this.childs.get(i)).getName());
            if (i < this.childs.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public void showParents() {
        System.out.print(this.name + "'s parents is: ");

        for(int i = 0; i < this.parents.size(); ++i) {
            System.out.print(((Person)this.parents.get(i)).getName());
            if (i < this.parents.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }

    public void showGrandparents() {
        System.out.print(this.name + "'s grandparents is: ");

        for(int i = 0; i < this.parents.size(); ++i) {
            for(int j = 0; j < ((Person)this.parents.get(i)).getParents().size(); ++j) {
                System.out.print(((Person)((Person)this.parents.get(i)).getParents().get(j)).getName());
                if (i < this.parents.size() - 1 || j < ((Person)this.parents.get(i)).getParents().size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
    }

    public void showGrandchilds() {
        System.out.print(this.name + "'s grandchilds is: ");

        for(int i = 0; i < this.childs.size(); ++i) {
            for(int j = 0; j < ((Person)this.childs.get(i)).getChilds().size(); ++j) {
                System.out.print(((Person)((Person)this.childs.get(i)).getChilds().get(j)).getName());
                if (i < this.childs.size() - 1 || j < ((Person)this.childs.get(i)).getChilds().size() - 1) {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
    }

    public void showBrothers() {
        LinkedList<Person> temp = new LinkedList();

        int i;
        for(i = 0; i < this.parents.size(); ++i) {
            for(int j = 0; j < ((Person)this.parents.get(i)).getChilds().size(); ++j) {
                if (this != ((Person)this.parents.get(i)).getChilds().get(j) && !temp.contains(((Person)this.parents.get(i)).getChilds().get(j))) {
                    temp.add((Person)((Person)this.parents.get(i)).getChilds().get(j));
                }
            }
        }

        System.out.print(this.name + "'s brothers and sisters are: ");

        for(i = 0; i < temp.size(); ++i) {
            System.out.print(((Person)temp.get(i)).getName());
            if (i < temp.size() - 1) {
                System.out.println(", ");
            }
        }

        System.out.println();
    }

    public void showUncles() {
        LinkedList<Person> temp = new LinkedList();

        int i;
        for(i = 0; i < this.parents.size(); ++i) {
            for(int j = 0; j < ((Person)this.parents.get(i)).getParents().size(); ++j) {
                for(int k = 0; k < ((Person)((Person)this.parents.get(i)).getParents().get(j)).getChilds().size(); ++k) {
                    if (!temp.contains(((Person)((Person)this.parents.get(i)).getParents().get(j)).getChilds().get(k)) && !this.parents.contains(((Person)((Person)this.parents.get(i)).getParents().get(j)).getChilds().get(k))) {
                        temp.add((Person)((Person)((Person)this.parents.get(i)).getParents().get(j)).getChilds().get(k));
                        temp.add(((Person)((Person)((Person)this.parents.get(i)).getParents().get(j)).getChilds().get(k)).getHusband());
                    }
                }
            }
        }

        System.out.print(this.name + "'s uncles are: ");

        for(i = 0; i < temp.size(); ++i) {
            System.out.print(((Person)temp.get(i)).getName());
            if (i < temp.size() - 1) {
                System.out.println(", ");
            }
        }

        System.out.println();
    }
}
