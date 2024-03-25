public class MailService {
    public void sendEmail() {
        connect(10);
        authenticate();
        System.out.println("Email sent");
        disconnect();
    }

    private void connect(int timeout) {
        System.out.println("Connected to mail server");
    }

    private void disconnect() {
        System.out.println("Disconnected from mail server");
    }

    private void authenticate() {
        System.out.println("Authenticated");
    }
}
