public class JeuDeLaVie {

    private int WIDTH;
    private int HEIGHT;
    private Cellule[][] grille;

    public JeuDeLaVie(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        grille = new Cellule[WIDTH][HEIGHT];
        initialiserGrille(grille);
    }

    private void initialiserGrille(Cellule[][] grille) {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                grille[i][j] = new Cellule(false);
            }
        }
    }

    public void initialisationAleatoire(int nbCellules) {
        for (int i = 0; i < nbCellules; i++) {
            int x = (int) (Math.random() * WIDTH);
            int y = (int) (Math.random() * HEIGHT);
            grille[x][y].setVivante(true);
        }
    }

    private int nbVoisins(int x, int y) {
        int nb = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < WIDTH && j >= 0 && j < HEIGHT && !(i == x && j == y)) {
                    if (grille[i][j].estVivante()) {
                        nb++;
                    }
                }
            }
        }
        return nb;
    }

    public void suivant(){
        Cellule[][] grilleSuivante = new Cellule[WIDTH][HEIGHT];
        initialiserGrille(grilleSuivante);
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                int nb = nbVoisins(i, j);
                if (grille[i][j].estVivante()) {
                    if (nb == 2 || nb == 3) {
                        grilleSuivante[i][j].setVivante(true);
                    } else {
                        grilleSuivante[i][j].setVivante(false);
                    }
                } else {
                    if (nb == 3) {
                        grilleSuivante[i][j].setVivante(true);
                    } else {
                        grilleSuivante[i][j].setVivante(false);
                    }
                }
            }
        }
        grille = grilleSuivante;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                sb.append(grille[i][j].toString());
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    // Méthode pour insérer un motif dans la grille
    public void insererMotif(Motif motif) {
        int motifWidth = motif.getGrille().length;
        int motifHeight = motif.getGrille()[0].length;

        // Si le motif est plus grand que la grille, redimensionner la grille
        if (motifWidth > WIDTH || motifHeight > HEIGHT) {
            redimensionnerGrille(motifWidth, motifHeight);
        }

        // Calculer la position du centre
        int x = (WIDTH - motifWidth) / 2;
        int y = (HEIGHT - motifHeight) / 2;
        

        // Insérer le motif à la position centrale
        for (int i = 0; i < motifWidth; i++) {
            for (int j = 0; j < motifHeight; j++) {
                grille[i + x][j + y] = motif.getGrille()[i][j];
            }
        }
    }
    
    // Méthode pour redimensionner la grille
    private void redimensionnerGrille(int motifWidth, int motifHeight) {
        
        // Nouvelle taille de la grille
        WIDTH = motifWidth;
        HEIGHT = motifHeight;
        grille = new Cellule[WIDTH][HEIGHT];
        initialiserGrille(grille);
    }


}