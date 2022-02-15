public class Upi implements Cloneable {
    String appname;
    String country;
    int dailylimit;
    double maxdailylimit;
    public Upi(String appname, String country, int dailylimit, double maxdailylimit) {
        this.appname = appname;
        this.country = country;
        this.dailylimit = dailylimit;
        this.maxdailylimit = maxdailylimit;
    }  
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "Upi [appname=" + appname + ", country=" + country + ", dailylimit=" + dailylimit + ", maxdailylimit="
                + maxdailylimit + "]";
    }
    

}
class ghy{
    public static void main(String[] args)throws Exception {
        Upi bhim=new Upi("Bhim","India",10000,100000);
        System.out.println(bhim);
        Upi phonepe=(Upi) bhim.clone();
        phonepe.appname="Phonepe";
        Upi gpay=(Upi) bhim.clone();
        gpay.appname="GPay";
        System.out.println(gpay);
        System.out.println(phonepe);
        System.out.println(bhim);
    }
}

