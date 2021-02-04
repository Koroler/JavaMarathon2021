package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members = new ArrayList<>();


    public String getName() { return name; }
    public int getYear() { return year; }
    public List<String> getMembers() { return members; }

    public MusicBand(String name, int year, List<String> members){
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

    public static void transferMembers(List<String> bandA, List<String> bandB){
        for(String name : bandB){
            bandA.add(name);
        }
    }
    public void printMembers(){
        System.out.println(members);
    }
}

