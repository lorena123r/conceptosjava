import java.util.Scanner;
public class estdoble {
    public static void main(String[] ar) {
    Scanner scanner=new Scanner(System.in);
    int num1,num2;
    System.out.print("Ingrese primer valor:");
    num1=scanner.nextInt();
    System.out.print("Ingrese segundo valor:");
    num2=scanner.nextInt();
    if (num1>num2) {
        System.out.print(num1);
    } else {
        System.out.print(num2);
    }
}
    
}
