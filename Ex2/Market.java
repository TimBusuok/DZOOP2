package DZ2.Ex2;

import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue;

    public Market() {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(String person) {
        queue.add(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public String peek() {
        return queue.peek();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    @Override
    public void addPerson(String person) {
        enqueue(person);
    }

    @Override
    public String removePerson() {
        return dequeue();
    }

    @Override
    public void update() {
        // Обновление состояния магазина
        // Принятие и отдача заказов
    }

}
