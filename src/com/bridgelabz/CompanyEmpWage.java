package com.bridgelabz;

public class CompanyEmpWage {
    // Instance Variables
    public String companyName;
    public int empWagePerHr;
    public int maxNumWorkingDaysPerMonth;
    public int maxHrsPerMonth;
    public int totalEmpWage;

    //  Constructor(parameterised) for initializing the variables
    public CompanyEmpWage(String companyName, int empWagePerHr, int maxNumWorkingDaysPerMonth, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.empWagePerHr = empWagePerHr;
        this.maxNumWorkingDaysPerMonth = maxNumWorkingDaysPerMonth;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    //Override the toString() from String Class
    @Override
    public String toString() {
        return "Total Employee Wage for Company : "+ companyName +" is : "+totalEmpWage;
    }
}

