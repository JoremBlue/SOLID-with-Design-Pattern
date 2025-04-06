public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void borrowResource(Resource resource) {
        resource.borrow();
        // Additional logic for borrowing a resource
        System.out.println(name + " borrowed: " + resource.getTitle());
    }
}
