package proj1;
public abstract class Student implements MarkManagement {

    private String name;
    private int id;
    private double mark;

    public Student(String name, int id, double mark) {
        this.name = name;
        this.id = id;
        updateMark(mark);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public void updateMark(double mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        } else {
            throw new IllegalArgumentException(
                "Mark must be between 0 and 100."
            );
        }
    }

    public abstract double getPassingMark();

    public boolean isPassed() {
        return mark >= getPassingMark();
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("Passing Mark: " + getPassingMark());

        if (isPassed()) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        System.out.println("--------------------");
    }
}