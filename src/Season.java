import java.util.ArrayList;

public class Season {

    private double NumberEpisodes;
    private int numberofSeasons;
    private int num;
    private ArrayList<Double> episodes;


    public Season(int numberofSeasons, int NumberEpisodes) {

        NumberEpisodes=0;
        num=0;


    }

    public void addEpisode(double Episode){

            NumberEpisodes +=Episode;
            num= num+1;
            episodes.add(Episode);

        }

}
