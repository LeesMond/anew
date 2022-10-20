import java.util.Scanner;

public class gugudan{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      while(true){
        System.out.print("Insert num here >> ");
        int a = sc.nextInt();
        if(a == 0){
          break;
        }else if( a > 1 && a < 10){
          for(int i = 1; i <= 9; i++){
            System.out.println(a + " * " + i + " = " + (a*i));
          }
        }else{
          System.out.print("retry   ");
        }
      }
    }
}
