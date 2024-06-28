package codeAlong3;

public class App {

  public static void main(String[] args){

    // instantiate new devices
    IPhone myIPhone = new IPhone();
    IPod myIPod = new IPod();
    Radio myRadio = new Radio();

    // make the DJ play music

    DJ myDJ = new DJ("Greatest DJ ever!");
    // can be whatever just illustrate the point that the method playable is generic and run the program!
    myDJ.playMusic(myIPhone, "Baby by Justin Bieber");

  }

}
