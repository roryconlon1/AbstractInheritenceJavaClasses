package management;

public class Director extends Manager{

    private Double budget;

    public Director(String name, String nINumber, Integer salary, String deptName, Double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget * 1000000;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double newBudget(Double percent){
        return budget * percent * 1000000;
    }
}
