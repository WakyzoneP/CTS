import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class LoginButton extends JButton implements Component {
    private Mediator mediator;

    public LoginButton() {
        super("Log In");
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.login();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
