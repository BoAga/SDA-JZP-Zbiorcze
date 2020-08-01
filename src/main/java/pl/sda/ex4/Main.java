package pl.sda.ex4;

public class Main {
    public static void main(String[] args) {
        //aby sprawdzić jak działa program, najpierw trzeba utworzyć obiekt typu Storage
        Storage storage = new Storage();

        //program dodaje klucze i wartości do obiektu storage
        storage.addToStorage("1", "5");
        storage.addToStorage("2", "6");
        storage.addToStorage("1", "7");
        storage.addToStorage("3", "7");

        //program wyświetla całą zawartość obiektu storage
        System.out.println(storage.toString());

        //program wyświetla wszystkie wartości powiązane z zadanym kluczem
        storage.printValue("1");

        //program wyświetla wszystkie klucze powiązane z zadaną wartością
        storage.findValues("7");

    }
}
