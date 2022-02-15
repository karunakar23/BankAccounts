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

    public String toString() {
        return  return"AccountNO :"+accNo+" %nAccountHolderName :"+accHolderName+"nAccountBalance "+accBalance;
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
        double si=((double) accBalance)* rateOfInterest*(double) 12;
        System.out.println("SimpleIntrest Yearly is :"+si);

    }
    void getComputedInterest(int years){
        double si=((double) accBalance)* rateOfInterest*((double) (12*years));
        System.out.println("SimpleIntrest Yearly is :"+si);

    }
    @Override
    public String toString() {
        return"AccountNO :"+accNo+" %nAccountHolderName :"+accHolderName+"nAccountBalance "+accBalance+"rateOf Interest"+rateOfInterest;
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
        return"AccountNO :"+accNo+" %nAccountHolderName :"+accHolderName+"nAccountBalance "+accBalance+"navgDailyTransaction"+avgDailyTransactions;
    }
}
class Main{
    public static void main(String[] args) {
        Bank generalAcc=new Bank();
        SavingAccount savAcc=new SavingAccount(15,1234456,"Karuna",10000);
        CurrentAccount currAcc=new CurrentAccount(2000,12398767,"Joseph",20000);
        savAcc.getComputedInterest(12);
        savAcc.getYearlyInterest();
        System.out.println(savAcc);
        currAcc.getYearlyTransaction();
        currAcc.getTotalTransaction(243);
        System.out.println(currAcc);
        Bank salaryAcc=new Bank(){
            int salary =10000;
            int pfAmount=1000;
            int incomeTaxRate=10;
            void getYearlyTax(){
                double tax=(salary*12)*(double) ((double) incomeTaxRate/(double) 100);
                System.out.println("Yearly tax is:"+tax);
            }
            void getInhandYearlySalary(){
                double sal=(salary*12)-((salary*12)*(double) ((double) incomeTaxRate/(double) 100));
                System.out.println("getInhandYearlySalary :"+sal);
            }

        };
        salaryAcc.getYearlyTax();
        salaryAcc.getInhandYearlySalary();
    }
}
