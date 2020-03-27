public class Test3 {
    public static void main(String[] args) {
        Account ac = new Account(1122,20000,4.5);
        ac.withdraw(30000);
        ac.withdraw(2500);
        ac.deposit(3000);
    }
}
