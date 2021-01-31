package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        StringBuilder sb = new StringBuilder();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            s += i + " ";
        }
        System.out.println(s);
        long finish1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i);
            sb.append(" ");
        }
        System.out.println(sb);
        long finish2 = System.currentTimeMillis();

        System.out.println("Время выполнения программы при помощи конкатенации строк: " + (finish1 - start1));
        System.out.println("Время выполнения программы при помощи StringBuilder: " + (finish2 - start2));


    }
}
