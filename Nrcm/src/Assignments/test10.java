package Assignments;

interface StringInstruments {
    void stringInstruments();
}

interface WindInstruments {
    void windInstruments();
}

interface PercussionInstruments {
    void percussionInstruments();
}

interface Instruments extends StringInstruments, WindInstruments, PercussionInstruments {
    void instrumentCategories();
}

class MusicShop implements Instruments {
    public void stringInstruments() {
        System.out.println("String Instruments: Guitar, Violin, Harp");
    }

    public void windInstruments() {
        System.out.println("Wind Instruments: Flute, Clarinet, Trumpet");
    }

    public void percussionInstruments() {
        System.out.println("Percussion Instruments: Drums, Xylophone, Tambourine");
    }

    public void instrumentCategories() {
        System.out.println("All categories of musical instruments available");
    }
}

public class test10 {
    public static void main(String[] args) {
        MusicShop shop = new MusicShop();
        shop.instrumentCategories();
        shop.stringInstruments();
        shop.windInstruments();
        shop.percussionInstruments();
    }
}
