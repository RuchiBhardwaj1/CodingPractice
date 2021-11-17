package inter;

public class ContractEmployee extends BaseClass{

    public int HourlyPay;
    public int TotalHours;

     @Override
    public int GetMonthlySalary(){
        return this.TotalHours * this.HourlyPay;
    }

    public int getHourlyPay() {
        return HourlyPay;
    }

    public void setHourlyPay(int hourlyPay) {
        HourlyPay = hourlyPay;
    }

    public int getTotalHours() {
        return TotalHours;
    }

    public void setTotalHours(int totalHours) {
        TotalHours = totalHours;
    }
}
