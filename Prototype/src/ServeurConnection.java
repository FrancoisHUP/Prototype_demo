import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Server mock
 */
public class ServeurConnection {

    public Data query(String query) {
        // mock les donnees d'un objet noSQL
        Data data = new Data<>();
        ArrayList cours = new ArrayList(Arrays.asList(
                "INF3000",
                "INF4000",
                "INF5000"));
        data.setKeyValue("cours",cours);
        return data;
    }

}
