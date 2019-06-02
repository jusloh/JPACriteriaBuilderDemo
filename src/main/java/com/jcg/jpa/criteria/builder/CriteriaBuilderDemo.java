package com.jcg.jpa.criteria.builder;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class CriteriaBuilderDemo {

    private static final String PERSISTENCE_UNIT_NAME = "JPACriteriaBuilder";
    private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();

    public static void main(String[] args) {

        CriteriaBuilder criteriaBuilderObj = entityMgrObj.getCriteriaBuilder();

        // Making The Query Object From The 'CriteriaBuilder' Instance
        CriteriaQuery<Object> queryObj = criteriaBuilderObj.createQuery();
        Root<Employee> from = queryObj.from(Employee.class);

        // Step #1 Displaying All Records
        System.out.println("\n! Display All Records For The 'Employee' Table !\n");
        CriteriaQuery<Object> selectQuery = queryObj.select(from);
        TypedQuery<Object> typedQuery = entityMgrObj.createQuery(selectQuery);
        List<Object> employeeList = typedQuery.getResultList();

        if (employeeList != null && employeeList.size() > 0) {
            for (Object obj : employeeList) {
                Employee emp = (Employee)obj;
                System.out.println(emp.toString());
            }
        } else {
            System.out.println("! ALERT - No Employees Are Present In The 'Employee' Table !");
        }

        // Step #2 - Displaying All Records In An Ordered Fashion
        System.out.println("\n! Displaying All Records For The 'Employee' Table In An Asc. Order !\n");
        CriteriaQuery<Object> ascSelectQuery = queryObj.select(from);
        ascSelectQuery.orderBy(criteriaBuilderObj.asc(from.get("emp_name")));
        TypedQuery<Object> ascTypedQuery = entityMgrObj.createQuery(ascSelectQuery);
        List<Object> ascEmployeeList = ascTypedQuery.getResultList();

        if (ascEmployeeList != null && ascEmployeeList.size() > 0) {
            for (Object obj : ascEmployeeList) {
                Employee emp = (Employee)obj;
                System.out.println(emp.toString());
            }
        } else {
            System.out.println("! ALERT - No Employees Are Present In The 'Employee' Table !");
        }
    }
}
