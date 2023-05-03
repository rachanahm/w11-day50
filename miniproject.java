/*Create a program that simulates an organization with different types of employees and departments. The program should have the following classes/interfaces:
Employee - This is an abstract class that has the properties of an employee such as name, age, salary, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
Department - This is an abstract class that has the properties of a department such as name, budget, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also have an interface named "Operation" that has a method named "performOperation" which will be implemented by different department operations such as hiring, firing, budget allocation, etc.
Manager - This is a derived class of the Employee class. It should have additional properties such as team, department, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
Developer - This is a derived class of the Employee class. It should have additional properties such as technology, experience, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them.
Marketing - This is a derived class of the Department class. It should have additional properties such as campaigns, events, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate marketing campaigns and events.
IT - This is a derived class of the Department class. It should have additional properties such as technology, infrastructure, etc. It should have a constructor that initializes these properties, and getters and setters to access and modify them. It should also implement the "Operation" interface with a method implementation of the "performOperation" method that will simulate IT operations such as hiring, firing, and budget allocation.
In the main method, create objects of different types of employees and departments, and simulate employee management and department operations by calling the "performOperation" method of the respective department.*/
abstract class Employee {
 String name;
 int age;
 double salary;
  Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
}
  String getName() {
    return name;
}

 void setName(String name) {
    this.name = name;
}

 int getAge() {
    return age;
}

 void setAge(int age) {
    this.age = age;
}

 double getSalary() {
    return salary;
}

 void setSalary(double salary) {
    this.salary = salary;
}
}
abstract class Department {
 String name;
 double budget;
Department(String name, double budget) {
    this.name = name;
    this.budget = budget;
}
   String getName() {
    return name;
}

 void setName(String name) {
    this.name = name;
}

 double getBudget() {
    return budget;
}

 void setBudget(double budget) {
    this.budget = budget;
}

 interface Operation {
    void performOperation();
}
}
class Manager extends Employee {
 String team;
 String department;
  Manager(String name, int age, double salary, String team, String department) {
    super(name, age, salary);
    this.team = team;
    this.department = department;
}

 String getTeam() {
    return team;
}

 void setTeam(String team) {
    this.team = team;
}

 String getDepartment() {
    return department;
}

 void setDepartment(String department) {
    this.department = department;
}
}
class Developer extends Employee {
 String technology;
 int experience;
  Developer(String name, int age, double salary, String technology, int experience) {
    super(name, age, salary);
    this.technology = technology;
    this.experience = experience;
}
 String getTechnology() {
    return technology;
}

 void setTechnology(String technology) {
    this.technology = technology;
}

 int getExperience() {
    return experience;
}

 void setExperience(int experience) {
    this.experience = experience;
}
}
class Marketing extends Department implements Department.Operation {
 String campaigns;
 String events;
  Marketing(String name, double budget, String campaigns, String events) {
    super(name, budget);
    this.campaigns = campaigns;
    this.events = events;
}
 String getCampaigns() {
    return campaigns;
}

 void setCampaigns(String campaigns) {
    this.campaigns = campaigns;
}

 String getEvents() {
    return events;
}

 void setEvents(String events) {
    this.events = events;
}
  @Override
 public void performOperation() {
    System.out.println("Simulating marketing campaigns and events...");
}
}
class IT extends Department implements Department.Operation {
 String technology;
 String infrastructure;
 IT(String name, double budget, String technology, String infrastructure) {
   super(name, budget);
   this.technology = technology;
   this.infrastructure = infrastructure;
 }
  
 String getTechnology() {
    return technology;
}

 void setTechnology(String technology) {
    this.technology = technology;
}

 String getInfrastructure() {
    return infrastructure;
}

 void setInfrastructure(String infrastructure) {
    this.infrastructure = infrastructure;
}


@Override
 public void performOperation() {
    System.out.println("Simulating IT operations such as hiring, firing, and budget allocation...");
}
}
class Main {
public static void main(String[] args) {
Manager manager1 = new Manager("aaa", 35, 50000, "Development", "IT");
Developer developer1 = new Developer("bbb", 25, 35000, "Java", 2);
Marketing marketing1 = new Marketing("Sales", 100000, "Holiday sale", "Product launch");
IT IT1 = new IT("Software development", 500000, "Cloud computing", "Network infrastructure");
    marketing1.performOperation();
    IT1.performOperation();
}
}