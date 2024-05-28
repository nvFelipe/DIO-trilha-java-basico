import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a Classe Scanner
        // Exibir as mensagens para nosso usuario:
        // Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem do desafio "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"."
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero da Conta: ");
        int conta = in.nextInt();
        in.nextLine();

        System.out.println("Digite o numero da Agencia: "); //o código não para para ler agencia
        String agencia = in.nextLine();
         
        System.out.println("Digite o nome do Cliente: ");
        String cliente = in.nextLine();

        System.out.println("Digite o Saldo: ");
        Double saldo = in.nextDouble();
        
        
     
         System.out.println("Olá, " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

         in.close();

    }
}
