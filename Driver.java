import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {

    public static void display(WatchList pWatchList) {
        List<Watchable> pWatchables = pWatchList.aList;
        for(Watchable w : pWatchables) System.out.print(w.getTitle()+"\t");
        System.out.println();
    }

    public static void main(String[] args) {
        Map<String,String>cast = new HashMap<>();
        cast.put("main boy","handsome actor");
        TVShow t1 = new TVShow("show",Language.ENGLISH,"studio",cast);
        t1.createAndAddEpisode();
        t1.createAndAddEpisode();
        return;

        // Q1
        //generate a Watchlist of the first episodes of all TV shows from the WarnerBrothers studio that are in either English or French

//        TVShow t1 = new TVShow("Friends", Language.ENGLISH, "WarnerBrothers");                // should be included
//        TVShow t2 = new TVShow("Le Mentaliste", Language.FRENCH, "WarnerBrothers");           // should be included
//        TVShow t3 = new TVShow("La Teoría del Big Bang", Language.SPANISH, "WarnerBrothers"); // should not be included
//        TVShow t4 = new TVShow("Daredevil", Language.ENGLISH, "MarvelStudio");                // should not be included
//
//        t1.createAndAddEpisode(new File(""), "The One Where Monica Gets a Roommate");       // should be included
//        t1.createAndAddEpisode(new File(""), "The One with the Sonogram at the End");
//        t1.createAndAddEpisode(new File(""), "The One with the Thumb");
//
//        t2.createAndAddEpisode(new File(""), "Pilot");                                      // should be included
//        t2.createAndAddEpisode(new File(""), "Red Hair and Silver Tape");
//        t2.createAndAddEpisode(new File(""), "Red Tide");
//
//        t3.createAndAddEpisode(new File(""), "Unaired Pilot");
//        t3.createAndAddEpisode(new File(""), "Pilot");
//        t3.createAndAddEpisode(new File(""), "The Big Bran Hypothesis");
//
//        t4.createAndAddEpisode(new File(""), "Into the Ring");
//        t4.createAndAddEpisode(new File(""), "Cut Man");
//        t4.createAndAddEpisode(new File(""), "Rabbit in a Snowstorm");
//
//        List<Watchable> episodes = new ArrayList<>();
//        episodes.addAll(t1.aEpisodes);
//        episodes.addAll(t2.aEpisodes);
//        episodes.addAll(t3.aEpisodes);
//        episodes.addAll(t4.aEpisodes);
//
//
//        OR languageFilter = new OR(new LanguageFilterStrategy(Language.ENGLISH), new LanguageFilterStrategy(Language.FRENCH));
//        AND enhancedFilter = new AND(languageFilter, new StudioFilterStrategy("WarnerBrothers"));
//        enhancedFilter.addFilter((new FirstEpisodeFilterStrategy()));
//
//
//        WatchList enchanceFiltered = WatchList.generateFromFilter(episodes, enhancedFilter);
//        display(enchanceFiltered);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Q2
//        Episode clone = t1.getEpisode(2).clone();


    }

}
