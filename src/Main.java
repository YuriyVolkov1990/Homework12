public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book();

        warAndPeace.authorName = "Л.Н.Толстой";
        System.out.println("Автор - " + warAndPeace.authorName);

        warAndPeace.bookName = "Война и Мир";
        System.out.println("Название - " + warAndPeace.bookName);

        warAndPeace.publishingYear = 1867;
        System.out.println("Год - " + warAndPeace.publishingYear);

        System.out.println();
        Person sarah = new Person();
        sarah.name = "Sarah";
        System.out.println("sarah.name = " + sarah.name);
        sarah.age = 30;
        System.out.println("sarah.age = " + sarah.age);
    }

    public static class Person {
        String name;
        int age;
    }
}
    class Book {
        String authorName;
        String bookName;
        int publishingYear;
    }

