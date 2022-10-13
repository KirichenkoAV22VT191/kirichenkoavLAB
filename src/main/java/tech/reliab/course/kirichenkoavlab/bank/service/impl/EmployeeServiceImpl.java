package tech.reliab.course.kirichenkoavlab.bank.service.impl;


import tech.reliab.course.kirichenkoavlab.bank.entity.Employee;
import tech.reliab.course.kirichenkoavlab.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private Employee employee = null;

    /**
     *
     * @return возвращает сотрудника
     */
    @Override
    public Employee getEmployee() {
        return employee;
    }

    /**
     *
     * @param employee - новый объект сотрудника
     */
    @Override
    public void setBank(Employee employee) {
        this.employee = employee;
    }

    /**
     *
     * @param employee - сотрудник для обновления
     * @return возвращает true, если передан правильный объект сотрудника, иначе false
     */
    @Override
    public Boolean updateBank(Employee employee) {
        if (this.employee == employee){
            setBank(employee);
            return true;
        } else{
            return false;
        }
    }

    /**
     *
     * @param employee - сотрудник для удаления
     * @return возвращает true, если передан правильный объект сотрудника, иначе false
     */
    @Override
    public Boolean deleteBank(Employee employee) {
        if (this.employee == employee){
            this.employee = null;
            return true;
        } else{
            return false;
        }
    }
}
