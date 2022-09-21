package staff;

public abstract class Employee {

    private String name;
    private String nINumber;
    private Integer salary;

    public Employee(String name, String nINumber, Integer salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        if(name != ""){
       return this.name = name;}
        return this.name;
    }

    public String getnINumber() {
        return nINumber;
    }

    public void setnINumber(String nINumber) {
        this.nINumber = nINumber;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public double raiseSalary(Double raise){
        if (raise > 0){
        return salary + (salary * raise);}
        return salary;
    }

    public double payBonus(Double bonus){
        return this.salary * bonus;
    }


}
