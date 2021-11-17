package inter;

public class program {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee();
        ft.ID = 1;
        ft.FirstName="Mark";
        ft.LastName = "May";
        ft.AnnualSalary = 6000;

        System.out.println(ft.GetMonthlySalary());
        System.out.println(ft.getFullName());


        ContractEmployee ct = new ContractEmployee();
        ct.ID = 1;
        ct.FirstName="bb";
        ct.LastName = "May";
        ct.HourlyPay = 200;
        ct.TotalHours = 40;

        System.out.println(ct.GetMonthlySalary());
        System.out.println(ct.getFullName());



    }


}
