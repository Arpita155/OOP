package OOP.Polymorphism.QuestionsOfPolymorphism.Q5_Playable_Downloadable;

public class Video implements Playable,Downloadable{

    private String videoTitle;
    private String director;

    public Video(String videoTitle, String director){
        this.videoTitle = videoTitle;
        this.director = director;
    }

    @Override
    public void play(){
        System.out.println("Playing video:"+videoTitle+" directed by "+director);
    }

    @Override
    public void download(){
        System.out.println("Downloading video: "+videoTitle+" directed by "+director);
    }
}
