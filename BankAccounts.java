class Account{
    String accountHolder;
    int balance;
    public void debit(int x){
        if(balance>=x){
            balance-=x;
            System.out.println("Money left :"+balance);
        }else{
            System.out.println("Debit amount exceeded in account balance");
        }
    }
    public void credit(int x){
        balance+=x;
        System.out.println("Balance left is :"+balance);
    }
}
public class BankAccounts{
    public static void main(String[] args) {
        Account obj1=new Account();
        Account obj2=new Account();
        obj1.accountHolder="Karuna";
        obj2.accountHolder="Prema";
        obj2.balance=1000;
        obj1.balance=2000;
        obj1.debit(5000);
        obj1.credit(10000);
        obj1.debit(100);
        obj1.credit(100);
        obj2.credit(10000);
        obj2.debit(100);

    }
    
}
