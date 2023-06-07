import java.util.Scanner;

public class LivrariaApplication{

        public static void main(String[] args) {
            System.out.println("Olá, mundo!");

            Scanner sc = new Scanner(System.in);
             
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();


            sc.close();

            System.out.println("Olá, " + nome + "!");

            if(idade >= 18) {
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você não é maior de idade!");
            }

        }
    
}