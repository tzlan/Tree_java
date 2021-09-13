public class Chaine implements Sommable<Chaine> {
    private String valeur;

    public Chaine(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public Chaine sommer(Chaine objet) {
        this.valeur = this.valeur + objet.valeur;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Chaine{");
        sb.append("valeur='").append(valeur).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Chaine chaine = new Chaine("A");
        chaine.sommer(new Chaine("B")).sommer(new Chaine("C"));
        System.out.println(chaine); // ABC
    }
}
