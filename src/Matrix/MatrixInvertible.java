package Matrix;

import Matrix.exp.InvExp;
import Matrix.exp.SquExp;

/**
 * Interface pour la caractérisation des matrices inversibles.
 */
public interface MatrixInvertible {
    /**
     * Méthode abstraite pour verifier l'inversibilité d'une matrice
     * @return Booléen.
     */

    boolean isInvertible();

    /**
     * Permet d'obtenir le déterminant d'une matrice.
     * @return Determinant
     * @throws SquExp Nous n'avons pas de formule simple pour calculer le determinant d'une matrice carrée.
     */
    double getDeterminant() throws SquExp;

    /**
     * Donne l'inverse d'une matrice inversible.
     * @return Une nouvelle matrice inversée.
     * @throws InvExp La matrice n'est pas inversible.
     * @throws SquExp Nous n'avons pas de formule simple pour calculer le determinant d'une matrice carrée.
     */
    Matrix getInvert() throws InvExp,SquExp;
}
