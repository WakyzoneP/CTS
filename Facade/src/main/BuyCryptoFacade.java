package main;

import main.thirdparty.CryptoFactory;
import main.thirdparty.DatabaseService;
import main.thirdparty.MailService;
import main.thirdparty.UIService;
import main.thirdparty.User;

public class BuyCryptoFacade {
    public void buyCryptocurrency(double amount, String currency) {
        DatabaseService dbService = new DatabaseService();
        User user = dbService.getUser(UIService.getLoggedInUserId());
        if (user.balance() < amount) {
            System.out.println("Insufficient balance to perform transaction");
            return;
        }
        CryptoFactory.getCryptoService(currency).buyCurrency(user, amount);
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user);
    }
}
