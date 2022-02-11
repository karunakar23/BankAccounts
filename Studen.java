public class Studen{
    static final String university="Bharath University";
    static int count=0;
    private String name;
    private int rollNo;
    private String homeTown;
    Studen(){
        name="Null";
        rollNo = count++;
        homeTown="Null";
    }
    Studen(String name){
        this();
        this.name = name;

    }
    Studen(String name,int rollNo,String homeTown){
        this(name);
        this.rollNo = rollNo;
        this.homeTown = homeTown;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getHomeTown() {
        return homeTown;
    }
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
    void display(){
        System.out.println("name "+name+" rollNo "+rollNo+" homeTown "+homeTown+" University "+university);
    }
    public static void main(String[] args) {
        Studen s1=new Studen();
        s1.display();
        Studen s2=new Studen("rahul");
        s2.display();
        Studen s3=new Studen("karuna",2,"AP");
        s3.display();
    }
    
}

