package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Employee employee1 = context.getBean("employee",Employee.class);
        //employee1.setName("SURBHI");

        Department department=employee1.lookup();
        department.setRollNo(12);
        department.setSalary(12);

        System.out.println("EMPLOYEE! "+department);

        Employee employee2 = context.getBean("employee",Employee.class);

        //As employee's scope is singleton, objects made will point to same memory instance.
        System.out.print("employee1 == employee2 : ");
        System.out.println(employee1==employee2);

        Department dept=employee2.lookup();
        System.out.print("department1 == department2 : ");
        System.out.println(department==dept);
        System.out.println("EMPLOYEE! "+employee2.lookup());

    }
}
