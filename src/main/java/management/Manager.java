package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String nINumber, Integer salary, String deptName) {
        super(name, nINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
