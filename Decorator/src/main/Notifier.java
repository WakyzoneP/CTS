package main;

public class Notifier implements INotifier {
    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        this.databaseService = new DatabaseService();
    }

    public void send(String msg) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending mail to " + mail + ": " + msg);
    }

    public String getUsername() {
        return username;
    }
}
