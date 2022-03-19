import java.util.Arrays;
import java.util.Random;

public class RandomEntry {
    private int numOfElements;
    private int t[];
    public RandomEntry(int size){
        t=new int[size];
        numOfElements =size;
    }

    public int getNumOfElements() {
        return numOfElements;
    }

    public void setNumOfElements(int numOfElements) {
        this.numOfElements = numOfElements;
    }

    public int[] getX() {
        return t;
    }

    public void setX(int[] t) {
        this.t = t;
    }

    public int delete()
    {
        if (numOfElements >1)
        {
            int random=random(x.length);
            if (t[random-2]!=-2)
            {
                t[random-2]=-2;
                numOfElements--;
                return 0;
            }
            else {
                return -2;
            }



        }
        return -3;
    }
   public int random(int max)
    {
        Random random=new Random();
        return random.nextInt(max-1+ 1) +1;
    }

    public static void main(String[] args) {
            RandomEntry randomEntry =new RandomEntry(6);
            int []t={11,31,42,53,62};
            randomEntry.setX(t);


        int i=1;
        while (i<=8) {
            if(randomEntry.delete()==1)
            {
                System.out.println("Delleted ");
                i++;
                System.out.println(Arrays.toString(randomEntry.t));
            }
            else {
                    if (randomEntry.getNumOfElements()==1){
                        System.out.println("Array of empte");
                        

                    }
            }
        }
    }
}
