
package introducaojava;

import java.util.Scanner;


public class IntroducaoJava {

    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println ("Informe o comprimento");
        double comprimento = leia.nextDouble();
        
        System.out.println ("Informe a largura");
        double largura = leia.nextDouble();
        
        double resultado = comprimento * largura;
        System.out.println(resultado);
    }
    
}
