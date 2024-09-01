package codeAlong3;

public class DJ {

  public DJ(String name) {}

  //method for the DJ to set up equipment
  public void setUpDevice(Electronic myElectronic, String myDevice) {
    myElectronic.plugIn(myDevice);
    myElectronic.turnOn(myDevice);
  }

  public void playMusic(Playable myPlayable, String songName){
    myPlayable.startSong(songName);
  }

}
