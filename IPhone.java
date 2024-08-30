package codeAlong3;

public class IPhone extends Electronics implements Playable {

  public IPhone(){}

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from IPhone!");
  }
}
