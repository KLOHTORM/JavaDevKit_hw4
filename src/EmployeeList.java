import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeList {
    public static List<Employee> employeeList = new ArrayList<>();

    protected  List<Employee> findByExperience(Integer employeeExp){
        List<Employee> listByExperience = new ArrayList<>();
        for (Employee employee : employeeList) {
            if(employee.getExperience().equals(employeeExp)){
                listByExperience.add(employee);
            }
        }
        return listByExperience;
    }


    protected List<Employee> findPhoneByName(String name){
        List<Employee> listPhoneByName = new ArrayList<>();
        for (Employee employee : employeeList) {
            if(employee.getName().equals(name)){
                listPhoneByName.add(employee);
            }
        }
        return listPhoneByName;
    }
    protected HashMap<Integer, String> findPhoneByNameMap(String name){
        HashMap<Integer, String> phoneMapByName = new HashMap<>();
        for (Employee employee : employeeList) {
            if(employee.getName().equals(name)){
                phoneMapByName.put(employee.getPhoneNumber(), employee.getName());
            }
        }
        return phoneMapByName;
    }

    protected List<Employee> findEmployeeById(Integer id){
        List<Employee> employeesListById = new ArrayList<>();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)){
                employeesListById.add(employee);
            }
        }
        return employeesListById;
    }

    protected void addToEmployeeList(Integer id, Integer phoneNumber, String name, Integer experience){
        employeeList.add(new Employee(id,phoneNumber,name,experience));
    }




}
