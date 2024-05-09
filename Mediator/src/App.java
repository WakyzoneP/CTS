public class App {
    public static void main(String[] args) throws Exception {
        Dialog dialog = new Dialog();
        dialog.enterUsername("Vlad");
        dialog.enterPassword("password");

        dialog.simulateLoginClicked();
    }
}
