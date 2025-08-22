package OOP.Polymorphism.QuestionsOfPolymorphism.Q5_Playable_Downloadable;

public class Song implements Playable,Downloadable{

    private String songName;
    private String singer;

    public Song(String songName, String singer){
        this.songName = songName;
        this.singer = singer;
    }

    @Override
    public void play(){
        System.out.println("Playing the song: "+songName+" by "+singer);
    }

    @Override
    public void download(){
        System.out.println("Downloading the song: "+songName+" singing by "+singer);
    }
}
