package inter;

public class FullTimeEmployee extends BaseClass{

    public int AnnualSalary;


    public int getAnnualSalary() {
        return AnnualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        AnnualSalary = annualSalary;
    }

    @Override
    public int GetMonthlySalary(){
        return this.AnnualSalary /12;
    }
}
