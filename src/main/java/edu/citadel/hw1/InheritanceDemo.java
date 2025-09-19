import java.util.ArrayList;
import java.time.LocalDate;

public class InheritanceDemo {
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

      return;
   }
};
