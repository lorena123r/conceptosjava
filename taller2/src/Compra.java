import java.util.Scanner;
public class Compra {
public static double calcularIva(double p){
    double Iva;
    Iva=p * 0.19;
    return Iva;

}
    public static void main(String[] args) {
        //calcyular el iva de una compra 
        Scanner scanner=new Scanner(System.in);
        double Precio_compra, Iva;
        System.out.println("\n ingrese el precio de la compra:");
        Precio_compra=scanner.nextDouble();

        Iva=calcularIva(Precio_compra);
        System.out.println("El precio total sin Iva es de:"+Precio_compra);
        System.out.println("El precio a pagar (Iva incluido)es de:"+(Precio_compra+Iva));

    
}
}
