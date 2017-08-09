package oop;

public abstract class Room implements Clenable {

    private String owner;

    private int numberOfwindow;

    public Room(String owner) {
        this.owner = owner;
    }

    public void setNumberOfWindow(int n) {
        numberOfwindow = n;
    }

    public String getOwner() {
        return owner;
    }

    public void mainCore() {
        System.out.println("This room has " + numberOfwindow + " window and one door");
    }

    public abstract void decoration();

}
