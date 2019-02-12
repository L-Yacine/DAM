/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.utmb.mvc.model;

import java.util.List;
public class EmployeeModel implements Model
{
 List<Employee> enrolledEmployees;
 public EmployeeModel()
 {
 
 }
 @Override
 public List<Employee> getEnrolledEmployeeDetailsFromModel()
 {
 return enrolledEmployees;
 }
 
 @Override
 public void addEmployeeToModel(Employee employee)
 {

 }
 
 @Override
 public void removeEmployeeFromModel(String employeeId)
 {

 }
}