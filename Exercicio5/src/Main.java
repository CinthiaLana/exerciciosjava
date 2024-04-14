public class Main {
    public static void main(String[] args) {
        printHeader(20, "Bem vindo ao Comex");
        printHeader(40, "Bem vindo ao Comex");
    }

    public static void printHeader(int size, String message) {
        printLine(size);
        System.out.println(message);
        printLine(size);
    }

    public static void printLine(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
