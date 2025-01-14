import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Demander la taille du jeu
        System.out.print("Taille du jeu (largeur hauteur): ");
        int largeur = scanner.nextInt();
        int hauteur = scanner.nextInt();
        JeuDeLaVie jeu = new JeuDeLaVie(largeur, hauteur);

        // Choisir un motif ou une initialisation aléatoire
        System.out.println("Choisissez un motif ou initialisation aléatoire:");
        System.out.println("1. Bloc");
        System.out.println("2. Grenouille");
        System.out.println("3. Planeur");
        System.out.println("4. Canon de Gosper");
        System.out.println("5. Initialisation aléatoire");
        System.out.print("Votre choix: ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                jeu.insererMotif(Motifs.BLOCK);
                break;
            case 2:
                jeu.insererMotif(Motifs.FROG);
                break;
            case 3:
                jeu.insererMotif(Motifs.GLIDER);
                break;
            case 4:
                jeu.insererMotif(Motifs.CANON_DE_GOSPER);
                break;
            case 5:
                System.out.print("Combien de cellules vivantes ? ");
                int nbCellules = scanner.nextInt();
                jeu.initialisationAleatoire(nbCellules);
                break;
            default:
                System.out.println("Choix invalide. Initialisation par défaut.");
                jeu.insererMotif(Motifs.BLOCK);
        }

        // Affichage du jeu
        System.out.print("Combien de générations ? ");
        int generations = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < generations; i++) {
            System.out.println("Génération " + (i + 1) + ":");
            System.out.println(jeu);
            jeu.suivant();
            Thread.sleep(500);  // Attendre 500ms entre chaque génération
            System.out.print("\033[H\033[2J");
        }
    }
}
