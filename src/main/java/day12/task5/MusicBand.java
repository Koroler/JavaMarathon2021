package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members = new ArrayList<>();


    public String getName() { return name; }
    public int getYear() { return year; }
    public List<MusicArtist> getMembers() { return members; }

    public MusicBand(String name, int year, List<MusicArtist> members){
        this.name = name;
        this.year = year;
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(List<MusicArtist> bandA, List<MusicArtist> bandB){
        for(MusicArtist artist: bandB){
            bandA.add(artist);
        }
    }
    public void printMembers(){
        System.out.println(members);
    }
}

