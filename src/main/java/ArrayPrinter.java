public class ArrayPrinter {

    public void print(int[][] array) {
        for (int d = 0; d < array.length; d++) {
            for (int s = 0; s < array.length; s++) {
                System.out.print(array[d][s] + "\t");
            }
            System.out.println();
        }
    }
}
