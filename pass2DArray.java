import java.util.Scanner;


public class 2D{
  
  private static int r, c;
  



  public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter the number of rows");
    r = input.nextInt();
    
    System.out.println("Enter the number of columns");
    c = input.nextInt();
    
  }
  
  //this getArray method does not have a parameter
  public static int [][] getArray(){
  
  Scanner input = new Scanner(System.in);
  int [][] x = new int [r][c];
    
    
    
    for(int e = 0; e < x.length; e++){
      for(int t = 0; t < t[e].length; t++){
        x[e][t] = input.nextInt();
      }
    }
    
    
    
    
    
  }
  

}

