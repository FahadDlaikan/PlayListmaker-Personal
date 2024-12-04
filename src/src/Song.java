import java.time.Duration;
public class Song {
   private String title;
   private String artist;
   private Duration duration;

    Song(){
        this.title=null;
        this.artist=null;
        this.duration=Duration.ZERO;
    }

    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }

    public Duration getDuration() {
        return duration;
    }

}
