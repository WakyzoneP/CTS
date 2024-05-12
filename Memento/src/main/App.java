package main;
public class App {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        editor.write("Hello");
        editor.write("Hello123");
        editor.write("Hello World");
        editor.printText();
        editor.undo();
        editor.printText();
    }
}
