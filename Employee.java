class Person {
     String name;
    Person(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Employee extends Person {
    double annualSalary;
    int yearOfJoined;
    String uAN;
    Employee(String name ,double annualSalary,int yearOfJoined,String uAN){
        super(name);
        this.annualSalary = annualSalary;
        this.yearOfJoined = yearOfJoined;
        this.uAN = uAN;
    }
    
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearOfJoined() {
        return yearOfJoined;
    }

    public void setYearOfJoined(int yearOfJoined) {
        this.yearOfJoined = yearOfJoined;
    }

    public String getuAN() {
        return uAN;
    }

    public void setuAN(String uAN) {
        this.uAN = uAN;
    }

    public String toString() {
        return "name "+name+"annualSalary "+annualSalary+" yearOfJoined "+yearOfJoined+" uAN "+uAN;
    }
    
}
class MyClass{
    static boolean equalperson(Employee obj1,Employee obj2){
        if((obj1==obj2)||(obj1.uAN.equals(obj2.uAN))){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Employee obj1 = new Employee("karuna",(double) 12000,2019,"123456");
        Employee obj2=new Employee("Ram",(double) 13500,2017,"4353322");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(equalperson(obj1,obj2));

    }

}


