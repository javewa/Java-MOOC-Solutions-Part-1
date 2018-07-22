
public class Accounts {
    
    public static void transfer(Account withdrawAccount, Account depositAccount, double money) {
        withdrawAccount.withdrawal(money);
        depositAccount.deposit(money);
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("A", 100.0);
        Account b = new Account("B", 0.0);
        Account c = new Account("C", 0.0);
        transfer(a, b, 50.0);
        transfer(b, c, 25.0);
        
    }


}
