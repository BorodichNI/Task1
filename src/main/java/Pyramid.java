public class Pyramid implements Aggregate {

    @Override
    public int[][] aggregate(int size) {
        int[][] array = new int[size][size];

        int row = 0;
        int col = 0;
        int step = 0;
        int i = 0;
        int x = 1;
        int c = 1;
        int v = 1;
        int a = 1;


        for (int z = 0; i < size * size - 1; z++) {

            for (int j = 0; j < size - step; j++) {
                array[row][col++] = x;
                i++;
            }
            x++;
            col--;
            ++step;

            for (int k = 0; k < size - step; k++) {
                array[++row][col] = c;
                i++;
            }
            c++;

            for (int l = 0; l < size - step; l++) {
                array[row][--col] = v;
                i++;
            }
            v++;
            ++step;

            for (int m = 0; m < size - step; m++) {
                array[--row][col] = a;
                i++;
            }

            a++;
            col++;
            if (size % 2 != 0) {
                for (int j = 0; j < size - step; j++) {
                    array[row][col] = x;
                }
            }

        }
        return array;
    }
}
