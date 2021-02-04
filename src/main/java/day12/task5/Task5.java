package day12.task5;

import day12.task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersBand1 = new ArrayList<>();
        membersBand1.add(new MusicArtist("Stian Tomt Thoresen", 44));
        membersBand1.add(new MusicArtist("Sven Atle Kopperud",44));
        membersBand1.add(new MusicArtist("Thomas Rune Andersen", 44));

        List<MusicArtist> membersBand2 = new ArrayList<>();
        membersBand2.add(new MusicArtist("Adam Nergal Darski", 43));
        membersBand2.add(new MusicArtist("Tomasz Wroblewski",40));
        membersBand2.add(new MusicArtist("Zbigniew Prominski", 42));
        membersBand2.add(new MusicArtist("Patryk Dominik Sztyber", 41));

        day12.task5.MusicBand band1 = new day12.task5.MusicBand("Dimmu Borgir", 1994, membersBand1);
        day12.task5.MusicBand band2 = new day12.task5.MusicBand("Behemoth", 1991, membersBand2);
        /*Не совсем понимаю, несмотря на то, что task5 и MusicBand находятся в одном пакете,
        компилятор пытается выполнить по умолчанию MusicBand из пакета task4. Пришшлось уточнить команду.
         */

        band1.printMembers();
        band2.printMembers();

        System.out.println();
        day12.task5.MusicBand.transferMembers(band1.getMembers(), band2.getMembers());
        band1.printMembers();

    }
}
