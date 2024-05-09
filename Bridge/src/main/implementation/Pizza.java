package main.implementation;

public abstract class Pizza {
    protected String sauce;
    protected String topping;
    protected String crust;

    public abstract void assemble();

    public abstract void qualityCheck();

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

}
