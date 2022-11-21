import java.util.Scanner;
public class essimple {
    public static void main(String[] ar) {
    	Scanner scanner=new Scanner(System.in);
    	float sueldo;
    	System.out.print("Ingrese el sueldo:");
    	sueldo=scanner.nextFloat();
    	if (sueldo>3000) {
    	    System.out.println("Esta persona debe abonar impuestos");
    	}
    }
}
