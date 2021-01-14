public class Main {
    public static void main(String[] args) {

        ArrayPrinter printer = new ArrayPrinter();
        Snake snake = new Snake();
        printer.print(snake.aggregate(5));
        System.out.println("-----------------");
        Pyramid pyramid = new Pyramid();
        printer.print(pyramid.aggregate(5));

    }
}
