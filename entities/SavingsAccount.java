package entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    //construtor geral

    public SavingsAccount() {

        super();

    }

    //construtor com argumentos

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {

        super(number, holder, balance);
        this.interestRate = interestRate;


    }

    //getters and setters

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {

        balance += balance * interestRate;

    }

    

    
}
