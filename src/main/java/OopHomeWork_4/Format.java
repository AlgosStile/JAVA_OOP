package OopHomeWork_4;

public interface Format { //Интерфейс создания строк для разных форматов файла
    <T extends Task> String createString(T task);
}
