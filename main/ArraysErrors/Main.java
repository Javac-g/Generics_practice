package main.ArraysErrors;

public class Main {
    public static void main(String[] args) {
        //Human<Integer>[] humans = new Human<Integer>[3]; wrong
        Human<?>[] humans = new Human<?>[3];//right
    }
}
