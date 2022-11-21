import java.util.Scanner;
public class estanidada {
    public static void main(String[] ar) {
        Scanner scanner=new Scanner(System.in);
        int nota1,nota2,nota3;
        System.out.print("Ingrese primer nota:");
        nota1=scanner.nextInt();
        System.out.print("Ingrese segunda nota:");
        nota2=scanner.nextInt();
        System.out.print("Ingrese tercer nota:");
        nota3=scanner.nextInt();
        int promedio=(nota1 + nota2 + nota3) / 3;
        if (promedio>=7) {
            System.out.print("Promocionado");    
        } else {
            if (promedio>=4) {
                System.out.print("Regular");
            } else {
                System.out.print("Reprobado");
            }
        }
    }
}

