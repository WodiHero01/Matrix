package Matrix;

import Matrix.exp.*;

public class MatrixDiagonal extends Matrix implements MatrixInvertible{
    /**
     * Classe permettant de créer des matrices diagonales.
     * @param elements Vecteur lignes contenant les éléments de la diagonale.
     */
    private double[] elements ;

    /**
     * Constructeur de matrice diagonale
     * @param row Nombre de lignes
     * @param col Nombre de colonnes
     * Elements va prendre la dimension <b>la plus petite</b>.
     */
    public MatrixDiagonal(int row , int col ){
        super(row,col);
        if(row > col){
            elements = new double[col]; // Attention au if pour la taille (le plus petit elements)
        }
        else{
            elements = new double[row];
        }
    }

    /**
     * Récupération de l'élément i, j.
     * @param row Ligne i
     * @param col Colonne j
     * @return Element à la position i, j.

     */
    public double getElement(int row, int col) {
        if (row == col) {
            return elements[row]; // idem
        } else {
            return 0;
        }
    }

    /**
     * Définition de l'élément i, j.
     * @param row Ligne i
     * @param col Colonne j
     * @param value Valeurs de l'élément (i, j)
     * @throws DiagExp Exception levée si nous ne choisissons pas un élément diagonal.
     */
    public void setElement(int row, int col, double value) throws DiagExp {
        if (row != col) {
            DiagExp exp = new DiagExp("you have not selected a diagonal element");
            throw exp;
        }
            elements[row] = value;

    }

    /**
     *Permet de transposer la matrice.
     * @return Renvoie une nouvelle matrice transposée.
     */
    public MatrixDiagonal transpose() {
        MatrixDiagonal mat = new MatrixDiagonal(row,col) ;
        mat.elements = elements;
        return mat;
    }

    /**
     * Méthode abstraite pour verifier l'inversibilité d'une matrice
     * @return Booléen.
     */
    public boolean isInvertible() {
        return getDeterminant() != 0;
    }
    /**
     * Permet d'obtenir le déterminant d'une matrice.
     * @return Determinant
    */

    public double getDeterminant() {
        double determinant = 1;
        for (int i = 0; i < row; i++) {
            determinant *= elements[i];
        }
        return determinant;
    }
    /**
     * Donne l'inverse d'une matrice inversible.
     * @return Une nouvelle matrice inversée.
     * @throws InvExp La matrice n'est pas inversible.
     */
    public Matrix getInvert() throws InvExp{
        if (!isInvertible()) {
            InvExp exp = new InvExp("La matrice n'est pas inversible.");
            throw exp;
        }
        else {
            MatrixDiagonal mat = new MatrixDiagonal(row,col) ;
            for (int i = 0; i < row; i++) {
                mat.elements[i] = 1/elements[i];
            }
            return mat;
        }
    }

    /**
     * To string adapté aux matrices diagonales.
     * @return les dimensions de la matrice et le vecteur des éléments diagonaux.
     */
    public String toString() {
        String str = "Matrice de dimension "+this.row+" x "+this.col +" avec le vecteurs des éléments diagonaux de la matrice : \n [";
        for (int i = 0; i < row-1; i++) {
            str += elements[i]+", ";
        }
    return str+elements[row-1]+"]";
    }
}

