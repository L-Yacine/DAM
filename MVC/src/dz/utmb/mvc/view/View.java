/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.utmb.mvc.view;
import java.util.List;
import dz.utmb.mvc.model.Employee;

public interface View {
    void showEnrolledEmployees(List<Employee> enrolledEmployees);
}
