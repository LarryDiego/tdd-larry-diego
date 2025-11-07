import org.junit.Assert;
import org.junit.Test;

public class ContaBancariaTest {
    @Test
    public void deveDepositarUmValorNaContaQuandoUsarOMetodoDepositar() {
        ContaBancaria conta = new ContaBancaria(1994, "Larry", 0);
        double valorEsperado = 15.0;

        conta.depositar(15.0);
        double saldoFinal = conta.getSaldo();

        Assert.assertEquals(valorEsperado, saldoFinal, 0.0);
    }

    @Test
    public void devePermitirSacarValorDaContaQuandoInformadoValorMenorOuIgualAoSaldo() {
        ContaBancaria conta = new ContaBancaria(1994, "Larry", 50.0);
        double valorEsperado = 30.0;

        conta.sacar(20.0);
        double saldoFinal = conta.getSaldo();

        Assert.assertEquals(valorEsperado, saldoFinal, 0.0);
    }

    @Test
    public void deveManterOMesmoValorDaContaQuandoInformadoValorMaiorQueOSaldo() {
        ContaBancaria conta = new ContaBancaria(1994, "Larry", 50.0);
        double valorEsperado = 50.0;

        conta.sacar(100.0);
        double saldoFinal = conta.getSaldo();

        Assert.assertEquals(valorEsperado, saldoFinal, 0.0);
    }

    @Test
    public void deveRetornarOSaldoDaContaCorretamenteQuandoUsarOMetodoConsultarSaldo() {
        ContaBancaria conta = new ContaBancaria(1994, "Larry", 150.0);
        double valorEsperado = 100.0;

        conta.sacar(50);

        double saldoConta = conta.consultarSaldo();

        Assert.assertEquals(valorEsperado, saldoConta, 0.0);
    }
}