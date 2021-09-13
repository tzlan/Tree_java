public class Entier implements Sommable<Entier> {
    private Integer valeur;

    public Entier(Integer valeur) {
        this.valeur = valeur;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    @Override
    public Entier sommer(Entier objet) {
        this.valeur = this.valeur + objet.valeur;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entier{");
        sb.append("valeur=").append(valeur);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Entier entier = new Entier(1);
        entier.sommer(new Entier(2)).sommer(new Entier(3));
        System.out.println(entier); // 6
    }
}
