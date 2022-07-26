import pro.sky.course1.coursework.Employee;

public class Main {
    public static void main(String[] args) {
       Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 85_000);
        employee[1] = new Employee("Петров Петр Петрович", 1, 70_000);
        employee[2] = new Employee("Сидоров Василий Васильевич", 1, 75_000);
        employee[3] = new Employee("Кузнецов Андрей Семёнович", 2, 80_000);
        employee[4] = new Employee("Каменщиков Сергей  Валерьевич", 2, 35_000);
        employee[5] = new Employee("Палкин Федор Прокопьевич", 2, 90_000);
        employee[6] = new Employee("Галкин Николай Дмитриевич", 3, 105_000);
        employee[7] = new Employee("Скворцов Евгений Витальевич", 3, 125_000);
        employee[8] = new Employee("Смирнов Александр Николаевич", 3, 250_000);
        employee[9] = new Employee("Фролов Никита Владимирович", 3, 200_000);

        System.out.println("-------------------------------------------------------------");
        printAllEmployees(employee);
        System.out.println("-------------------------------------------------------------");
        calculateTheCostOfSalaries(employee);
        System.out.println("-------------------------------------------------------------");
        findAnEmployeeMinSalary(employee);
        System.out.println("-------------------------------------------------------------");
        findAnEmployeeMaxSalary(employee);
        System.out.println("-------------------------------------------------------------");
        calculateAverageSalary(employee);
        System.out.println("-------------------------------------------------------------");
        getNamesEmployee(employee);


    }
    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null));
            System.out.println(employees[i]);

        }
    }
    public static int calculateTheCostOfSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            int i = 0;
            if ((employees[i] != null));
            sum += employee.getSalary();
        }
              System.out.println("Сумма затрат на зарплаты в месяц " + sum);
           return sum;
    }
    public static void findAnEmployeeMinSalary(Employee[] employees) {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null));
        }
        {
            int i = 0;
            if (min.getSalary() > employees[i].getSalary()) {
                min = employees[i];
            }
        }
        System.out.println("Минимальная зарплата " + min.getSalary() + " рублей у сотрудника " + min.getName());
    }
    public static void findAnEmployeeMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null);
            if (max.getSalary() < employees[i].getSalary())
                max = employees[i];
        }
        System.out.println("Максимальная зарплата " + max.getSalary() + " рублей у сотрудника " + max.getName());
    }
    public static void calculateAverageSalary(Employee[] employees) {
        int calculateAverageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i] != null));
            calculateAverageSalary += employees[i].getSalary() / employees.length;
        }
        System.out.println("Средняя заработная плата составляет: " + calculateAverageSalary + " рублей.");
    }

    public static void getNamesEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Ф.И.О. сотрудника: " + employees[i].getName());
        }
    }
}
