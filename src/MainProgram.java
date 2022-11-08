public class MainProgram {
    public static void main(String[] args) {
        Employee e1 = new Employee("1","Employee","01.01.2000",'w',60,60,"None");
        Employee e2 = new Employee("2","Employee","01.01.2000",'m',41,60,"None");
        Employee e3 = new Employee("3","Employee","01.01.2000",'m',53,60,"None");
        Employee e4 = new Employee("4","Employee","01.01.2000",'m',78,60,"None");
        Employee e5 = new Employee("5","Employee","01.01.2000",'m',32,60,"None");
        Employee e6 = new Employee("6","Employee","01.01.2000",'m',6,60,"None");

        if(e1.getAge() >= 40){
            if(e1.getAge() < 50){
                e1.setSalary(3000);
            }else{
                if(e1.getAge() >= 50){
                    e1.setSalary((int)(Math.random() * 1000) + 4000);
                }
                if(e1.getAge() >= 60){
                    e1.setSalary(e1.getSalary() + 500);
                }
            }
        }
        if(e2.getAge() >= 40){
            if(e2.getAge() < 50){
                e2.setSalary(3000);
            }else{
                if(e2.getAge() >= 50){
                    e2.setSalary((int)(Math.random() * 1000) + 4000);
                }
                if(e2.getAge() >= 60){
                    e2.setSalary(e2.getSalary() + 500);
                }
            }
        }
        if(e3.getAge() >= 40){
            if(e3.getAge() < 50){
                e3.setSalary(3000);
            }else{
                if(e3.getAge() >= 50){
                    e3.setSalary((int)(Math.random() * 1000) + 4000);
                }
                if(e3.getAge() >= 60){
                    e3.setSalary(e3.getSalary() + 500);
                }
            }
        }
        if(e4.getAge() >= 40){
            if(e4.getAge() < 50){
                e4.setSalary(3000);
            }else{
                if(e4.getAge() >= 50){
                    e4.setSalary((int)(Math.random() * 1000) + 4000);
                }
                if(e4.getAge() >= 60){
                    e4.setSalary(e4.getSalary() + 500);
                }
            }
        }
        if(e5.getAge() >= 40){
            if(e5.getAge() < 50){
                e5.setSalary(3000);
            }else{
                if(e5.getAge() >= 50){
                    e5.setSalary((int)(Math.random() * 1000) + 4000);
                }
                if(e5.getAge() >= 60){
                    e5.setSalary(e5.getSalary() + 500);
                }
            }
        }
        if(e6.getAge() >= 40){
            if(e6.getAge() < 50){
                e6.setSalary(3000);
            }else{
                if(e6.getAge() >= 50){
                    e6.setSalary((int)(Math.random() * 1000) + 4000);
                }
                if(e6.getAge() >= 60){
                    e6.setSalary(e6.getSalary() + 500);
                }
            }
        }


        if(e1.getGender() == 'w'){
            double newSalary = e1.getSalary() + 10000;
            e1.setSalary(newSalary);
        }else{
            double newSalary2 = e1.getSalary() - 5000;
            e1.setSalary(newSalary2);
        }
        if(e1.getAge() >= 50 && e1.getGender() == 'm'){
            double newWeight = e1.getWeight() - 10;
            e1.setWeight(newWeight);
        }
        if(e1.getGender() == 'w' && e1.getAge() >= 50 && e1.getAge() < 65){
            double newWeight = e1.getWeight() - 5;
            e1.setWeight(newWeight);
        }else{
            double newWeight2 = e1.getWeight() + 2;
            e1.setWeight(newWeight2);
        }



        System.out.println(e1.getForename() + " " + e1.getName() + " born:" +e1.getBirthdate() + " gender:" + e1.getGender() + " age:" + e1.getAge() + " weight:" + e1.getWeight() + "kg" + " department:" + e1.getDepartment() + " salary:" + e1.getSalary() + " yos:" + e1.getYearsOfService() + " specialities:" + e1.getSpecialities());
        System.out.println(e2.getForename() + " " + e2.getName() + " born:" +e2.getBirthdate() + " gender:" + e2.getGender() + " age:" + e2.getAge() + " weight:" + e2.getWeight() + "kg" + " department:" + e2.getDepartment() + " salary:" + e2.getSalary() + " yos:" + e2.getYearsOfService() + " specialities:" + e2.getSpecialities());
        System.out.println(e3.getForename() + " " + e3.getName() + " born:" +e3.getBirthdate() + " gender:" + e3.getGender() + " age:" + e3.getAge() + " weight:" + e3.getWeight() + "kg" + " department:" + e3.getDepartment() + " salary:" + e3.getSalary() + " yos:" + e3.getYearsOfService() + " specialities:" + e3.getSpecialities());
        System.out.println(e4.getForename() + " " + e4.getName() + " born:" +e4.getBirthdate() + " gender:" + e4.getGender() + " age:" + e4.getAge() + " weight:" + e4.getWeight() + "kg" + " department:" + e4.getDepartment() + " salary:" + e4.getSalary() + " yos:" + e4.getYearsOfService() + " specialities:" + e4.getSpecialities());
        System.out.println(e5.getForename() + " " + e5.getName() + " born:" +e5.getBirthdate() + " gender:" + e5.getGender() + " age:" + e5.getAge() + " weight:" + e5.getWeight() + "kg" + " department:" + e5.getDepartment() + " salary:" + e5.getSalary() + " yos:" + e5.getYearsOfService() + " specialities:" + e5.getSpecialities());
        System.out.println(e6.getForename() + " " + e6.getName() + " born:" +e6.getBirthdate() + " gender:" + e6.getGender() + " age:" + e6.getAge() + " weight:" + e6.getWeight() + "kg" + " department:" + e6.getDepartment() + " salary:" + e6.getSalary() + " yos:" + e6.getYearsOfService() + " specialities:" + e6.getSpecialities());


    }
}
