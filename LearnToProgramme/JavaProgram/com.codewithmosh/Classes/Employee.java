//package com.codewithmosh;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary)
    {
        this(baseSalary,0);
    }
 
    public Employee(int baseSalary,int hourlyRate){

        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
        //new Employee(1).getBaseSalary();
    }



    public int calculateWage(int extraHours)
    {
        return baseSalary+(hourlyRate*extraHours);
    }
    private void setBaseSalary(int baseSalary)
    {
        if(baseSalary<=0)
            throw new IllegalArgumentException("Salary Can not be zero or less");
        this.baseSalary=baseSalary;

    }
    public int getBaseSalary(){
        return this.baseSalary;
    }

    private void setHourlyRate(int hourlyRate)
    {
        if(hourlyRate<0)
            throw new IllegalArgumentException("Hourly rate can not be zero or Negative");
        this.hourlyRate=hourlyRate;
    
    }

    public int getHourlyARte()
    {
        return this.hourlyRate;
    }
    
}

/*
 *     new Employee(10_000);
  
        var employee=new Employee(50_00,20);
        //employee.setBaseSalary(50_000);
        //employee.setHourlyRate(20);
        employee.getBaseSalary();
        int wage=employee.calculateWage(10);
        System.out.println(wage);
        //System.out.println(" numberOfEmployees "+Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
        Integer.parseInt("12");
 */
/*
        //Implimentaion in main method
        var employee=new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        employee.getBaseSalary();
        int wage=employee.calculateWage(10);
        System.out.println(wage);

 */


/*
     public static void main(String[] args){
  
        int baseSalary=50_000;
        int extraHours=10;
        int hourlyRate=20;

        int wage=calculateWgae(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

    }   
    
    public static int calculateWgae(int baseSalary,int extraHours,int hourlyRate){
        return baseSalary+(extraHours*hourlyRate);
    }
 */
