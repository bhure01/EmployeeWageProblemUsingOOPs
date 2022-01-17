package com.bridgelabz;

public class EmployeeWageBuilder extends EmpWage {
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    // static variables
//    public static final int IS_PART_TIME = 1;
//    public static final int IS_FULL_TIME = 2;
    // instance variables
    private int numOfCompanies = 0;
    private CompanyEmpWage[] companyEmpWage;

    public EmployeeWageBuilder() {
        companyEmpWage = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWages(String companyName, int empWagePerHr, int maxNumWorkingDaysPerMonth, int maxHrsPerMonth) {
        companyEmpWage[numOfCompanies] = new CompanyEmpWage(companyName,empWagePerHr,maxNumWorkingDaysPerMonth,maxHrsPerMonth);
        numOfCompanies++;
    }

    public void calculateEmpWage() {
        for (int i = 0; i < numOfCompanies; i++) {
            companyEmpWage[i].setTotalEmpWage(this.calculateEmpWage(companyEmpWage[i]));
            System.out.println(companyEmpWage[i].toString());
        }
    }

    // created method to calculate Employee Wage based on Emp Hours and Emp Type
    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {
        // local Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        // calculating Employee Wage for a Month
        while( totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.maxNumWorkingDaysPerMonth) {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Present for Full Time");
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Present for Part Time");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day No :"+ totalWorkingDays +" Employee Hours: "+ empHrs);
        }
        return totalEmpHrs * companyEmpWage.empWagePerHr;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Calculation Problem");
        EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
        empWageBuilder.addCompanyEmpWages("Dmart",20,5,25);
        empWageBuilder.addCompanyEmpWages("BigBazaar",15,30,30);
        empWageBuilder.calculateEmpWage();
    }
}

