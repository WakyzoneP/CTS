import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class Dialog implements Mediator {
    private TextBox userTextField = new TextBox();
    private TextBox passTextField = new TextBox();
    private LoginButton button = new LoginButton();

    public Dialog() {
        button.setMediator(this);
    }

    @Override
    public void login() {
        String username = userTextField.getText();
        String password = passTextField.getText();

        System.out.println(username + " " + password);
    }

    public void enterUsername(String username) {
        userTextField.setText(username);
    }

    public void enterPassword(String password) {
        passTextField.setText(password);
    }

    public void simulateLoginClicked() {
        button.fireActionPerformed(new ActionEvent(this, 0, "login"));
    }
}
