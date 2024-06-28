package codeAlong3;

public class DJ {

  public DJ(String name){}

//  public void playIPod(IPod myIPod, String songName){
//    myIPod.playIPod(songName);
//  }
//
//  public void playIPhone(IPhone myIPhone, String songName){
//    myIPhone.playIPhone(songName);
//  }
//
//  public void playRadio(Radio myRadio, String songName){
//    myRadio.playRadio(songName);
//  }

  public void playMusic(Playable myPlayable, String songName){
    myPlayable.startSong(songName);
  }
}
