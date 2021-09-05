public class Random {
    public static void main(String[] args) {
        int CELL_COUNT = 8;
        int randomNum = 0;
        int max = 0;
        int[] tab = new int[CELL_COUNT];

        for (int i = 0; i < tab.length; i++) {
            randomNum = (int) (Math.random() * 10);
            tab[i] = randomNum;
            tab[1] = max;
            if (tab[i] > max)
                max = tab[i];
            System.out.print(tab[i] + ", ");
        }
        System.out.println("max = " + max);
        System.out.println();
    }
}


