package basic;


/**
 Data Type	Size	Description
 byte	1 byte	Stores whole numbers from -128 to 127
 short	2 bytes	Stores whole numbers from -32,768 to 32,767
 int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
 long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
 double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
 boolean	1 bit	Stores true or false values
 char	2 bytes	Stores a single character/letter or ASCII values**/

class BasicOps{

    byte b1=120;
    short s1=12000;
    int i1=1234567890;
    //unable to create long data
    // long l1=01234567890123456;

}

class PrimitiveDT{

    byte empGroup;
    short empNumber;
    int empPhone;
    long empSalary;

    public byte getEmpGroup() {
        return empGroup;
    }

    public void setEmpGroup(byte empGroup) {
        this.empGroup = empGroup;
    }

    public short getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(short empNumber) {
        this.empNumber = empNumber;
    }

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(int empPhone) {
        this.empPhone = empPhone;
    }

    public long getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(long empSalary) {
        this.empSalary = empSalary;
    }
}

public class PrimitiveDTTest {
    public static void main(String[] args) {
        PrimitiveDT pmtDt=new PrimitiveDT();
        pmtDt.empGroup=1;
        pmtDt.empNumber=10001;
        pmtDt.empPhone=1234567890;
        pmtDt.empSalary=1000000000;
        System.out.println(pmtDt.getEmpGroup());
        System.out.println(pmtDt.getEmpNumber());
        System.out.println(pmtDt.getEmpPhone());
        System.out.println(pmtDt.getEmpSalary());

        pmtDt.empGroup=2;
        pmtDt.empNumber=10002;
        pmtDt.empPhone=1234567891;
        pmtDt.empSalary=1000000001;
        System.out.println(pmtDt.getEmpGroup());
        System.out.println(pmtDt.getEmpNumber());
        System.out.println(pmtDt.getEmpPhone());
        System.out.println(pmtDt.getEmpSalary());

        pmtDt.empGroup=-127;
        pmtDt.empNumber=-12341;
        pmtDt.empPhone=-2134567890;
        pmtDt.empSalary=-1123456789;
        System.out.println(pmtDt.getEmpGroup());
        System.out.println(pmtDt.getEmpNumber());
        System.out.println(pmtDt.getEmpPhone());
        System.out.println(pmtDt.getEmpSalary());

        /** out of range to break the storage capacity
        pmtDt.empGroup=-150;
        pmtDt.empNumber=12456457341;
        pmtDt.empPhone=-21345678456490;
        pmtDt.empSalary=-1123456789234645;
        System.out.println(pmtDt.getEmpGroup());
        System.out.println(pmtDt.getEmpNumber());
        System.out.println(pmtDt.getEmpPhone());
        System.out.println(pmtDt.getEmpSalary());
        **/

        /** uncomment and test this, unable to set the values even it was in range according to the type.
        pmtDt.setEmpGroup(12);
        pmtDt.setEmpNumber(1234);
        pmtDt.setEmpPhone(1098765432);
        pmtDt.setEmpSalary(90856743200000);
         **/

        BasicOps bscOp=new BasicOps();
        System.out.println(bscOp.i1);
        System.out.println(bscOp.s1);
        //System.out.println(bscOp.l1);
        System.out.println(bscOp.b1);
    }
}
