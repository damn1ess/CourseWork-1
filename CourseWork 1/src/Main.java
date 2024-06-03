

public class Main {
    private static final Employee[] employees = new Employee[10];

    private static void printSeparator() {
        System.out.println("================================================================================");
    }

    private static void showEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void showEmployeesOfDepartments(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + ". " + employee.getFirstName() + " " + employee.getLastName() + " : " + Math.round(employee.getSalary()) + ".");
            }
        }
    }

    private static double toSumSalaries() {
        double sumOfSalaries = 0;
        for (Employee employee : employees) {
            sumOfSalaries += employee.getSalary();
        }
        return sumOfSalaries;
    }

    private static double toSumSalariesDepartments(int department) {
        double sumOfSalariesDepartments = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sumOfSalariesDepartments += employee.getSalary();
            }
        }
        return sumOfSalariesDepartments;
    }

    private static Employee findMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (minSalary.getSalary() > employee.getSalary()) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    private static Employee findMinSalaryDepartments(int department) {
        Employee minSalary = employees[0];
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        if (numberOfEmployees != 0) {
            for (Employee value : employees) {
                if (value.getDepartment() == department) {
                    minSalary = value;
                }
            }
        } else {
            throw new RuntimeException("В департаменте отсутствуют сотрудники");
        }
        for (Employee employee : employees) {
            if (minSalary.getSalary() > employee.getSalary() && employee.getDepartment() == department) {
                minSalary = employee;
            }
        }
        return minSalary;
    }

    private static Employee findMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (maxSalary.getSalary() < employee.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    private static Employee findMaxSalaryDepartments(int department) {
        Employee maxSalary = employees[0];
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        if (numberOfEmployees != 0) {
            for (Employee value : employees) {
                if (value.getDepartment() == department) {
                    maxSalary = value;
                }
            }
        } else {
            throw new RuntimeException("В департаменте отсутствуют сотрудники");
        }
        for (Employee employee : employees) {
            if (maxSalary.getSalary() < employee.getSalary() && employee.getDepartment() == department) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    private static double findAverageSalary() {
        return toSumSalaries() / employees.length;
    }

    private static double findAverageSalaryDepartments(int department) {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        return toSumSalariesDepartments(department) / numberOfEmployees;
    }

    private static void indexesTheSalary(int indexPercent) {
        double valueOfIndex = (double) indexPercent / 100;
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() + employee.getSalary() * valueOfIndex);
        }
    }

    private static void indexesTheSalaryDepartments(int department, int indexPercent) {
        double valueOfIndex = (double) indexPercent / 100;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * valueOfIndex);
            }
        }
    }

    private static void showSalaryLessThen(double value) {
        for (Employee employee : employees) {
            if (employee.getSalary() < value) {
                System.out.println(employee.getId() + ". " + employee.getFirstName() + " " + employee.getLastName() + " : " + Math.round(employee.getSalary()) + ".");
            }
        }
    }

    private static void showSalaryGreaterThen(double value) {
        for (Employee employee : employees) {
            if (employee.getSalary() > value) {
                System.out.println(employee.getId() + ". " + employee.getFirstName() + " " + employee.getLastName() + " : " + Math.round(employee.getSalary()) + ".");
            }
        }
    }


    public static void main(String[] args) {
        employees[0] = new Employee("Artyom", "Polzikov", 1, 76_650);
        employees[1] = new Employee("Gennady", "Chernenko", 3, 53_000);
        employees[2] = new Employee("Sergey", "Krasnov", 2, 47_124);
        employees[3] = new Employee("Alexandr", "Ostankov", 4, 86_030);
        employees[4] = new Employee("Oxana", "Didenko", 5, 31_472);
        employees[5] = new Employee("Vitally", "Zozulin", 2, 123_984);
        employees[6] = new Employee("Ivan", "Tihonenko", 3, 87_178);
        employees[7] = new Employee("Valery", "Atanov", 4, 79_764);
        employees[8] = new Employee("illya", "Shatilov", 5, 75_651);
        employees[9] = new Employee("Alexandra", "Volod'ko", 1, 28_453);

        //Базовая сложность
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

        //Повышенная сложность
        indexesTheSalaryDepartments(2, 1);
        System.out.println("\n\nСумма зарплат сотрудников первого отдела: " + Math.round(toSumSalariesDepartments(1)));
        printSeparator();
        System.out.println("Сумма зарплат сотрудников второго отдела: " + Math.round(toSumSalariesDepartments(2)));
        printSeparator();
        System.out.println(findMinSalaryDepartments(3));
        printSeparator();
        System.out.println(findMaxSalaryDepartments(3));
        printSeparator();
        System.out.println(Math.round(findAverageSalaryDepartments(1)));
        printSeparator();
        showEmployeesOfDepartments(1);
        printSeparator();
        showSalaryGreaterThen(70000);
        printSeparator();
        showSalaryLessThen(70000);
    }
}