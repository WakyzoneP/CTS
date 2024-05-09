public class Room {
    Command command;
    Light light;

    public Room(Light light) {
        this.light = light;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

    public Light getLight() {
        return light;
    }
}
