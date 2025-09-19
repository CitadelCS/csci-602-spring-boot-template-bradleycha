import java.util.ArrayList;
import java.util.Collections;
import java.time.LocalDate;

public class InheritanceDemo {
   private static void printEmployees(ArrayList<Employee> employees, String title) {
      System.out.print(title);

      for (int i = 0; i < employees.size(); ++i) {
         Employee employee = employees.get(i);

         System.out.println(employee.toString());
      }

      return;
   }

   public static void main(String [] args) {
      ArrayList<Employee> employees = new ArrayList<Employee>();

      employees.add(new HourlyEmployee(
         "John Doe",
         LocalDate.of(2009, 5, 21),
         50.5,
         160.0
      ));
      employees.add(new HourlyEmployee(
         "Jane Doe",
         LocalDate.of(2009, 9, 1),
         150.5,
         80.0
      ));
      employees.add(new SalariedEmployee(
         "Moe Howard",
         LocalDate.of(2004, 1, 1),
         75000.0
      ));
      employees.add(new SalariedEmployee(
         "Curly Howard",
         LocalDate.of(2018, 1, 1),
         105000.0
      ));

      printEmployees(employees, "List of Employees (before sorting)\n");
      Collections.sort(employees);
      printEmployees(employees, "\nList of Employees (after sorting)\n");

      System.out.print("\nMonthly Pay\n");
      for (int i = 0; i < employees.size(); ++i) {
         Employee employee = employees.get(i);

         System.out.printf(
            "%s: $%,#.2f\n",
            employee.getName(),
            employee.getMonthlyPay()
         );
      }

      return;
   }
};
