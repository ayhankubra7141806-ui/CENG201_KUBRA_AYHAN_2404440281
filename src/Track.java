/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 * Your Name:        Kübra Ayhan
 * Your Student ID:  240444028
 * Your Date:        October 5  2026
 */
public class Track {
    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;


    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        if (durationSeconds >= 0) {
            this.durationSeconds = durationSeconds;
        } else {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        }
        this.isExplicit = isExplicit;
    }

    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    public Track() {
        this("Unknowm Title", "Unknown Artist", 0, false);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String explicitTag = isExplicit ? " [EXPLICIT]" : "";
        return "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]" + explicitTag;
    }
}
