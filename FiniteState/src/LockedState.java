public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String pressHome() {
        phone.setState(new ReadyState(phone));
        return phone.unlock();
    }

    @Override
    public String pressOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

}
