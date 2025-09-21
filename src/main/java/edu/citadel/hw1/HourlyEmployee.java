import java.time.LocalDate;

public class HourlyEmployee extends Employee {
   double wageRate;
   double hoursWorked;

   public HourlyEmployee(String name, LocalDate hireDate, double wageRate, double hoursWorked) {
      super(name, hireDate);
      this.wageRate = wageRate;
      this.hoursWorked = hoursWorked;
      return;
   }

   public double getWageRate() {
      return this.wageRate;
   }

   public double getHoursWorked() {
      return this.hoursWorked;
   }

   @Override
   public double getMonthlyPay() {
      return this.getWageRate() * this.getHoursWorked();
   }

   @Override
   public String toString() {
      return String.format(
         "HourlyEmployee[name=%s, hireDate=%s, wageRate=%#.1f, hoursWorked=%#.1f]",
         this.getName(),
         this.getHireDate().toString(),
         this.getWageRate(),
         this.getHoursWorked()
      );
   }

   @Override
   public int hashCode() {
      Double wage    = this.getWageRate();
      Double hours   = this.getHoursWorked();

      int hash_super = super.hashCode();
      int hash_wage  = wage.hashCode();
      int hash_hours = hours.hashCode();

      return hash_super + hash_wage + hash_hours;
   }

   public boolean equals(HourlyEmployee that) {
      int hash_this = this.hashCode();
      int hash_that = that.hashCode();

      return hash_this == hash_that;
   }
};

