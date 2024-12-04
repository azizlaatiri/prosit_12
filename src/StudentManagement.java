import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StudentManagement implements Management {

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        for (Etudiant etudiant : students) {
            con.accept(etudiant);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etudiant : students) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        StringBuilder names = new StringBuilder();
        for (Etudiant etudiant : students) {
            names.append(fun.apply(etudiant)).append(", ");
        }
        // Enlever la dernière virgule et l'espace
        if (names.length() > 0) {
            names.setLength(names.length() - 2);
        }
        return names.toString();
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        // Utilisation de Collections.sort pour trier la liste
        Collections.sort(students, com);
        return students; // Retourne la liste triée
    }

    public List<Etudiant> convertToList(List<Etudiant> students) {
        return students; // Retourne simplement la liste
    }
}