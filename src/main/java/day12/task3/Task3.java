package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Abbath", 2015);
        MusicBand band2 = new MusicBand("Dimmu Borgir", 1994);
        MusicBand band3 = new MusicBand("Behemoth", 1991);
        MusicBand band4 = new MusicBand("Burzum", 1991);
        MusicBand band5 = new MusicBand("Sabaton", 1999);
        MusicBand band6 = new MusicBand("Alcest",2000);
        MusicBand band7 = new MusicBand("Minenwerfer",2007);
        MusicBand band8 = new MusicBand("Lifelover", 2005);
        MusicBand band9 = new MusicBand("Ragnarok", 1994);
        MusicBand band10 = new MusicBand("Apati", 2007);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        Collections.shuffle(bands);

        for(MusicBand band : bands){
            System.out.println(band);
        }
        System.out.println();

        List<MusicBand> bands2000Plus = groupsAfter2000(bands);
        for(MusicBand band : bands2000Plus){
            System.out.println(band);
        }


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for(MusicBand band : bands){
            if(band.getYear() > 2000){
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
}
