package OopHomeWork_2;

public class Relationships {
    public Relationships() {
    }

    public void makeParent(Person parent, Person child) {
        parent.isParent(child);
        child.isChild(parent);
        if (parent.getHusband() != null) {
            parent.getHusband().isParent(child);
            child.isChild(parent.getHusband());
        }

    }

    public void wedding(Person husband1, Person husband2) {
        if (husband1.getSex().equalsIgnoreCase(husband2.getSex())) {
            System.out.println("Both of husbands is " + husband1.getSex() + ", they can't be married now.");
        } else {
            husband1.isHusband(husband2);
            husband2.isHusband(husband1);
        }

    }
}
