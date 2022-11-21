
import java.util.Scanner;



public class contraseña {
       public static void main(String[] args)  {
       //crear la contraseña de un usuario
       Scanner leer=new Scanner(System.in);
       int login=0;
       int pass=0;
       int intentos=1;
       int maximo=3;
       while((login!=1809)||(pass!=1234)&& (intentos<maximo)){
					
        System.out.print("introduzca un login: ");
        login=leer.nextInt();
        System.out.print("Introduzca su pass:");
        pass=leer.nextInt(); 
        
        if(intentos==3){
            System.out.println("acceso denegado..");
            intentos=intentos-maximo;
        }
    
        intentos++;
        
    
    
    
}


System.out.println("login y pass, correctos...");
            
        }

        
        



}


