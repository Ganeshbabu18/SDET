package MidLevel;
public class Midlevel1 {
    public static void incomeTax(double salary) {
        double tax = 0;
        double taxAmount = 0.0;

        if (salary < 500000) {
            tax = 0;
        } else if (salary >= 500000 && salary < 700000) {
            tax = 10;
            taxAmount = 0.1 * (salary - 500000);
        } else if (salary >= 700000 && salary < 1000000) {
            tax = 15;
            taxAmount = (0.1 * (salary -500000)) + (0.15 * (salary - 700000));;
        } else if (salary >= 1000000 && salary < 1500000) {
            tax = 20;
            taxAmount = 0.1 * (salary - 500000) + 0.15 * (salary - 700000) + 0.2 * (salary - 1000000);
        } else if (salary >= 1500000) {
            tax = 30;
            taxAmount = 0.1 * (salary - 500000) + 0.15 * (salary - 700000) + 0.2 * (salary - 1000000) + 0.3 * (salary - 1500000);
        }
        System.out.println("Tax percentage applied to the salary is " + tax + "%");
        System.out.println("Tax amount to be deducted from the salary is " + taxAmount);
        System.out.println("Salary after tax has been deducted is " + (salary - taxAmount));
    }

    public static void main(String[] args) {
        double Salary = 100000;
        incomeTax(Salary);
    }
}