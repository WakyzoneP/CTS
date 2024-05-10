package main;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String fbName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Facebook message sent to " + fbName + ": " + msg);
    }
}
