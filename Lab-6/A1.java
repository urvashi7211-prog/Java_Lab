import java.util.Scanner;

class Student{
    String name;
    int roll_no;
    double spi;
    String cource;

void setter(String n,int r,double s,String c){
    name=n;
    roll_no=r;
    spi=s;
    cource=c;
}
void getter(){
    System.out.println(name+":"+roll_no+":"+spi+":"+cource);
}
}
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setter("Urvashi",1,9,"B.Tech");
        s1.getter();
        s2.setter("Urvashi",1,9,"B.Tech");
        s2.getter();
        s3.setter("Urvashi",1,9,"B.Tech");
        s3.getter();
        sc.close();
    }

}
