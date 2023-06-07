import java.util.Scanner;

public class LivrariaApplication{

        public static void main(String[] args) {
            System.out.println("Olá, mundo!");

            Scanner sc = new Scanner(System.in);
            
            Usuario usuario = new Usuario();
             
            System.out.println("Digite seu nome: ");
            usuario.setNome(sc.nextLine());

            System.out.println("Digite sua idade: ");
            usuario.setIdade(sc.nextInt());


            sc.close();

            System.out.println("Olá, " + usuario.getNome() + "!");

            if(usuario.getIdade() >= 18) {
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você não é maior de idade!");
            }

        }
    
}