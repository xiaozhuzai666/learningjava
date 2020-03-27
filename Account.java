public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account (int id, double balance, double annualInterestRate ){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId( int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterest(){
        double MonInterest=this.annualInterestRate/12;
        return MonInterest;
    }
    public void withdraw (double amount){
        double with=this.balance-amount;

        if(with<0){
            System.out.println("余额不足！");
        }
        if(with>=0){
            this.balance=with;
            System.out.println("您的账户余额为："+balance);
        }
    }
    public void deposit (double amount){

        double  dep=this.balance+amount;
        this.balance=dep;
        System.out.println("您的账户余额为："+balance);
    }

}


