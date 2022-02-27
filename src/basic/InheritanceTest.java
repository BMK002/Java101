package basic;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * One program to test single inheritance *
 */


public class InheritanceTest {
    public static void main(String[] args) {
        Phone ph;
        Android ad;

        ad=new Android("IOS","Apple",80000,"SE","64GB internal + 32mp camera");
        ad.printAndroid();
        ad.osName="Android";
        ad.brandName="XIAOMI";
        ad.priceValue=25000;
        ad.modelName="NOTE PRO 9 MAX";
        ad.highlightFeature="4 rear camera's 108mp 50mp 20mp 8mp";
        ad.printAndroidPhone();
        ad.printPhone();
        ad.printAndroid();

        ad=new Android();
        ad.getAndroidDetails();
        ad.printAndroidPhone();

        ph=new Phone();
        ph.osName="IOS";
        ph.brandName="Apple";
        ph.priceValue=100000;
        ph.printPhone();
        ph.getPhone();
        ph.printPhone();

    }
}

class Phone{
    String osName,brandName;
    int priceValue;
    Scanner sc;

    Phone(){}

    Phone(String os,String brand,int prc){
        osName=os;
        brandName=brand;
        priceValue=prc;
    }

    void getPhone(){
        sc=new Scanner(new InputStreamReader(System.in));
        System.out.println("Looking for Android? or IOS?");
        osName=sc.nextLine();
        System.out.println("Preferred Brand's name.....");
        brandName=sc.nextLine();
        System.out.println("budget?");
        priceValue=sc.nextInt();
    }

    void printPhone(){
        System.out.println("Your Phone's detail recorded in system...\n"+osName+"\t"+brandName+"\t"+priceValue);
    }

}

class Android extends Phone{
    String modelName,highlightFeature;
    //Scanner sc;

    Android(){
        /*
         * super();
         * sc=new Scanner(new InputStreamReader(System.in));
         */
        super.getPhone();
    }

    Android(String os,String brd,int prc,String mdl,String hgh){
        super(os,brd,prc);
        modelName=mdl;
        highlightFeature=hgh;
    }

    void getAndroidDetails(){
        System.out.println("any specific model?");
        System.out.println("highlight?\n\n");
        modelName=sc.nextLine();
        highlightFeature=sc.nextLine();
    }

    void printAndroidPhone(){
        System.out.println("Your Android Phone's detail recorded in system...\n"+osName+"\t"+brandName+"\t"+priceValue+"\t"+modelName+"\t"+highlightFeature);
    }

    void printAndroid(){
        System.out.println("Your Android Phone's detail recorded in system...\n"+osName+"\t"+brandName+"\t"+priceValue+"\t"+modelName+"\t"+highlightFeature);
    }

}
