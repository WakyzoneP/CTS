public class Light {
    private boolean switchedOn;

    public void switchLights() {
        switchedOn = !switchedOn;
    }

    @Override
    public String toString() {
        return "Light [switchedOn=" + switchedOn + "]";
    }
}
