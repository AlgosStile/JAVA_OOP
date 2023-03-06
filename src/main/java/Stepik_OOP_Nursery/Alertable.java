package Stepik_OOP_Nursery;

public interface Alertable {
    public void alertError(int num);
    public void alertWarning(int num);

    abstract String convertAlertErrorMessage(int num);

    String convertAlertWarningMessage(int num);
}

