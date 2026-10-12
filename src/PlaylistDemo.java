/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 * Name:        Kübra Ayhan
 * Student ID:  240444028
 * Date:        October 5 2026
 */

public class PlaylistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        Track defaultTrack = new Track();
        System.out.println("Default Track:");
        System.out.println(defaultTrack + "\n");

        Track titleTrack = new Track("Neon Lights");
        System.out.println("Title-only track:");
        System.out.println(titleTrack + "\n");

        Track titleArtistTrack = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(titleArtistTrack + "\n");

        Track fullTrack = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(fullTrack + "\n");


        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -10, false);
        System.out.println(invalidTrack + "\n");

        System.out.println("Getter Test:");
        Track getterTrack = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());

    }
}