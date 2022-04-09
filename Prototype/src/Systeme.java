import java.util.ArrayList;

public class Systeme {

    public static void main(String[] args) {

        System.out.println("Program starting");
        System.out.println("Searching in database for student ... ");

        long startTime= System.currentTimeMillis();
        // recu d'un formulaire
        String codePermanent = "HUPF92810284";
        Prototype<StudentDAO> p1 = new Prototype(codePermanent);

        // do something
        ArrayList<String> classesStudent = new ArrayList<>(p1.getObject().getClasses());

        long checkpoint1 = System.currentTimeMillis();
        System.out.println("Protype 1 (getting data) :" + p1 + " => " +  (checkpoint1 - startTime) + "ms");

        // Nouveau protoype
        try {
            Prototype<StudentDAO> p2 = (Prototype) p1.clone();
            ArrayList<String> newClasses = new ArrayList<>();
            newClasses.add("INF1000");
            newClasses.add("INF2000");
            newClasses.add("INF3000");

            // do something
            p2.getObject().setClasses(newClasses);

            long checkpoint2 = System.currentTimeMillis();
            System.out.println("Prototype 2 (copying data) : " + p2 + " => " +  (checkpoint2 - checkpoint1) + "ms");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }





    }
}
