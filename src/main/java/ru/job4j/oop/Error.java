package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printError() {
        System.out.println("Operation in progress: " + active);
        System.out.println("Error code: " + status);
        System.out.println("Error message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        System.out.println("Empty error");
        error.printError();
        System.out.println();
        Error memory = new Error(true, 67, "High memory usage");
        System.out.println("Memory error");
        memory.printError();
        System.out.println();
        Error disconnect = new Error(false, 404, "Connection failed");
        System.out.println("Connection error");
        disconnect.printError();
        System.out.println();
    }
}
