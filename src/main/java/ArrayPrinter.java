public class ArrayPrinter {

    public void printer(int[][] array, int o) {
        for (int d = 0; d < o; d++) {
            for (int s = 0; s < o; s++) {
                System.out.print(array[d][s] + "\t");
            }
            System.out.println();
        }
    }
}