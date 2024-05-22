import ex1.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(20,30);
        Rettangolo rettangolo2 = new Rettangolo(30,40);
        System.out.println(rettangolo1.getHeight());
        System.out.println(rettangolo1.getWidth());
        System.out.println(rettangolo1.area());
        System.out.println(rettangolo2.getHeight());
        System.out.println(rettangolo2.getWidth());
        System.out.println(rettangolo2.area());
        System.out.println(rettangolo1.perimeter());
        System.out.println(rettangolo2.perimeter());
        System.out.println(rettangolo1.stampaRettangolo());
        System.out.println(rettangolo2.stampaRettangolo());
        System.out.println(stampaDueRett(rettangolo1,rettangolo2));


        }
    public static String stampaDueRett(Rettangolo rettangolo1, Rettangolo rettangolo2){
        int per1=   rettangolo1.perimeter() ;
        int area1=    rettangolo1.area() ;
        int per2=   rettangolo2.perimeter() ;
        int area2=  rettangolo2.area() ;
        int sumArea = area1 + area2 ;
       int sumPer =  per1 + per2;
       return "rettangolo1:"+ rettangolo1.toString() + "rettangolo2:"+ rettangolo2.toString() + "somma delle aree:" + " "+sumArea + " "+"somma dei perimetri:"+" "+sumPer;
    }
    }
