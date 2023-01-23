package OOP3;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person Inna = new Person("Инна", 42);

        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Lila = new Person("Лиля", 15);
        Person Nela = new Person("Неля", 9);

        GeoTree gt = new GeoTree();
        gt.appendPerentChild(irina, vasya); // Ирина родитель Васи
        gt.appendPerentChild(irina, masha); // Ирина родитель Маши
        gt.appendPerentChild(vasya, jane); // Вася родитель Жени
        gt.appendPerentChild(vasya, ivan); // Вася родитель Ивана
        gt.appendVifeHusbent(irina, igor); // Ирина жена Игоря
        gt.appendPerentChild(igor, vasya); // Игорь родитель Васи
        gt.appendPerentChild(igor, masha); // Игорь родитель Маши
        gt.appendPerentChild(igor, Sasha); // Игорь родитель Саши
        gt.appendPerentChild(Inna,Lila ); // Инна родитель Лили
        gt.appendPerentChild(Inna,Nela ); // Инна родитель Нелли

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.parent));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(igor, Relationship.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.vife));

        // Ищем детей Ирины
        System.out.println("Дети Инны");
        System.out.println(new Research(gt).spend(Inna, Relationship.parent));
        
        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}