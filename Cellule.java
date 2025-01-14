public class Cellule {

    private boolean vivante;
    
    public Cellule(boolean vivante) {
        this.vivante = vivante;
    }

    public boolean estVivante() {
        return vivante;
    }

    public void setVivante(boolean vivante) {
        this.vivante = vivante;
    }

    public String toString() {
        return vivante ? "*" : ".";
    }

}
