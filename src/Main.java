import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(3, "Xavier", 20));
        etudiants.add(new Etudiant(2, "Oscar", 22));
        etudiants.add(new Etudiant(1, "Ronaldinho", 19));
        etudiants.add(new Etudiant(4, "Messi", 21));

        System.out.println("Tous les étudiants :");
        management.displayStudents(etudiants, etudiant -> System.out.println(etudiant));

        System.out.println("\nÉtudiants de plus de 20 ans :");
        management.displayStudentsByFilter(etudiants, etudiant -> etudiant.getAge() > 20, etudiant -> System.out.println(etudiant));

        System.out.println("\nNoms des étudiants :");
        String noms = management.returnStudentsNames(etudiants, Etudiant::getNom);
        System.out.println(noms);

        System.out.println("\nCréation d'un nouvel étudiant :");
        Supplier<Etudiant> etudiantSupplier = () -> new Etudiant(5, "Eve", 23);
        Etudiant nouvelEtudiant = management.createStudent(etudiantSupplier);
        System.out.println("Nouvel étudiant créé : " + nouvelEtudiant);
        etudiants.add(nouvelEtudiant);
// 6. Convertir la liste d'étudiants en List et afficher
        System.out.println("\nÉtudiants convertis en List :");
        List<Etudiant> etudiantsList = management.convertToList(etudiants);
        etudiantsList.forEach(etudiant -> System.out.println(etudiant));

        // Tri des étudiants par ID
        List<Etudiant> etudiantsTries = management.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));

        // Affichage des étudiants après le tri
        System.out.println("\nÉtudiants après le tri par ID :");
        management.displayStudents(etudiantsTries, etudiant -> System.out.println(etudiant));
    }


    }
