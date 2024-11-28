package Matrix;
import Matrix.exp.*;

public class MatrixSquare extends MatrixRectangular implements MatrixInvertible{
    /**
     * Classe qui permet de créer des matrices carres
     * @param n dimension de la matrice
     */
    public MatrixSquare(int n) {
        super(n, n);
    }

    /**
     * Méthode qui transpose la matrice cible
     * @return la matrice transposée
     */
    public MatrixSquare transpose() {
        MatrixSquare mat = new MatrixSquare(row) ; // inverser les dim
        for (int i = 0; i < elements[0].length; i++) {
            for (int j = 0; j < elements.length; j++) {
                mat.setElement(i, j, elements[j][i]);
            }
        }
        return mat ;
    }


    /**
     * Méthode qui retourne le déterminant de la matrice
     * @return déterminant de la matrice
     */

    public double getDeterminant() throws SquExp{
        throw new SquExp("Les formules pour une matrice carrée sont trop complexe à implémenter.");
    }
    /**
     * Cette méthode renvoie un booléen qui témoigne de l'inversibilité de la matrice
     * @return true ou false si inversible ou non
     */

    public boolean isInvertible() {
        return false;
    }



    /**
     * Cette méthode renvoie la matrice inversée
     * @return la matrice inversée
     * @throws SquExp exception car l'inverse est trop complexe à calculer
     */

    public MatrixSquare getInvert() throws SquExp {
        throw new SquExp("Les formules pour une matrice carrée sont trop complexe à implémenter.");
    }
}
