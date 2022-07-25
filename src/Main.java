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
        allEmployees(employee);
        System.out.println("-------------------------------------------------------------");
        allSalaries(employee);
        System.out.println("-------------------------------------------------------------");
        minSalary(employee);
        System.out.println("-------------------------------------------------------------");
        maxSalary(employee);
        System.out.println("-------------------------------------------------------------");
        averageSalary(employee);
        System.out.println("-------------------------------------------------------------");
        namesEmployee(employee);


    }
    public static void allEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static int allSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
              System.out.println("Сумма затрат на зарплаты в месяц " + sum);
           return sum;
    }
    public static void minSalary(Employee[] employees) {
        Employee min = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (min.getSalary() > employees[i].getSalary()) {
                min = employees[i];
            }
        }
        System.out.println("Минимальная зарплата " + min.getSalary() + " рублей у сотрудника " + min.getName());
    }
    public static void maxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (max.getSalary() < employees[i].getSalary())
                max = employees[i];
        }
        System.out.println("Максимальная зарплата " + max.getSalary() + " рублей у сотрудника " + max.getName());
    }
    public static void averageSalary(Employee[] employees) {
        int averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary() / employees.length;
        }
        System.out.println("Средняя заработная плата составляет: " + averageSalary + " рублей.");
    }

    public static void namesEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Ф.И.О. сотрудника: " + employees[i].getName());
        }
    }



    }
