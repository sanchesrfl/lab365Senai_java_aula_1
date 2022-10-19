package entities;

// define que a classe tenha todos os dados e comportamentos da classe Account
public class BusinessAccount extends Account {

    //essa classe tem atributos e métodos adicionais em relação a classe mãe Account
    private Double loanLimit;

    //construtor geral ou padrão
    public BusinessAccount() {
        //vale a pena incluir o construtor padrão da superclasse para garantir que se houver alguma lógica no futuro seja replicada na subclasse
        super();

    }

    //construtor com argumentos = todos os dados da account + seu dado extra de limite de empréstimo
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        //construtor superclasse para os dados herdados - executa a lógica do construtor da classe base Account
        super(number, holder, balance);
        //dado da subclasse
        this.loanLimit = loanLimit;

    }

    //getters and setters da subclasse
    public Double getLoanLimit() {

        return loanLimit;
        
    }

    public void setLoanLimit(Double loanLimit) {

        this.loanLimit = loanLimit;

    }
    
    //operação de empréstimo
    public void loan(double amount) {

        if (amount <= loanLimit) {
            deposit(amount);
        }

    }
}
