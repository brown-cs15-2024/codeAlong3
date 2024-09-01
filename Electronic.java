package codeAlong3;

public abstract class Electronic {

    public Electronic(){}

    public void plugIn(String myDevice) {
        System.out.println(myDevice + " has been plugged in!");
    }
    public void turnOn(String myDevice) {
        System.out.println(myDevice + " has been turned on!");
    }

}
