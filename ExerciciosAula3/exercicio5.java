
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        System.out.print("Insira a primeira nota: ");
        float nota1 = ent.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float nota2 = ent.nextFloat();
        System.out.print("Insira a terceira nota: ");
        float nota3 = ent.nextFloat();

        System.out.println("Sua media final foi: "+ ((nota1+nota2+nota3)/3.0));

        ent.close();
    }
}
