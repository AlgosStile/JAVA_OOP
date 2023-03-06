package OopHomeWork_4;

import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;
    private final Menu menu;
    private final Planner planner;
    private final Add add;
    protected static String csvPath = "C:\\Users\\doct2\\Desktop\\Java_OOP\\Java_OOP\\src\\main\\java\\OopHomeWork_4\\Planner.csv";
    protected static String jsonPath = "C:\\Users\\doct2\\Desktop\\Java_OOP\\Java_OOP\\src\\main\\java\\OopHomeWork_4\\Planner.json";
    protected static String xmlPath = "C:\\Users\\doct2\\Desktop\\Java_OOP\\Java_OOP\\src\\main\\java\\OopHomeWork_4\\Planner.xml";


    public UserInterface(Scanner scanner, Menu menu, Planner planner, Add add) {
        this.scanner = scanner;
        this.menu = menu;
        this.planner = planner;
        this.add = add;
    }

    public void start() {

        while (true) {
            switch (menu.selectFunction()) {
                case "1": // Показать все задачи
                    planner.sort();
                    planner.showAll();
                    break;
                case "2": // Найти задачу по теме
                    System.out.print("Введите тему задачи: ");
                    System.out.println(planner.getBySub(scanner.nextLine()));
                    break;
                case "3": // Поиск задачи по автору
                    System.out.print("Введите имя: ");
                    planner.totalSearch(scanner.nextLine());
                    break;
                case "4": // Отсортировать задачи по приоритету
                    System.out.println("Сначала показаны задачи с наивысшим приоритетом : ");
                    planner.sortByPrior();
                    planner.showAll();
                    break;
                case "5": // Выполнить запись планера в файл
                    saveFile();
                    break;
                case "6": // Добавить новую задачу
                    planner.add(add.makeNewTask());
                    break;
                case "7": // Изменить задачу
                    System.out.println("Введите Id задачи, которую меняем: ");
                    changeTask(planner.getById(scanner.nextInt()));

                case "0": // Выход
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }

    public void saveFile() {
        PlannerIterator plannerIterator = new PlannerIterator(planner);
        while (true) {
            switch (menu.selectSaveType()) {
                case "1" -> // CSV
                {
                    while (plannerIterator.hasNext()) {
                        SaveModel<Task> saved = new SaveModel<>(plannerIterator.next());
                        saved.setFormat(new CsvWriter());
                        saved.setPath(csvPath);
                        saved.save();
                    }
                    System.out.println("Сохранено в CSV");
                }

                case "2" -> // JSOM
                {
                    while (plannerIterator.hasNext()) {
                        SaveModel<Task> saved = new SaveModel<>(plannerIterator.next());
                        saved.setFormat(new JsonWriter());
                        saved.setPath(jsonPath);
                        saved.save();
                    }
                    System.out.print("Сохранено в JSON");
                }
                case "3" -> //XML
                {
                    while (plannerIterator.hasNext()) {
                        SaveModel<Task> saved = new SaveModel<>(plannerIterator.next());
                        saved.setFormat(new XmlWriter());
                        saved.setPath(xmlPath);
                        saved.save();
                    }
                    System.out.print("Сохранено в XML");
                }
                case "4" -> //меню
                        start();
                case "0" -> // выход
                        System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }

    public void changeTask(Task changing) {
        while (true) {
            switch (menu.selectTaskMeth()) {
                case "1" -> { // меняем тему
                    System.out.println("Введите новую тему:");
                    changing.setSubject(scanner.nextLine());
                }
                case "2" -> { // имя автора
                    System.out.print("Введите нового автора");
                    changing.setAuthor(scanner.nextLine());
                }
                case "3" -> { //приоритет
                    System.out.print("1 - низкий, 2 - высокий, 3 - наивысший");
                    changing.setPriority(scanner.nextInt());
                }
                case "4" -> { //дедлайн
                    System.out.print("Введите новый дедлайн");
                    changing.setEndOfTask(scanner.nextLine());
                }
                case "5" -> //меню
                        start();
                case "0" -> // выход
                        System.exit(0);
                default -> System.out.println("Неверный ввод");
            }
        }
    }


}