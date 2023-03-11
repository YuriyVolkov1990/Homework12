public class Main {
    public static void main(String[] args) {
        Person sarah = new Person("Sarah",30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        sarah.setAge(25);
        System.out.println("sarah.getAge() = " + sarah.getAge());
        Person john = new Person("John",13);
    }
}


