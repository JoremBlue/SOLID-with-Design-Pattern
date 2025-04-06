public class AudioBook implements Resource {
    private String title;

    public AudioBook (String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing audiobook: " + title);
    }
}
