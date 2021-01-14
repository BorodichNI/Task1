public class Snake implements Aggregate {

    @Override
    public int[][] aggregate(int size) {
        int[][] array = new int[size][size];

        int row = 0;
        int col = 0;
        int step = 0;
        int index = 0;

        for (int z = 0; index < size * size - 1; z++) {

            for (int j = 0; j < size - step; j++) {
                array[row][col++] = ++index;
            }
            col--;
            ++step;

            for (int k = 0; k < size - step; k++) {
                array[++row][col] = ++index;
            }

            for (int l = 0; l < size - step; l++) {
                array[row][--col] = ++index;
            }
            ++step;

            for (int m = 0; m < size - step; m++) {
                array[--row][col] = ++index;
            }
            col++;

            if (size % 2 != 0) {
                for (int b = 0; b < size - step; b++) {
                    array[row][col] = ++index;
                }
            }
        }
        return array;
    }

}
