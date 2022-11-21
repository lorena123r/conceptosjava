import java.util.Scanner;

public class Fecha   {
    
    public static void main(String[] args)  {
        //calcular la edad de una persona
        int Añoactual, AñoDeNacimiento, edad;
         Scanner scanner=new Scanner(System.in);

        System.out.println("\n ingrese  el año actual:");
        Añoactual=scanner.nextInt();
        System.out.println("\n ingrese  el año de nacimiento:");
        AñoDeNacimiento=scanner.nextInt();
        edad=Añoactual-AñoDeNacimiento;
        System.out.println("\n su edad es:"+edad);
     scanner.close();
    }
}
