public class Calci {
    public void  add(int a,int b){
        System.out.println(a+b);
    }
     public void  add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void  add(int a,int b,int c,int d){
        System.out.println(a+b+c+d);
    }
    public void  add(double a,double  b,double  c,double  d){
        System.out.println(a+b+c+d);
    }
    public void  add(int a,float b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Calci obj = new Calci();
        obj.add(1,2);
        obj.add(1,2,3);
        obj.add(1,2,3,4);
        obj.add(1.1,7.9,2,3);
        obj.add(1,7.9f);
    }
    
}
