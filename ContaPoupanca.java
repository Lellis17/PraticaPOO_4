public class ContaPoupanca extends Conta {
    private double saldo;
    @Override
    public void depositar (double valor){
        this.saldo += valor;
    }
    @Override
    public double getSaldo(){
        return this.saldo;
    }
    @Override
    public void sacar (double valor){
        this.saldo -= valor;
    }

}
