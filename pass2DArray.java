import java.util.Scanner;


public class 2D{



  public static void main(String [] args){
    
  }
  
  
  public static int [][] getArray(int [][] x){
  
  Scanner input = new Scanner(System.in);
  
    for(int r = 0; i < x.length; i++){
      for(int c = 0; c < x[r].length; c++){
        x[r][c] = input.nextInt();
      }
    }
  }
  

}

