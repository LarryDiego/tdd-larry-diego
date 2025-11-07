import org.junit.Assert;

public class ContaBancariaTest {
    @Test
    public void deveDepositarUmValorNaContaQuandoUsarOMetodoDepositar() {
        ContaBancaria conta = new ContaBancaria(1994, "Larry", 0);
        double valorEsperado = 15.0;

        conta.depositar(15.0);
        double saldoFinal = conta.getSaldo();

        Assert.assertEquals(valorEsperado, saldoFinal, 0.0);
    }
}