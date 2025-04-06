public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void borrowResource(Resource resource) {
        resource.borrow();
        System.out.println(name + " borrowed: " + resource.getTitle());
    }
}
