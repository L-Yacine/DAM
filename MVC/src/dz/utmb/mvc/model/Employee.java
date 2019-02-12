/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.utmb.mvc.model;


public class Employee {
     private String empName;
 private String empId;
 public String getEmpName() {
 return empName;
 }
 public String getEmpId() {
 return empId;
 }
 public Employee(String empName, String empId)
 {
 this.empName=empName;
 this.empId=empId;
 }
 @Override
 public String toString()
 {
 return empName + "  ID: "+ empId ;
 }

 public boolean equals(Object o) {

 return true;
 }
    
}
