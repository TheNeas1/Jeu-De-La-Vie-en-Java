public class Motif {

    private final Cellule[][] grille;

    public Motif(Cellule[][] grille) {

        this.grille = grille;
    }

    public Cellule[][] getGrille() {
        return grille;
    }

    public int getLargeur() {
        return grille[0].length;
    }

    public int getHauteur() {
        return grille.length;
    }
}
