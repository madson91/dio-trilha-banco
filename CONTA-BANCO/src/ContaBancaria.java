import java.math.BigDecimal;

public class ContaBancaria {
    private String agencia;
    private int numeroConta;
    private String nomeCliente;
    private BigDecimal saldo;

    public ContaBancaria(String agencia, int numeroConta, String nomeCliente, BigDecimal saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirMensagemBoasVindas() {
        System.out.printf(
            "\nOlá %s, obrigado por criar uma conta em nosso banco.%n" +
            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
            nomeCliente, agencia, numeroConta, saldo
        );
    }
}
