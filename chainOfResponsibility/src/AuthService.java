public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if(handler.handle(username, password)) {
            System.err.println("Authorization was successful!");

            return true;
        }

        return false;
    }
}
