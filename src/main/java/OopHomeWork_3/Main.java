package OopHomeWork_3;

public class Main {
    public static void main(String[] args) {
        Relationships event = new Relationships();
        event.newPerson("Valeruy", "male");
        event.newPerson("Nataliya", "female");
        event.newPerson("Ilya", "male");
        event.newPerson("Dima", "male");

        event.wedding("Valeruy", "Nataliya");
        event.birth("Ilya", "Valeruy");
        event.birth("Valeruy", "Alexandr");
        System.out.println("Valeruy's husband is " + event.persons.get("Valeruy").getHusband().getName());
        event.showParents("Alexandr");
        event.showChildren("Ilya");
    }
}
