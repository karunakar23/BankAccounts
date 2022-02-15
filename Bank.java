import java.util.Scanner;
public class Bank{
    int accNo;
    String accHolderName;
    int accBalance;
    public Bank(){

    }
    public Bank(int accNo, String accHolderName,int accBalance){
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getAccHolderName() {
        return accHolderName;
    }
    public void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }
    public int getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }
    void getInhandYearlySalary(){
        
    }
    void getYearlyTax(){
        
    }
    static Bank copy(Bank obj){
        return new Bank(obj.accNo,obj.accHolderName,obj.accBalance);
    }
    public String toString() {
        return"AccountNO :"+accNo+" AccountHolderName :"+accHolderName+" AccountBalance "+accBalance;
    }
}
class SavingAccount extends Bank{
    double rateOfInterest=0;
    SavingAccount(double rateOfInterest,int accNo,String accHolderName,int accBalance){
            super(accNo,accHolderName,accBalance);
            this.rateOfInterest=rateOfInterest/100;
    }
    
    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest/100;
    }

    void getYearlyInterest(){
        double si=accBalance* rateOfInterest;
        System.out.println("SimpleIntrest Yearly is :"+si);

    }
    void getComputedInterest(int years){
        double si=((double) accBalance* rateOfInterest*(double) years);
        System.out.println("SimpleIntrest Yearly is :"+si);
    }
    @Override
    public String toString() {
        return "AccountNO :"+accNo+" AccountHolderName :"+accHolderName+" AccountBalance "+accBalance+" rateOf Interest"+rateOfInterest;
    }
}
class CurrentAccount extends Bank{
    int avgDailyTransactions=0;
    CurrentAccount(int avgDailyTransactions,int accNo, String accHolderName,int accBalance){
        super(accNo,accHolderName,accBalance);
        this.avgDailyTransactions=avgDailyTransactions;
    }
    
    public int getAvgDailyTransactions() {
        return avgDailyTransactions;
    }

    public void setAvgDailyTransactions(int avgDailyTransactions) {
        this.avgDailyTransactions = avgDailyTransactions;
    }

    void getYearlyTransaction(){
        int yi=avgDailyTransactions*365;
        System.out.println("avgDailyTransactions :"+yi);
    }
    void getTotalTransaction(int days){
        int tT=days*avgDailyTransactions;
        System.out.println("getTotalTransaction :"+tT);
    }
    @Override
    public String toString() {
        return "AccountNO :"+accNo+" AccountHolderName :"+accHolderName+" AccountBalance "+accBalance+" navgDailyTransaction"+avgDailyTransactions;
    }
}
class Main{
    public static void main(String[] args) {
        //Bank generalAcc=new Bank();
        SavingAccount savAcc=new SavingAccount(15,1234456,"Karuna",10000);
        CurrentAccount currAcc=new CurrentAccount(2000,12398767,"Joseph",20000);
        savAcc.getComputedInterest(12);
        savAcc.getYearlyInterest();
        System.out.println(savAcc);
        currAcc.getYearlyTransaction();
        currAcc.getTotalTransaction(243);
        System.out.println(currAcc);
        Bank salaryAcc=new Bank(1234,"Hari",1000){
            int salary =10000;
            int pfAmount=1000;
            int incomeTaxRate=10;
            @Override
            void getYearlyTax(){
                double tax= (salary*12)* ((double) incomeTaxRate/(double) 100);
                System.out.println("Yearly tax is:"+tax);
            }
            @Override
            void getInhandYearlySalary(){
                double sal= (salary*12)-(pfAmount*12)-((salary*12)* ((double) incomeTaxRate/(double) 100));
                System.out.println("getInhandYearlySalary :"+sal);
            }
            
        };
        salaryAcc.getYearlyTax();
        salaryAcc.getInhandYearlySalary();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=scanner.nextInt();
        Bank[] bank=new Bank[n];
        CurrentAccount[] currentaccount=new CurrentAccount[n];
        SavingAccount[] savingAccount=new SavingAccount[n];
        System.out.println("Bank  --");
        for(int i=0;i<n;i++){
            System.out.print("Acc No :");
            int accNo=scanner.nextInt();
            scanner.nextLine();
            System.out.print("AccName :");
            String accName=scanner.nextLine();
            System.out.print("AccBalance :");
            int accbalance=scanner.nextInt();
            bank[i]=new Bank(accNo,accName,accbalance);
        }
        System.out.println();
        System.out.println("Savings  Account  --");
        for(int i=0;i<n;i++){
            System.out.print("AccNo :");
            int accNo=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Acc Name :");
            String accName=scanner.nextLine();
            System.out.print("Acc Balance :");
            int accbalance=scanner.nextInt();
            System.out.print("Rate Of Interest:");
            int rateOfInterest=scanner.nextInt();
            currentaccount[i]=new CurrentAccount(rateOfInterest,accNo,accName,accbalance);
        }
        System.out.println();
        System.out.println("Current  Account  --");
        for(int i=0;i<n;i++){
            System.out.print("AccNo :");
            int accNo=scanner.nextInt();
            scanner.nextLine();
            System.out.print("Acc Name :");
            String accName=scanner.nextLine();
            System.out.print("Acc Balance :");
            int accbalance=scanner.nextInt();
            System.out.print("AvgDailyTransaction:");
            int avgDailyTransaction=scanner.nextInt();
            currentaccount[i]=new CurrentAccount(avgDailyTransaction,accNo,accName,accbalance);
        }
        System.out.println(Bank.copy(new CurrentAccount(1298,1232,"1122",12233)));
        System.out.println(Bank.copy(new SavingAccount(10,1232,"1122",12233)));
        scanner.close();

    }
}
