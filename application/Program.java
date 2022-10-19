package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    
    public static void main(String[] args) {

        
            
                BusinessAccount account = new BusinessAccount(2232,"Joachim", 0.0, 100.0);

                account.getBalance();

                Account acc = new Account(1001, "Pedro", 0.0);

                BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

                // POLIMORFISMO 
                //typecasting for objects

                // ** UP CASTING ** -- //

                Account acc1 = bacc;
                //essa operação não da erro, o upcasting, pois é uma relação é-um. ou seja, a businessaccount tbm é uma account.

                //diferença entre as variáveis - a bacc virou uma account, e perdeu os métodos específicos da businessAccount


                //ACESSA METODOS CHILD
                bacc.setLoanLimit(200.0);

                //NAO ACESSA METODOS CHILD
                acc1.setLoanLimit(200.0);

                //continuação de *** UPCASTING ***//
                // como todas as subclasse são também um objeto superclasse interiormente
                //posso criar variaveis do tipo Account chamando construtores das subclasses

                Account acc2 = new BusinessAccount(1003, "Rique",0.0, 200.0);

                Account acc3 = new SavingsAccount(1004, "Jake", 0.0, 0.01);

                //para provar que é possível fazer esse upcasting, vemos que os métodos específicos das subclasses não podem ser chamados
                // NENHUMA DS DUAS ACESSAM OS METODOS CHILD, SE EU PRECISAR, O QUE FAZER? DOWNCASTING!
                acc2.setLoanLimit(200.0);

                acc3.updateBalance();

                // primeiro exemplo de DOWNCASTING

                //tenho a savingaccount do tipo account, preciso acessar seus metodos especificos. Como fazer? Downcasting.
                SavingsAccount accs = (SavingsAccount)acc3;

                System.out.println(accs.getInterestRate());



                // DOWN CASTING -- da superclasse para a subclasse
                // exemplo, preciso realizar um empréstimo em uma conta genérica, que não tem esse método
                // o q fazer? Downcasting

                BusinessAccount acc4 = /*coloco na mão a subclasse para o casting*/ (BusinessAccount)acc2;

                acc4.setLoanLimit(3500.0);
                acc4.loan(2500.0);

                System.out.println(acc4.getBalance());

                // para ficar mais seguro, utilizar instanceof para testar se a variável é uma instancia da classe que queremos converter

                if (acc3 instanceof BusinessAccount) {

                    BusinessAccount acc5 = (BusinessAccount)acc3;
                    acc5.loan(300.0);
                    System.out.println("Loan!");

                }
                if (acc3 instanceof SavingsAccount){

                    SavingsAccount acc5 = (SavingsAccount)acc3;
                    acc5.updateBalance();
                    System.out.println("Updated!");

                }


        
    }



}
