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
        // Тип переменной — Person (Личность)
        sarah.name = "Sarah";
        // Внутри свойства name записали имя
        System.out.println("sarah.name = " + sarah.name);
        // Вывели свойство «имя» в консоль
        sarah.age = 30;
        // Внутри свойства age записали возраст
        System.out.println("sarah.age = " + sarah.age);
        // Вывели свойство «возраст» в консоль
    }

    public static class Person {
        // Создали новый класс Person (Личность)
        String name;
        // Объявили свойство name (имя)
        int age;
        // Объявили свойство age (возраст)
    }
}
    class Book {
        String authorName;
        String bookName;
        int publishingYear;
    }

