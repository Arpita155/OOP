package OOP.Polymorphism.QuestionsOfPolymorphism.Q5_Playable_Downloadable;

public class Main {
    public static void main(String[] args) {


        Playable playable = new Song("Mai Phir bhi tumko chaahunga","Arijit Singh");
        playable.play();
        playable = new Video("Sanam Teri Kasam","Radhika Rao and Vinay sapru");
        playable.play();
        playable = new Podcast("The Daily","Michael Barbaro");
        playable.play();

        Downloadable downle = new Song("Mai Phir bhi tumko chaahunga","Arijit Singh");
        downle.download();
        downle = new Video("Sanam Teri Kasam","Radhika Rao and Vinay sapru");
        downle.download();


        // OUTPUT:
        //Playing the song: Mai Phir bhi tumko chaahunga by Arijit Singh
        //Playing video:Sanam Teri Kasam directed by Radhika Rao and Vinay sapru
        //Playing podcast: The Daily hosted by Michael Barbaro
        //Downloading the song: Mai Phir bhi tumko chaahunga singing by Arijit Singh
        //Downloading video: Sanam Teri Kasam directed by Radhika Rao and Vinay sapru
    }
}
