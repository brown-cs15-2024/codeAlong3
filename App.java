package codeAlong3;

public class App {

  public static void main(String[] args){

    // instantiate new devices
    IPhone myIPhone = new IPhone();
    Samsung mySamsung = new Samsung();
    CDPlayer myCDPlayer = new CDPlayer();
    Microphone myMicrophone = new Microphone();

    // make the DJ play music

    //instantiate DJ
    DJ myDJ = new DJ("Greatest DJ ever!");
    //have DJ set up equipment
    myDJ.setUpDevice(myIPhone, "iPhone");
    myDJ.setUpDevice(mySamsung, "Samsung");
    myDJ.setUpDevice(myCDPlayer, "CD Player");
    myDJ.setUpDevice(myMicrophone, "Microphone");

    // can be whatever just illustrate the point that the method
    // playable is generic and run the program!
    //the playable interface allows us to use any device that extends playable in this method
    myDJ.playMusic(myIPhone, "Baby by Justin Bieber");
    myDJ.playMusic(mySamsung, "Mr. Brightside by The Killers");
    myDJ.playMusic(myCDPlayer, "She Calls Me Back by Noah Kahan");

  }

}
