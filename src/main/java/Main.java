public class Main {
    public static void main(String[] args) {

        Snake snake = new Snake();
        ArrayPrinter array1 = new ArrayPrinter();
        array1.printer(snake.aggregate(5), 5);
        System.out.println("-----------------");
        Pyramid pyramid = new Pyramid();
        ArrayPrinter array2 = new ArrayPrinter();
        array2.printer(pyramid.aggregate(5), 5);
    }
}
