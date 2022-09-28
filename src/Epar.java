import java.util.Scanner;

//recebe um numero como parâmetro e verifica se é par ou não
public class Epar {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Digite um numero inteiro");

        int x = new Scanner(System.in).nextInt();

        if (NumeroImparPar(x)) {
            System.out.println("Resultado " + x + " ...numero Impar");
        } else {
            System.out.println("Resultado " + x + " ...numero Par");
        }

    }

    public static boolean NumeroImparPar(int x) {

        if (x % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }
}