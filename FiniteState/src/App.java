import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        Phone phone = new Phone();
        JFrame frame = new JFrame("Phone State Design");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        JButton home = new JButton("Home");
        home.setBounds(150, 150, 100, 50);
        home.addActionListener(e -> {
            System.out.println(phone.getState().pressHome());
        });
        frame.add(home);
        JButton offOn = new JButton("Off/On");
        offOn.setBounds(150, 200, 100, 50);
        offOn.addActionListener(e -> {
            System.out.println(phone.getState().pressOffOn());
        });
        frame.add(offOn);
    }
}
