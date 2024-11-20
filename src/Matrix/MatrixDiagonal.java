package Matrix;

import Matrix.exp.*;


public class MatrixDiagonal extends Matrix implements MatrixInvertible{
    double[] elements ;

    public MatrixDiagonal(int row , int col ){
        super(row,col);
        MatrixDiagonal mat = new MatrixDiagonal(row,col) ;
        mat.elements = new double[row];
    }

    public double getElement(int row, int col) {
        if (row == col) {
            return elements[row];
        } else {
            return 0;
        }
    }
    public void setElement(int row, int col, double value) throws DiagExp {
        if (row != col) {
            DiagExp exp = new DiagExp("you have not selected a diagonal element");
            throw exp;
        }
            elements[row] = value;

    }
    public Matrix transpose() {
        MatrixDiagonal mat = new MatrixDiagonal(row,col) ;
        mat.elements = elements;
        return mat;
    }

    public boolean isInvertible() {
        if (getDeterminant() == 0){
            return false;
        }
        else {
            return true;
        }
    }


    public double getDeterminant() {
        double determinant = 1;
        for (int i = 0; i < row; i++) {
            determinant *= elements[i];
        }
        return determinant;
    }

    public Matrix getInvert() throws InvExp{
        if (!isInvertible()) {
            InvExp exp = new InvExp("you have not selected a diagonal element");
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

    public String toString() {
        return "Matrice de dimension "+this.row+" x "+this.col;
    }
}

