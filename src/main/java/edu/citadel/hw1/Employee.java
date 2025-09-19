import java.time.LocalDate;

public abstract class Employee implements Comparable<Employee> {
   String name;   
   LocalDate hireDate;

   public Employee(String name, LocalDate hireDate) {
      this.name = name;
      this.hireDate = hireDate;
   }

   public String getName() {
      return this.name;
   }

   public LocalDate getHireDate() {
      return this.hireDate;
   }

   public abstract double getMonthlyPay();

   @Override
   public int compareTo(Employee that) {
      double delta = this.getMonthlyPay() - that.getMonthlyPay();

      if (delta < 0.0) {
         return -1;
      }
      if (delta > 0.0) {
         return 1;
      }

      return 0;
   }
};

