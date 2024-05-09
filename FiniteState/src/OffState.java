public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String pressHome() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String pressOffOn() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

}
