package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger log = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        log.log("Запускаем программу");
        log.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка: ");
        List<Integer> list = new ArrayList<>();
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int limit = scanner.nextInt();
        log.log("Создаем и наполняем список");
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(limit));
        }
        System.out.println("Вот случайный список: " + list);
        log.log("Просим пользователя ввести входные данные для фильтрации: ");
        System.out.println("Введите порог для фильтра: ");
        limit = scanner.nextInt();
        log.log("Запускаем фильтрацию");
        Filter filter = new Filter(limit);
        filter.filterOut(list);

    }
}
