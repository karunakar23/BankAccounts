public class student {
    private int rollNo;
    private String name;
    student(){
        rollNo=-1;
        name="New Student";
    }
    student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    student(int rollNo){
        this.rollNo = rollNo;
    }
    student(String name){
        this.name = name;
    }
    public int getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Name :"+name+" "+"rollNo :"+rollNo);
    }
    public static void main(String[] args) {
        student ram=new student();
        ram.setName("Ram");
        ram.setRollNo(10);
        ram.display();
        student ntr=new student(1,"NTR");
        ntr.display();
        student raju=new student(2);
        raju.setName("Raju");
        raju.display();
    }
    
}
