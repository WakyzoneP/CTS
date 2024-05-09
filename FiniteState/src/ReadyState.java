public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String pressHome() {
        return phone.home();
    }

    @Override
    public String pressOffOn() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }

}
