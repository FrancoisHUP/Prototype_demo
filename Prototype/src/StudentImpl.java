import java.util.ArrayList;

public class StudentImpl implements StudentDAO,Cloneable {

    private final String codePermanent;
    private ArrayList<String> classes;

    public StudentImpl(String codePermanent) {
        this.codePermanent = codePermanent;
    }

    @Override
    public void setClasses(ArrayList classes) {
        this.classes = classes;
    }

    @Override
    public ArrayList<String> getClasses() {
        return classes;
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "codePermanent='" + codePermanent + '\'' +
                ", classes=" + classes +
                '}';
    }
}
