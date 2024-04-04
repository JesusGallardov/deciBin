import java.util.Scanner;
public class deci_bina {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int decimal,modulo,aux;
        String binario = "";
        System.out.println("Ingresar numero decimal");
        decimal = read.nextInt();
        aux = decimal;
        
        while(decimal > 0){
        
        modulo = (decimal%2);
        binario = modulo + binario;
        decimal = decimal/2;
        
        }
        System.out.println("El numero "+aux+" base 10 es igual a = "+binario+" en base 2" );
    }
    
}
