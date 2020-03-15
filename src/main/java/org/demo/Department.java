package org.demo;

public class Department
{
    int rollNo;
    int salary;

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "rollNo=" + rollNo +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
