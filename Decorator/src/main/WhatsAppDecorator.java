package main;

public class WhatsAppDecorator extends BaseNotifierDecorator {

    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        String phoneNbr = databaseService.getPhoneNbrFromUsername(getUsername());
        System.out.println("WhatsApp message sent to " + phoneNbr + ": " + msg);
    }
}
