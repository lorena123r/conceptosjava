import java.util.Scanner;
public class Fenacimiento {

    public static void main(String[] args) {
    //calcular fecha de nacimiento 
    int Edad, Añoactual, Fechanac;
    Scanner scanner=new Scanner(System.in);

    System.out.println("\n ingrese la edad:");
    Edad=scanner.nextInt();
    System.out.println("\n ingrese el año actual:");
    Añoactual=scanner.nextInt();
    Fechanac=Añoactual-Edad;
    System.out.println("\n su fecha de nacimiento es:"+Fechanac);
    scanner.close();
        
    }
    
}
