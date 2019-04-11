import java.util.ArrayList;

public class Show {

    public int numberofSeasons;
    private int num;
    private ArrayList<Double> seasons;

    public Show(String name) {

        numberofSeasons=0;
        num=0;

    }

    public void addSeasons(double Season){

        numberofSeasons +=Season;
        num= num+1;
        seasons.add(Season);

    }

}