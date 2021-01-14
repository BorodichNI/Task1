public class Main {
    public static void main(String[] args) {

        Snake snake = new Snake();
        ArrayPrinter printer1 = new ArrayPrinter();
        printer1.printer(snake.aggregate(5));
        System.out.println("-----------------");
        Pyramid pyramid = new Pyramid();
        ArrayPrinter printer2 = new ArrayPrinter();
        printer2.printer(pyramid.aggregate(5));

    }
}
