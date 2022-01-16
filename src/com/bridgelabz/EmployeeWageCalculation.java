package com.bridgelabz;

public class EmployeeWageCalculation {
    //Constants(final)
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_MAX_WORK_DAYS = 20;
    public static final int NUM_OF_MAX_WORK_HRS = 100;


    //created meethod to Calculate Employee Wage by Hours and Type
    public static void calculateEmpWage(String company, int EMP_RATE_PER_HR,int NUM_OF_MAX_WORK_DAYS,int NUM_OF_MAX_WORK_HRS) {

        // Local Variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        //Computing Employee Wage for Month
        while( totalWorkingDays < NUM_OF_MAX_WORK_DAYS && totalEmpHrs <= NUM_OF_MAX_WORK_HRS ) {
            totalWorkingDays++;     //Incrementing Working Days
            double empCheck = Math.floor(Math.random() * 10) % 3;

            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    System.out.println("Employee is Present for full time");
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Present for part time");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
                    break;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Day No : "+ totalWorkingDays +" Employee Hrs: "+ empHrs);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HR;
        System.out.println("Total Employee Wage for Company : "+ company +" is : "+totalEmpWage);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wages Calculation Program");
        calculateEmpWage("Dmart",20,10,15);
        calculateEmpWage("BigBazaar",30,8,20);
    }
}

