package Singleton;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for (int x : source) {
            if (x > treshold) {
                result.add(x);
                count++;
                logger.log("Элемент " + x + " проходит");
            } else {
                logger.log("Элемент " + x + " не проходит");
            }
        }
        logger.log(String.format("Прошло фильтрацию %d элемента из %d", count, source.size()));
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: ");
        System.out.println(result);
        logger.log("Завершаем работу");
        return result;
    }
}
