public class Student {
    private int rollNo;
    private String name;
    Student(){
        rollNo=-1;
        name="New Student";
    }
    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    Student(int rollNo){
        this.rollNo = rollNo;
    }
    Student(String name){
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
        Student ram=new Student();
        ram.setName("Ram");
        ram.setRollNo(10);
        ram.display();
        Student ntr=new Student(1,"NTR");
        ntr.display();
        Student raju=new Student(2);
        raju.setName("Raju");
        raju.display();
    }
    
}
