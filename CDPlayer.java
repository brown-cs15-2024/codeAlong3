package codeAlong3;

public class CDPlayer extends Electronic implements Playable{

  public CDPlayer(){
    super();
  }

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from Radio!");
  }
}
