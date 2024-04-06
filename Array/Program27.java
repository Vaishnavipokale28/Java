
import java.util.Arrays;

class Program27 {
    public static void main(String args[]) {
        int a[] = {23, 24, 18, 16, 30, 36, 22, 32, 12, 15, 17, 37};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0 && a[i] % 6 == 0)
                b[i] = -3;
            else if (a[i] % 4 == 0)
                b[i] = -1;
            else if (a[i] % 6 == 0)
                b[i] = -2;
            else
                b[i] = a[i];
        }
        System.out.println(Arrays.toString(b));
    }
}
