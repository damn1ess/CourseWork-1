

public class Main {
    private static final Employee[] employees = new Employee[10];

    private static void printSeparator(){
        System.out.println("================================================================================");
    }

    private static void showEmployees(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
    private static double toSumSalaries(){
        double sumOfSalaries = 0;
        for(Employee employee : employees){
            sumOfSalaries += employee.getSalary();
        }
        return sumOfSalaries;
    }
    private static Employee findMinSalary(){
        Employee minSalary = employees[0];
        for(Employee employee : employees){
            if(minSalary.getSalary() > employee.getSalary()){
                minSalary = employee;
            }
        }
        return minSalary;
     }
     private static Employee findMaxSalary(){
        Employee maxSalary = employees[0];
        for(Employee employee : employees){
            if(maxSalary.getSalary() < employee.getSalary()){
                maxSalary = employee;
            }
        }
        return maxSalary;
     }

     private static double findAverageSalary(){
        return toSumSalaries() / employees.length;
     }
     private static void printFIO() {
         for (Employee employee : employees) {
             System.out.println(employee.getFirstName() + " " + employee.getLastName() + ".");
         }
    }


    public static void main(String[] args) {
        employees[0] = new Employee("Artyom", "Polzikov", 1, 76_650);
        employees[1] = new Employee("Gennady", "Chernenko", 2, 53_000);
        employees[2] = new Employee("Sergey", "Krasnov", 3, 47_124);
        employees[3] = new Employee("Alexandr", "Ostankov", 4, 86_030);
        employees[4] = new Employee("Oxana", "Didenko", 5, 31_472);
        employees[5] = new Employee("Vitally", "Zozulin", 3, 123_984);
        employees[6] = new Employee("Ivan", "Tihonenko", 2, 87_178);
        employees[7] = new Employee("Valery", "Atanov", 4, 79_764);
        employees[8] = new Employee("illya", "Shatilov", 5, 75_651);
        employees[9] = new Employee("Alexandra", "Volod'ko", 1, 28_453);
        employees[1].setDepartment(3);
        employees[6].setSalary(43_321);

        showEmployees();
        printSeparator();
        System.out.println("Сумма зарплат: " + Math.round(toSumSalaries()));
        printSeparator();
        System.out.println(findMaxSalary());
        printSeparator();
        System.out.println(findMinSalary());
        printSeparator();
        System.out.println("Средняя зарплата: " + Math.round(findAverageSalary()));
        printSeparator();
        printFIO();

    }


}