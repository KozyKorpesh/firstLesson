package school.lesson3;

public class Employee {
    public static void main(String[] args) {
        Person[] perCorp = new Person[5];
        perCorp[0] = new Person("Kozy", "QA Engineer", "kozy@gmail.com", "777890890",900000,39);
        perCorp[1] = new Person("Murat", "Developer", "mura@gmail.com", "777890891",450000,33);
        perCorp[2] = new Person("Marat", "Product", "mara@gmail.com", "708987654",250000,35);
        perCorp[3] = new Person("Erik", "Designer", "erik@gmail.com", "705987456",430000,30);
        perCorp[4] = new Person("Nurik", "Support engineer", "nurik@gmail.com", "777345765",850000,45);
        for (Person employee : perCorp)
            if (employee.getAge()>40)
                System.out.println(employee);

    }
}
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
