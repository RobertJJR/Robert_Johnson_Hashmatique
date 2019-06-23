import java.util.HashMap;
import java.util.Set;


public class Hashmatique {
      public void GetTracks(){
            HashMap<String, String> trackList = new HashMap<>();

            trackList.put("Childish Gambino", "No matter what you say or what you do. When I'm alone, I'd rather be with you. Forget these other guys, I'll be right by your side Till 3005, hold up");
            trackList.put("Time in a Tree", "I just want time in a tree I need a place just for me Somewhere that I can be free Keep the faith and just be What you'll be");
            trackList.put("May I Have This Dance", "In the ground, we bury The seeds of a pear tree All the things we carried Now we're down to our bare feet");
            trackList.put("Old Town Road", "Yeah, I'm gonna take my horse to the old town road I'm gonna ride 'til I can't no more I'm gonna take my horse to the old town road I'm gonna ride 'til I can't no more (Kio, Kio)");

            String track = trackList.get("Old Town Road");

            System.out.println("=================SELECTED TRACK=================");
            System.out.println(" ");
            System.out.println("Old Town Road Lyrics: "+ track);
            System.out.println(" ");
            System.out.println("================OTHER === TRACKS=================");
            System.out.println(" ");
            //forEach(Consumer -> Action)
            // -> Arrow Operator. almost like a { } tells you to complete the next action.
            trackList.forEach((key, value) -> System.out.println(key + " : " + value +  "\n"));
    }
}