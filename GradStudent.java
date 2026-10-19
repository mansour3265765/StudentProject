package proj1;

public class GradStudent extends Student {

    public GradStudent(String name, int id, double mark) {
        super(name, id, mark);
    }

    @Override
    public double getPassingMark() {
        return 80;
    }
}