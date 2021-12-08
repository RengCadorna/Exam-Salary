import java.util.Scanner;
class SalaryCal
{
	public static void main(String[] args)	
	{
	  double ansl,mtr,dlr,hlr,atd,mtd,ntp;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter Annual Salary");
      ansl = input.nextDouble();
	  System.out.println("Your Annual Salary: " + String.format("%.2f", ansl));
		
	  mtr = ansl/12;
	  System.out.println("Your Monthly Rate: " + String.format("%.2f", mtr));

    dlr = mtr/22;
    System.out.println("Your Daily Rate: " + String.format("%.2f", dlr));

    hlr = dlr/8;
    System.out.println("Your Hourly Rate: " + String.format("%.2f", hlr));

    atd = 0;
    if (ansl<= 250000){
      atd = 0;
    }else if (ansl >= 250000 && ansl < 400000){
     atd = 30000 * 0.2;
    }else if (ansl >= 400000 && ansl < 800000){
      atd = 30000 + (0.25 * (ansl - 400000));
    }else if (ansl >= 800000 && ansl < 20000000){
      atd = 130000 + (0.3 * (ansl- 800000));
    }else if (ansl >= 250000 && ansl < 400000){
      atd = 490000 + (0.32 * (ansl
      - 2000000));
    }else if (ansl >= 250000 && ansl < 400000){
      atd = 2410000 + (0.35 * (ansl - 8000000));
    }
    System.out.println("Your Annual Tax Deduction: " + String.format("%.2f", atd));

    mtd = atd/12;
    System.out.println("Your Monthly Tax Deduction: " + String.format("%.2f", mtd));

    ntp = mtr-mtd;
    System.out.println("Net Pay: " + String.format("%.2f", ntp));
	}
}