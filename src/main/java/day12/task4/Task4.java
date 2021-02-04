package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersBand1 = new ArrayList<>();
        membersBand1.add("Stian Tomt Thoresen");
        membersBand1.add("Sven Atle Kopperud");
        membersBand1.add("Thomas Rune Andersen");

        List<String> membersBand2 = new ArrayList<>();
        membersBand2.add("Adam Nergal Darski");
        membersBand2.add("Tomasz Wroblewski");
        membersBand2.add("Zbigniew Prominski");
        membersBand2.add("Patryk Dominik Sztyber");

        MusicBand band1 = new MusicBand("Dimmu Borgir", 1994, membersBand1);
        MusicBand band2 = new MusicBand("Behemoth", 1991, membersBand2);

        band1.printMembers();
        band2.printMembers();

        System.out.println();
        MusicBand.transferMembers(band1.getMembers(), band2.getMembers());
        band1.printMembers();

    }
}
