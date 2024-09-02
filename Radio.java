package codeAlong3;

public class Radio extends Electronic implements Playable{

  public Radio(){
    super();
  }

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from Samsung!");
  }
}
