package chain;

public abstract class Handler {
    private Handler next;

    public Handler setNextHandle(Handler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(Pacient pacient);

    protected void handleNext(Pacient pacient) {
        if (next == null) {
            return;
        }
        next.handle(pacient);
    }
}
