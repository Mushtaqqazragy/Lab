import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5};
        System.out.println (Arrays.toString (x));
        System.out.println ("Arrays reverse");
        System.out.println (Arrays.toString (x));
    }
    public static int[] Enter(int[]z){
        int b=z.length-1;
        for (int i = 0; i < z.length/2; i++) {
            int e=z[i];
            z[i]=z[b];
            z[b]=e;
            b--;


        }
        return z;
    }
}
