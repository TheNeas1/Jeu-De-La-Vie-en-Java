# Jeu-De-La-Vie-en-Java

Ce projet implémente le célèbre jeu de la vie de Conway en Java. Le jeu simule des cellules vivantes et mortes sur une grille. Chaque cellule évolue en fonction de l'état de ses voisines. Le but du jeu est d'observer l'évolution de la grille en fonction de règles simples définies par John Conway.

# Description

Le projet consiste en une simulation du jeu de la vie de Conway, où chaque cellule dans une grille peut être dans l'un des deux états suivants :

Vivante ou Morte

La règle de base est simple :

Une cellule vivante avec moins de 2 voisins vivants meurt (sous-population).
Une cellule vivante avec 2 ou 3 voisins vivants reste en vie.
Une cellule vivante avec plus de 3 voisins vivants meurt (surpopulation).
Une cellule morte avec exactement 3 voisins vivants devient vivante (reproduction).

# Fonctionnalités

1. Initialisation de la grille : Vous pouvez spécifier la taille de la grille (largeur et hauteur) ainsi que le nombre de cellules vivantes.
2. Insertion de motifs : Vous pouvez insérer des motifs pré-définis tels que :
 - Block : Un motif stable (immobile).
 - Frog : Un motif qui évolue avant de se stabiliser.
 - Glider : Un motif qui se déplace à travers la grille.
 - Canon de Gosper : Un motif complexe qui génère un "glider" infini.
3. Evolution du jeu : Le jeu évolue génération par génération selon les règles de Conway.
4. Affichage du jeu : Après chaque génération, l'état de la grille est affiché dans la console.

# Prérequis

Java 8+ : Le projet est conçu pour être exécuté sur une version Java 8 ou plus récente.

# Installation

1. Clonez ou téléchargez ce repository.
 - git clone https://github.com/TheNeas1/Jeu-de-la-vie-java.git

2. Compilez et exécutez le projet avec les commandes suivantes :

 - cd Jeu-De-La-Vie-en-Java
 - javac Main.java
 - java Main

# Utilisation

Étape 1 : Lancer le programme
Lorsque vous exécutez le programme, il vous demande d'entrer la taille de la grille (largeur et hauteur).

Étape 2 : Choisir un motif ou une initialisation aléatoire
Ensuite, vous pouvez choisir un motif à insérer dans la grille parmi les suivants :

Block (un motif stable)
Frog (un motif qui évolue)
Glider (un motif mobile)
Canon de Gosper (un motif complexe)
Initialisation aléatoire (vous spécifiez le nombre de cellules vivantes)

Étape 3 : Visualisation de l'évolution

Le programme affiche l'état de la grille à chaque génération, puis passe à la génération suivante selon les règles du jeu de la vie. Vous pouvez spécifier le nombre de générations à afficher.

Exemple d'interaction

Taille du jeu (largeur hauteur): 10 10
Choisissez un motif ou initialisation aléatoire:
1. Bloc
2. Grenouille
3. Planeur
4. Canon de Gosper
5. Initialisation aléatoire
Votre choix: 3
Combien de générations ? 2

Génération 1:
..........
..........
..........
..........
....**....
....**....
..........
..........
..........
..........

Génération 2:
..........
..........
..........
..........
....**....
....**....
..........
..........
..........
..........




