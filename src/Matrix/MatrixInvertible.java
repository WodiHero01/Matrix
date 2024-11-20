package Matrix;

import Matrix.exp.InvExp;

public interface MatrixInvertible {
    public boolean isInvertible();
    public double getDeterminant();
    public Matrix getInvert() throws InvExp;
}
