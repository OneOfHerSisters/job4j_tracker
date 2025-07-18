package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void getInfo() {
        System.out.println(this.active);
        System.out.println(this.status);
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        Error errorTrue1Hello = new Error(true, 1, "Hello");
        Error errorTrue2DzienDobry = new Error(true, 2, "Dzień Dobry");

        defaultError.getInfo();
        errorTrue1Hello.getInfo();
        errorTrue2DzienDobry.getInfo();
    }
}
