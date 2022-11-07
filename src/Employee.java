public class Employee {
    private String name;
    private String forename;
    private String birthdate;

    private char gender;
    private int age;
    private double weight;

    private String department;
    private double salary;

    private int yearsOfService;
    private String specialities;

    public Employee(String name, String forename, String birthdate, char gender, int age, double weigth, String specialities){
        this.name = name;
        this.forename = forename;
        this.birthdate = birthdate;

        this.gender = gender;
        this.age = age;
        this.weight = weigth;

        this.department = "A38";
        this.salary = 1500;

        this.yearsOfService = 0;
        this.specialities = specialities;

    }

    public String getName(){
        return name;
    }

    public String getForename() {
        return forename;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public String getSpecialities() {
        return specialities;
    }
    public void setSalary(double newSalary) {
        this.salary = newSalary;
    }
}
