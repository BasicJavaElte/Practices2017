package models;
public class MyMatrix{
  int[][] matrix;

  public MyMatrix(int size){
    this.matrix=new int[size][size];
  }

  public void addToMatrix(int line, int col, int number){
    this.matrix[line][col] = number;
  }


}
