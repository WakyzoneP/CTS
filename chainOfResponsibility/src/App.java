public class App {
    public static void main(String[] args) throws Exception {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());
        AuthService authService = new AuthService(handler);
        authService.logIn("admin_username", "admin_password");
    }
}
