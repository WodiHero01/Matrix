package Matrix;

public class MatrixRectangular extends Matrix {
    /**
     * Classe permettant de créer des matrices rectangulaires.
     * @param elements Vecteur de vecteurs contenant tous les éléments.
     */
    protected double[][] elements;
    public MatrixRectangular(int row, int col) {
        super(row, col);
        elements = new double[row][col];

    }

    /**
     * Récupération de l'élément i, j.
     * @param row Ligne i.
     * @param col Colonne j.
     * @return Element à la position i, j.
     */
    public double getElement(int row, int col) {
        return elements[row][col];
    }

    /**
     * Définition de l'élément i, j.
     * @param row Ligne i
     * @param col Colonne j
     * @param value Valeurs de l'élément (i, j)
     */
    public void setElement(int row, int col, double value) {
        elements[row][col] = value;
    }

    /**
     * Permet de transposer la matrice.
     * @return Renvoie une nouvelle matrice transposée.
     */
    public MatrixRectangular transpose() {
        MatrixRectangular mat = new MatrixRectangular(elements[0].length, elements.length) ; // inverser les dim
        for (int i = 0; i < elements[0].length; i++) {
            for (int j = 0; j < elements.length; j++) {
                mat.setElement(i, j, elements[j][i]);
            }
        }
    return mat ;
    }

    /**
     * Méthode to String réécrite adapté aux matrices rectangulaires.
     * @return Les éléments de la matrice affichés sous forme de matrices.
     */
    public String toString() {
        String str ="Matrice : \n[";
        for (int i = 0; i < elements[0].length; i++) {
            str+="[";
            for (int j = 0; j < elements.length; j++) {
                str += elements[j][i] + " ";
            }
            str += "]\n";
        }
        return str+"]";

    }
}
