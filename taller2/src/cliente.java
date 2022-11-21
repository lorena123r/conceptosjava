import java.util.Scanner;
public class cliente {
     
    public static void main(String[] args) {
        //mostrar nombre de un cliente 
        Scanner scanner=new Scanner (System.in);
        System.out.println("ingrese un nombre");
        String Nom=scanner.nextLine();
        System.out.println("ingrese una edad");
        int Edad=scanner.nextInt();

        System.out.println("nombre" +Nom+" "+"edad" +Edad);
        
       } 
        
    }

