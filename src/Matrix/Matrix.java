package Matrix;

import Matrix.exp.DiagExp;

/**
 * Classe abstraite permettant de donner les dimensions aux classes filles : Diagonale et rectangle (et carré par la suite)
 * @author pauly
 * @author matagrin
 */
public abstract class Matrix {

    protected int row;
    protected int col;
    protected char type = 'M'; // M pour Matrix, D pour Diagonal, R pour Rectangular, C pour Carre 

/**
 * Champs :
 * @param row nombre de lignes
 * @param col nombre de colonnes
 */


    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
    /**
     * Constructeur via les dimensions
     */
        // Ne pas oublier de faire des exceptions : entiers négatifs
    }

    /**
     * Permet de retourner le nombre de lignes
     * @return nombre de lignes
     */
    public int getNbRow(){
        return row;
    }

    /**
     * Permet de retourner le nombre de colonnes
     * @return nombre de colonnes
     */

    public int getNbCol(){
        return col;
    }

    /**
     * Permet de recuperer l'élément de position (i,j).
     * @param row Ligne i
     * @param col Colonne j
     * @return Elément de position (i,j)
     */
    public abstract double getElement(int row, int col);

    /**
     * Permet de définir l'élément à la position (i,j).
     * @param row Ligne i
     * @param col Colonne j
     * @param value Valeurs de l'élément (i,j)
     */
    public abstract void setElement(int row, int col, double value) throws DiagExp;

    /**
     * Permet de transposer la matrice
     * @return Une nouvelle matrice transposée
     */
    public abstract Matrix transpose();

    /**
     * Methode toString qui renvoit les dimensions
     * @return Les dimensions
     */
    public String toString() {
        return "La Matrice est de taille"+row+"x"+col;
    }

}
