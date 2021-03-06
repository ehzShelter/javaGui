package lab.wk2;
import lab.wk2.geometry.myPoint.Point;
import lab.wk2.geometry.myTriangle.Triangle;
import lab.wk2.banking.Account;

public class MainClass {
    public static void main(String... args) {

        // Point M = new Point(2.0, 2.0);
        // Point N = new Point(4.0, 4.0);
        // Point P = new Point(6.0, 2.0);
        //
        // Triangle myTri = new Triangle(M, N, P);
        // myTri.showInfo();
        // myTri.testTriangle();
        //
        // System.out.println("");
        //
        // Point a = new Point(2.0, 21.0);
        // Point b = new Point(4.0, 41.0);
        // Point c = new Point(6.0, 2.0);
        //
        // Triangle secondTri = new Triangle(a, b, c);
        // secondTri.showInfo();
        // secondTri.testTriangle();
        //
        // Account Object
        Account myAccount = new Account("Zawad", "15301422", 23000.0f);
        System.out.println(myAccount.getBalance());

        myAccount.deposit(333.0f);
        System.out.println(myAccount.getBalance());

        myAccount.withDraw(111.0f);
        System.out.println(myAccount.getBalance());

        myAccount.withDraw(33000.0f);

        Account friendAccount = new Account("Abrar", "15201545", 100.0f);
        myAccount.transferTo(friendAccount, 900.0f);
        System.out.println(friendAccount.getBalance());

        System.out.println(myAccount.getBalance());
    }
}
