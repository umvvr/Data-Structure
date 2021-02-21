package H.W;
import java.util.*;

public class Task3 {

    public static int findRepeated(int[] a , int size)
    {
        int s;
        int c = 0;
        for (int i = 0; i < size; i++) {
            c = 0;
            s = i;
            for (int j = 0; j < size; j++) {
                    if (a[i] == a[j])
                    {
                        c++;
                        s=a[i];
                    }
                    if (c>1)
                    {
                        return s;
                    }
            }
        }
        return 0;
    }

    public static String  findMultiRepeated(int[] a , int size)
    {

        int t = 0;
        String s = "";
        int c = 0;
        for (int i = 0; i < size; i++) {
            c = 0;

            if (i == a[i])
            {
                continue;
            }

            for (int j = 0; j < size; j++) {
                if (a[i] == a[j])
                {
                    c++;
                }
                if (c>1)
                {
                 s +=" " + a[i];
                 t++;
                 break;
                }
            }
            if (t>=5)
            break;
        }

        return s;
    }



    public static void main(String[] args) {
        int[] a = { 1 , 43 , 22 , 9 , 4 , 1};
        int[] b = { 1 , 1 , 2 , 2 , 3 , 4 , 5 ,4 ,3 ,5};



        System.out.println(findRepeated(a , a.length));
        System.out.println(findMultiRepeated(b , b.length));


    }
}
