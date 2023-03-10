package OopHomeWork_5.InfoSystem;

    class EmployeeDetails {  
    int emp_id, salary;  
    String name, address, department, email;  
      
    public int getEmp_id() {  
        return emp_id;  
    }  
    public void setEmp_id(int emp_id) {  
        this.emp_id = emp_id;  
    }  
    public int getSalary() {  
        return salary;  
    }  
    public void setSalary(int salary) {  
        this.salary = salary;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getAddress() {  
        return address;  
    }  
    public void setAddress(String address) {  
        this.address = address;  
    }  
    public String getDepartment() {  
        return department;  
    }  
    public void setDepartment(String department) {  
        this.department = department;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
      
    @Override  
    public String toString() {  
        return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address  
                + ", department = " + department + ", email = " + email + "]";  
        }  
    }  

    public class Employee{  
        public static void main(String args[]) {  
              
            EmployeeDetails emp = new EmployeeDetails();  
            emp.setEmp_id(101);  
            emp.setName("Инна Романова");
            emp.setDepartment("IT-сектор");
            emp.setSalary(35000);
            emp.setAddress("Москва");
            emp.setEmail("test@gmail.com");
              
            System.out.println(emp);  
            int sal = emp.getSalary();  
            int increment = 0;  

            if ((sal >=1000) && (sal <=1500))  
            {  
                increment += (sal * 2)/100;  
                sal = sal+increment;  
                  
                emp.setSalary(sal);  
                System.out.println("\n Заработная плата увеличивается \n");  
                System.out.println(emp);  
                  
            }else if ((sal >=1500) && (sal <=20000)){  
                increment += (sal * 5)/100;  
                sal = sal+increment;  
                  
                emp.setSalary(sal);  
                System.out.println("\n Заработная плата увеличивается \n");  
                System.out.println(emp);  
            }else {  
                System.out.println("\n Зарплата не увеличивается \n");  
                System.out.println(emp);  
            }         
        }  
    }  
