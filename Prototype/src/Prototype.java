import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Prototype<T> implements Cloneable {

    private T object;

    public Prototype(String codePermanent) {
        try {
            // Appel de serveur
            TimeUnit.SECONDS.sleep(3);

            ServeurConnection sc = new ServeurConnection();
            String prepQuery = String.format("SELECT FROM student WHERE codePermanent == %s", codePermanent);
            Data dataStudent = sc.query(prepQuery);

            StudentDAO student = new StudentImpl(codePermanent);
            ArrayList<String> cours = (ArrayList) dataStudent.getValueOfkey("cours");
            student.setClasses(cours);
            this.object = (T) student;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Object clone() throws CloneNotSupportedException
    {
        Object newPrototype = super.clone();
        return newPrototype;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "object=" + object +
                '}';
    }
}
