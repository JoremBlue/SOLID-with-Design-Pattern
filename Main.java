public class Main {
    public static void main(String[] args) {
        Resource Book = new Book("Java Programming 101");
        Resource Journal = new Journal("NEU Research Journal - March Issue");

        Student student = new Student("Blue", 2012001525);

        student.borrowResource(Book);
        student.borrowResource(Journal);
    }
}
