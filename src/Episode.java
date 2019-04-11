import java.util.ArrayList;

public class Episode {

    int time;
    String name;


    private ArrayList<Episode> episodes;

    public Episode(int time, String name) {
        this.time = time;
        this.name = name;
        episodes = new ArrayList<Episode>();
    }
}
