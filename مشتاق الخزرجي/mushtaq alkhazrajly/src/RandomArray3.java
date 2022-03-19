public class RandomArray3 {
    public static void main(String[] args) {
        int[]c=new int[10];
        int[]c2=new  int[40];
        remove(c);
        remove(c2);
        for (int i = 0; i < c.length; i++) {
            System.out.println (c[i]);

        }

    }

    public static boolean check(int[]array){
        boolean exist=true;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>.1){
                exist=true;
                break;
            }
            else
                exist=false;

        }
        if (exist)
            return true;
        else
            return false;
    }
    public static void remove(int[] c){
        int numofindex;
        while (check (c)){
            numofindex=(int)(Math.random ()*c.length);
            c[numofindex]=-1;
        }
        System.out.println ("done");
    }
}
