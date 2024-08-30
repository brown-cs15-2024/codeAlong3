package codeAlong3;

public class Samsung extends Electronics implements Playable{

  public Samsung(){
    super();
  }

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from Samsung!");
  }
}
