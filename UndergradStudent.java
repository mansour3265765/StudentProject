package proj1;

public class UndergradStudent extends Student {

    public UndergradStudent(String name, int id, double mark) {
        super(name, id, mark);
    }

    @Override
    public double getPassingMark() {
        return 60;
    }
}