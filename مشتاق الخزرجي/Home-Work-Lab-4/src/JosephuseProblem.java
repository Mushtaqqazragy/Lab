public class JosephuseProblem {
    CicleQueue<Integer>  = new CicleQueue<>();

    public void Circle(int n, int e) {
        for (int j = 1; j <= m; j++) {
            cicleQueue.enqueue(j);
        }


        while (cicleQueue.size() > 1) {
            for (int i = 1; i <= e; i++) {
                if (i == e) {
                    System.out.println(cicleQueue.dequeue());
                    break;
                }
                cicleQueue.rotet();
            }

        }
            System.out.println("Size "+cicleQueue.size());
            System.out.println("winder "+cicleQueue.first());


    }

}
