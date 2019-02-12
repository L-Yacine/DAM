/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.utmb.mvc.model;

import java.util.List;
public interface Model {
    
     List<Employee> getEnrolledEmployeeDetailsFromModel();
 void addEmployeeToModel(Employee employeee);
 void removeEmployeeFromModel(String employeeId);
    
}
