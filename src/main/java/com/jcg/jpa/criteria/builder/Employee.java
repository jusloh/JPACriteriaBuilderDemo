package com.jcg.jpa.criteria.builder;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_id;
    private double emp_salary;
    private String emp_name, emp_desig;

    public Employee() {
        super();
    }

    public Employee(int eid, double emp_salary, String emp_name, String emp_desig) {
        super();
        this.emp_id = eid;
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
        this.emp_desig = emp_desig;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_desig() {
        return emp_desig;
    }

    public void setEmp_desig(String emp_desig) {
        this.emp_desig = emp_desig;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_salary=" + emp_salary +
                ", emp_name='" + emp_name + '\'' +
                ", emp_desig='" + emp_desig + '\'' +
                '}';
    }
}
