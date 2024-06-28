package codeAlong3;

public class Radio implements Playable{

  public Radio(){}

//  public void playRadio(String songName){
//    System.out.println("Playing " + songName + " from Radio!");
//  }

  @Override
  public void startSong(String songName) {
    System.out.println("Playing " + songName + " from Radio!");
  }
}
