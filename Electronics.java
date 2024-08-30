package codeAlong3;

public abstract class Electronics {

    public Electronics (){
        super();
    }

    public void plugIn(String myDevice) {
        System.out.println(myDevice + " has been plugged in!");
    }
    public void turnOn(String myDevice) {
        System.out.println(myDevice + " has been turned on!");
    }

}
