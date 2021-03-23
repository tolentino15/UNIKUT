
package projeto.unikut;
import java.util.Scanner;
import com.Unikut.dados.CadastroConta;
public class ProjetoUNIKUT {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        CadastroConta usuarios = new CadastroConta ();
        int op;
        do{
            System.out.println("UNIKUT");
            loginOuCadastro();
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.println("Informe o login:");
                    String login = in.nextLine();
                    System.out.println("Informe a senha:");
                    String senha = in.nextLine();

                    break;
                case 2:
                    System.out.println("Informe o login:");
                    login = in.nextLine();
                    usuarios.cadastrar(login);
                    break;
                case 3:
                    System.out.println("Fim do programa.");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }while(op != 3);

    }

    public static void loginOuCadastro (){
        System.out.println("Menu de opções:");
        System.out.println("1-Entrar na conta.");
        System.out.println("2-Cadastrar conta.");
        System.out.println("3-Encerrar o programa.");
        System.out.println("Escolha uma opção:");
    }
}