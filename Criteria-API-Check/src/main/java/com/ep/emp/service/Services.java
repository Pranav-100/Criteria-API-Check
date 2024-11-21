package com.ep.emp.service;


import com.ep.emp.dao.Employee;
import com.ep.emp.dao.EmployeeRequest;
import com.ep.emp.repo.EmployeeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Services  {
//    @Autowired
//    private EmployeeRepository repository;
    @PersistenceContext
    private EntityManager entity;

    public List<Employee> getEmployeeByCriteria(EmployeeRequest employeeRequest) {

//        Optional<Employee> ep=repository.findById(employeeRequest.getEmpId());
//        System.out.println("EMP by ID : "+ ep);
        CriteriaBuilder cb = entity.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
        Root<Employee> emp = cq.from(Employee.class);
        System.out.println("Root : "+emp);
        // Handle case-insensitive matching and trim spaces
        Predicate eId = cb.equal(emp.get("empId"), employeeRequest.getEmpId());
        System.out.println("Predicate eId : "+eId.toString());
        // Combine predicates (both conditions must be true)
//        cq.where(eId);
//        cq.where()
        // Create TypedQuery for single result
        TypedQuery<Employee> query = entity.createQuery(cq);
        System.out.println("TypedQuery query : "+query);
        // Use getResultList() to avoid NoResultException
        List<Employee> employees = query.getResultList();

        if (employees.isEmpty()) {
            System.out.println("\nNot Found\n");
            // Handle case when no employee is found
            return null;  // Or throw a custom exception
        }

        // Return the first result if found
        return employees;
//       return   this.repository.findAll();
    }

}