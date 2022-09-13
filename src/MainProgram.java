public class MainProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee("heha","Hehe","01,01,01",'m',21,100,"lachen");
        Employee e2 = new Employee("forename","Surname","01,01,1000",'w',1022,200,"alter");
        System.out.println(e1.getName() + e1.getForename() + e1.getBirthdate() + e1.getGender() + e1.getAge() + e1.getWeight() + "kg" + e1.getSpecialities());
        System.out.println(e2.getName() + e2.getForename() + e2.getBirthdate() + e2.getGender() + e2.getAge() + e2.getWeight() + "kg" + e2.getSpecialities());

    }
}
