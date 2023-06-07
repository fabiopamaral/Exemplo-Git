import java.util.Scanner;

public class LivrariaApplication{

        public static void main(String[] args) {
            System.out.println("Olá, mundo!");

            Scanner sc = new Scanner(System.in);
             
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();


            sc.close();

            System.out.println("Olá, " + nome + "!");


        }
    
}