import java.time.LocalDate;

public class SalariedEmployee extends Employee {
   double annualSalary;

   public SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
      super(name, hireDate);
      this.annualSalary = annualSalary;
      return;
   }

   public double getAnnualSalary() {
      return this.annualSalary;
   }

   @Override
   public double getMonthlyPay() {
      return this.getAnnualSalary() / 12.0;
   }

   @Override
   public String toString() {
      return String.format(
         "SalariedEmployee[name=%s, hireDate=%s, annualSalary=%.1#f]",
         this.getName(),
         this.getHireDate().toString(),
         this.getAnnualSalary()
      );
   }

   @Override
   public int hashCode() {
      Double salary = this.getAnnualSalary();

      int hash_super    = super.hashCode();
      int hash_salary   = salary.hashCode();

      return hash_super + hash_salary;
   }

   public boolean equals(SalariedEmployee that) {
      int hash_this = this.hashCode();
      int hash_that = that.hashCode();

      return hash_this == hash_that;
   }
};
