package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 17001227 on 18/7/2018.
 */

public class EmployeeInfo {
    private String employeeName;
    private String employeeTitle;
    private String employeeSalary;

    public EmployeeInfo(String employeeName, String employeeTitle, String employeeSalary) {
        this.employeeName = employeeName;
        this.employeeTitle = employeeTitle;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeTitle='" + employeeTitle + '\'' +
                ", employeeSalary='" + employeeSalary + '\'' +
                '}';
    }
}
