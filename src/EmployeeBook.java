import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
    private List<Employee> employeeList;

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public EmployeeList() {
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

    public List<Employee> getPhoneNumberByName(String )

}
