import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Task4<T> {


    public static <T> void OReverse(T[] a) {
        T[] s = (T[]) new Object[a.length];

        for (int i = a.length - 1; i > 0; i--) {
            s[abs(i - a.length)] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            a[i] = s[i];
        }
    }

    public  <T> T[] merge(T[] first, T[] second) {
        T[] n = (T[]) new Object[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            n[i] = first[i];
        }
        for (int i = first.length; i < first.length + second.length - 1; i++) {
            n[i] = second[i - first.length];
        }
        return n;
    }

    public static <T> void print(T[] p) {

        for (T o : p) {
            System.out.print(o + ",");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        Character[] x = {'s', 'd', 'e', 'u', 'r', 'm'};
        Integer[] y = {23, 34, 67, 575, 4656, 34};
        String[] z = {" hello", " say it", " dare you", "I"};
        Task4 m = new Task4();


        OReverse(x);
        OReverse(y);
        OReverse(z);
        print(x);
        print(y);
        print(z);

        System.out.println("\n");

        print(m.merge(x , y));


    }


}
