public class App {
    public static void main(String[] args) throws Exception {
        Room livingRoom = new Room(new Light());
        livingRoom.setCommand(new SwitchLightsCommand(livingRoom.getLight()));
        livingRoom.executeCommand();
        System.out.println(livingRoom.getLight());
        livingRoom.executeCommand();
        System.out.println(livingRoom.getLight());
    }
}
