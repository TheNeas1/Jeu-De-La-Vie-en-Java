public class TextToMotifs {


        public static void main(String[] args) {
            // Le texte que nous voulons lire et transformer
            String[] texte = {
                "........................*...........",
                "......................*.*...........",
                "............**......**............**",
                "...........*...*....**............**",
                "**........*.....*...**..............",
                "**........*...*.**....*.*...........",
                "..........*.....*.......*...........",
                "...........*...*....................",
                "............**......................"
            };
    
            // Parcours du texte pour afficher chaque ligne
            for (int i = 0; i < texte.length; i++) {
                System.out.print("{ ");
                for (int j = 0; j < texte[i].length(); j++) {
                    char currentChar = texte[i].charAt(j);
                    if (currentChar == '.') {
                        System.out.print("new Cellule(false), ");
                    } else if (currentChar == '*') {
                        System.out.print("new Cellule(true), ");
                    }
                }
                System.out.println("}");
            }
        }
    }
    

    

