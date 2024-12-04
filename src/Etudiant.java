public class Etudiant {
    // Attributs de la classe
    private int id;
    private String nom;
    private int age;

    // Constructeur sans paramètre
    public Etudiant() {
        this.id = 0;
        this.nom = "";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Etudiant(int id, String nom, int age) {
        this.id = id;
        this.nom = nom;
        this.age = age;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}