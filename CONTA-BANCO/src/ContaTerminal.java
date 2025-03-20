import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco MCS!");
        String agencia = capturarEntrada(sc, "Digite o número da agência: ");
        int numeroConta = Integer.parseInt(capturarEntrada(sc, "Digite o número da conta: "));
        String nomeCliente = capturarEntrada(sc, "Digite seu nome completo: ");
        BigDecimal saldo = new BigDecimal(capturarEntrada(sc, "Digite o valor inicial da conta: "));

        ContaBancaria conta = new ContaBancaria(agencia, numeroConta, nomeCliente, saldo);
        conta.exibirMensagemBoasVindas();

        sc.close();
    }

    private static String capturarEntrada(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextLine();
    }
}
