package practise.task_1;

public class Main {
    public static void main(String[] args) {
        Printable newspaper = new Printable() {
            @Override
            public void print() {
                System.out.println("Newspapers");
            }
        };
        Book book = new Book();
        Magazine magazine = new Magazine();
        Printable[] text = {book, magazine, newspaper};
        for (Printable txt: text) {
            txt.print();
        }
    }
}
