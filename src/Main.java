import Matrix.*;
import Matrix.exp.*;

public class Main {
    public static void main(String[] args) {
    MatrixDiagonal mat1 = new MatrixDiagonal(2,3) ;
    try{
        mat1.setElement(0,0,3);
        mat1.setElement(1,1,3);
        mat1.setElement(1,2,3);
    } catch (DiagExp exp) {
        System.out.println(exp);
    }
    System.out.println(mat1.toString());

    MatrixRectangular mat2 = new MatrixRectangular(2,3);
    mat2.setElement(0,0,1);
    mat2.setElement(0,1,3);
    mat2.setElement(0,2,5);
    mat2.setElement(1,0,2);
    mat2.setElement(1,1,4);
    mat2.setElement(1,2,6);
    System.out.println(mat2.toString());

    mat2.transpose();
    System.out.println(mat2.transpose().toString());
    MatrixRectangular mat3 = new MatrixRectangular(2,3);
    mat3 = mat2.transpose();
    System.out.println(mat3.toString());

    MatrixSquare mat4 = new MatrixSquare(3);
    mat4.setElement(0,0,1);
    mat4.setElement(0,1,2);
    mat4.setElement(0,2,3);
    mat4.setElement(1,0,4);
    mat4.setElement(1,1,5);
    mat4.setElement(1,2,6);
    mat4.setElement(2,0,7);
    mat4.setElement(2,1,8);
    mat4.setElement(2,2,9);
    System.out.println(mat4.toString());
    MatrixSquare mat5 = new MatrixSquare(3);
    mat5 = mat4.transpose();
    System.out.println("mat squ traspose"+mat5.toString());
    try {
        mat4.getInvert();
    }
    catch (SquExp e) {
        System.out.println(e);
    }

    }


}