package com.bridgelabz;

public class EmployeeWageBuilder {
    // final Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int numOfCompanies = 0;
    private CompanyEmpWage[] companyEmpWages;


    public EmployeeWageBuilder() {
        companyEmpWages = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage();
    //created Constructor to initialize the Variables
    public EmployeeWageBuilder(String companyName, int maxWorkingDaysInMonth, int maxHrsInMonth, int empWagePerHr) {
        this.companyName = companyName;
        this.empWagePerHr = empWagePerHr;
        this.maxWorkingDaysInMonth = maxWorkingDaysInMonth;
        this.maxHrsInMonth = maxHrsInMonth;
    }

    //Method to Calculate Employee Wage by Hours and Type
    public void calculateEmpWage() {
        // Local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Compute Emp Wage for Month
        while( totalWorkingDays < maxWorkingDaysInMonth && totalEmpHrs <= maxHrsInMonth ) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Present for Part Time");
                    break;
                case IS_FULL_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Present for Part Time");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day No :"+ totalWorkingDays +" Employee Hours : "+ empHrs);
        }
        totalEmpWage = totalEmpHrs * empWagePerHr;
    }


    @Override
    public String toString() {
        return "Total Employee Wage for Company : "+ companyName +" is : "+totalEmpWage;
    }

    public static void main(String[] args) {
        //Welcome Message for Initial Purpose
        System.out.println("Welcome to Employee Wages Problem Developed by Tahir Mansuri.");
        EmployeeWageBuilder dmart = new EmployeeWageBuilder("DMart",20,10,30);
        EmployeeWageBuilder bigbazaar = new EmployeeWageBuilder("BigBazaar",15,5,25);
        dmart.calculateEmpWage();
        System.out.println(dmart.toString());
        bigbazaar.calculateEmpWage();
        System.out.println(bigbazaar.toString());
    }
}
