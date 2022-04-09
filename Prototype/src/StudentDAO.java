import java.util.ArrayList;
import java.util.List;

public interface StudentDAO {

    void setClasses(ArrayList classes);
    List<String> getClasses();

}
