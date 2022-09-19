public class MainProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee("heha","Hehe","01.01.01",'m',21,100, "lachen");
        Employee e2 = new Employee("forename","Surname","01.01.1000",'w',1022,200,"alter");
        System.out.println(e1.getForename() + " " + e1.getName() + " born:" +e1.getBirthdate() + " gender:" + e1.getGender() + " age:" + e1.getAge() + " weight:" + e1.getWeight() + "kg" + " department:" + e1.getDepartment() + " salary:" + e1.getSalary() + " yos:" + e1.getYearsOfService() + " specialities:" + e1.getSpecialities());
        System.out.println(e2.getForename() + " " + e2.getName() + " born:" +e2.getBirthdate() + " gender:" + e2.getGender() + " age:" + e2.getAge() + " weight:" + e2.getWeight() + "kg" + " department:" + e2.getDepartment() + " salary:" + e2.getSalary() + " yos:" + e2.getYearsOfService() + " specialities:" + e2.getSpecialities());

    }
}
