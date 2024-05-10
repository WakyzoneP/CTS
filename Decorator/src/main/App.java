package main;
public class App {
    public static void main(String[] args) throws Exception {
        INotifier notifier = new FacebookDecorator(
            new WhatsAppDecorator(
                new Notifier("WakyzoneP")
            )
        );
        notifier.send("Hello, World!");
    }
}
