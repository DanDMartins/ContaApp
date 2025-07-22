public class Account {
    // Criar os atributos
    //
    private double balance;
    private double specialLimit;

    public double consultBalance(){
        return this.balance;
    }
    // Para o depósito, o metodo checa se o valor é maior que 0 e atualiza esse valor ao balance atual com +=
    public void deposit(double value){
        if (value > 0){
            this.balance += value;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void withdraw(double value){
        if (value > 0 && value <= this.balance + this.specialLimit){
            this.balance -= value;
        } else {
            System.out.println("Valor para retirada inválido.");
        }
    }

    public void payBillet(double value){
        if (value > 0 && value <= this.balance + this.specialLimit){
            this.balance -= value;
        } else {
            System.out.println("Não foi possível efetuar este pagamento.");
        }
    }

    public boolean checkSpecialLimit(){
        return this.balance < 0;

    }

}
