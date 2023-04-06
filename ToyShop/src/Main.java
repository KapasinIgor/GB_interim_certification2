import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Controller controller = new Controller();

        //количество разыгрываемых игрушек за раз
        int numberOfPrizes = 15;

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Машинка Hot Wheels", 35));
        toys.add(new Toy(2, "Скакалка", 50));
        toys.add(new Toy(3, "Конструктор Lego", 100));
        toys.add(new Toy(4, "Пазл 30х50", 25));
        toys.add(new Toy(5, "Кукла Barbie", 70));
        toys.add(new Toy(6, "Кубик Рубика", 95));
        toys.add(new Toy(7, "Воздушный шарик", 5));

        controller.fileWriter(toys, "raffle_result.txt", numberOfPrizes);
    }

}