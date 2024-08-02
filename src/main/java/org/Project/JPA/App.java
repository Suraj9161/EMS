package org.Project.JPA;

import com.Entities.Department;
import com.Entities.Employee;
import com.Entities.Project;
import com.Services.DepartmentService;
import com.Services.EmployeeService;
import com.Services.ProjectService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "EMS SOftware Development" );
        DepartmentService departmentService = new DepartmentService();
        EmployeeService employeeService = new EmployeeService();
        ProjectService projectService = new ProjectService();
        
        Department department = new Department();
        department.setName("SDE");
        
        Employee employee = new Employee();
        employee.setName("Suraj Maurya");
        employee.setEmail("suraj.mauya@gmail.com");
        employee.setDepartment(department);
        
        Project project = new Project();
        project.setName("Project A");
        project.setName("Project B");
        
        employee.getProjects().add(project);
        project.getEmployees().add(employee);
        
        
        departmentService.createDepartment(department);
        projectService.createProject(project);
        employeeService.createEmployee(employee);

        System.out.println("Employee Managemnet Setupe Completed");
    }
}
