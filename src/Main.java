public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();

        Employee employee1 = new Employee(1, 11111, "Mark", 7);
        Employee employee2 = new Employee(2, 22222, "Slava", 4);
        Employee employee3 = new Employee(3, 33333, "George", 10);
        Employee employee4 = new Employee(4, 44444, "Timur",1);


        EmployeeList.employeeList.add(employee1);
        EmployeeList.employeeList.add(employee2);
        EmployeeList.employeeList.add(employee3);
        EmployeeList.employeeList.add(employee4);


        System.out.println(" ");
        System.out.println("Сотрудники: ");
        System.out.println(EmployeeList.employeeList);

        System.out.println(" ");
        System.out.println("Найти по стажу: ");
        System.out.println(employeeList.findByExperience(10));

        System.out.println(" ");
        System.out.println("Найти номер телефона сотрудника по имени: ");
        System.out.println(employeeList.findPhoneByNameMap("Timur"));

        System.out.println(" ");
        System.out.println("Найти сотрудника по табельному номеру: ");
        System.out.println(employeeList.findEmployeeById(2));

        System.out.println("После добавления нового сотрудника: ");
        employeeList.addToEmployeeList(5, 55555, "Denis",0);
        System.out.println(employeeList.employeeList);
    }
}