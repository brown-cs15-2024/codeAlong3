package codeAlong3;

public class IPhone implements Playable{

  public IPhone(){}

//  public void playIPhone(String songName){
//    System.out.println("Playing " + songName + " from IPhone!");
//  }

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from IPhone!");
  }
}
