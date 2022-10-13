package tech.reliab.course.kirichenkoavlab.bank.service;

import tech.reliab.course.kirichenkoavlab.bank.entity.Employee;

public interface EmployeeService {
    Employee getEmployee();
    void setBank(Employee employee);
    Boolean updateBank(Employee employee);
    Boolean deleteBank(Employee employee);
}
