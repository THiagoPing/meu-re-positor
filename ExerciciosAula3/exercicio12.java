import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int n1 = ent.nextInt();

        double quadrado = Math.pow(n1, 2);
        System.out.println("Elevado ao quadrado: " + quadrado);

    
        double cubo = Math.pow(n1, 3);
        System.out.println("Elevado ao cubo: " + cubo);

        
        double raiz = Math.sqrt (n1);
        System.out.println("Elevado à raiz quadrada: " + raiz);
        

        double elevado = Math.pow(n1, 10);
        System.out.println("Elevado à 10: " + elevado);

        ent.close();
    }
}
