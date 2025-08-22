package OOP.Polymorphism.QuestionsOfPolymorphism.Q5_Playable_Downloadable;

public class Podcast implements Playable{

    private String podcastTitle;
    private String host;

    public Podcast(String podcastTitle, String host){
        this.podcastTitle = podcastTitle;
        this.host = host;
    }

    @Override
    public void play(){
        System.out.println("Playing podcast: "+podcastTitle+" hosted by "+host);
    }

}
