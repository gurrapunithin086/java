package Assignments;

interface Instrument {
    void showInstruments();
}

interface Artist {
    void showArtists();
}

class MusicGenre {
    void favoriteGenre() {
        System.out.println("Favorite Genre: Classical Fusion");
    }
}

class Performance extends MusicGenre implements Instrument, Artist {
    public void liveConcerts() {
        System.out.println("Live Concerts: Symphony Night, Strings Live, Beats & Bass");
    }

    public void showInstruments() {
        System.out.println("Popular Instruments: Violin, Guitar, Tabla");
    }

    public void showArtists() {
        System.out.println("Famous Artists: A.R. Rahman, Zakir Hussain, Arijit Singh");
    }
}

public class test4 {
    public static void main(String[] args) {
        MusicGenre m1 = new MusicGenre();
        Performance p1 = new Performance();

        p1.showInstruments();
        p1.showArtists();
        p1.liveConcerts();
        m1.favoriteGenre();
    }
}
