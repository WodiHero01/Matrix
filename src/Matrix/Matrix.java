package Matrix;

public abstract class Matrix {
    int row;
    int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;

    }

    public abstract int getNbRow();
    public abstract int getNbCol();
    public abstract double getElement(int row, int col);
    public abstract void setElement(int row, int col, double value);
    public abstract Matrix transpose();

    public String toString() {
        return "La Matrice est de taille"+row+"x"+col;
    }

}
