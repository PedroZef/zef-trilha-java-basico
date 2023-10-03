import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //Obter pela scanner os valores digitados no terminal/
        Scanner input = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

         //Exibir as mensagens para nosso usuário
        System.out.print("Digite o número da conta: ");
        numero = Integer.parseInt(input.nextLine());

        System.out.print("Digite o nome da agência: ");
        agencia = input.next();

        System.out.print("Digite seu nome: ");
        nomeCliente = input.nextLine();

        System.out.print("Digite seu saldo: ");
        saldo = input.nextDouble();


        //Exibir a mensagem da conta criada
        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s" +
            ", conta %d e seu saldo %.2f." + "Já está disponível para saque." +
             " Entre em contato conosco e estamos à disposição para ajudar!.",
            nomeCliente, agencia, numero, saldo);

        input.close();
    }

}
   
         
 
        
       



