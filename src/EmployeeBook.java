import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {
    private List<Employee> employeeList;

    public EmployeeBook(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public EmployeeBook() {
        this.employeeList = new ArrayList<>();
    }

    public void addEmloyee (Employee employee){
        this.employeeList.add(employee);
    }

    public List<Employee> getEmployeeByExperience(int experience){
        List<Employee>resultList = new ArrayList<>();
        for (Employee elem : this.employeeList){
            if (elem.getExperience() >= experience){
                resultList.add(elem);
            }
        }
        return resultList;
    }

    public String getPhoneNumberByName(String name){
        for (Employee elem : this.employeeList){
            if (elem.getName().equals(name)){
                return elem.getPhoneNumber();
            }
        }
        return "сотрудник не найден";
    }

    public Employee getEmployeeByID(int id){
        for (Employee elem : this.employeeList){
            if (elem.getId()== id){
                return elem;
            }
        }
        return null;
    }
    public String printEmployeeBook(){
        StringBuilder result = new StringBuilder();
        for (Employee elem : this.employeeList){
            result.append(elem.toString());
            result.append("\n");
        }
        return result.toString();
    }
}
