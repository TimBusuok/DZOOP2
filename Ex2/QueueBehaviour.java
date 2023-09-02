package DZ2.Ex2;

interface QueueBehaviour {
    void enqueue(String person);
    String dequeue();
    String peek();
    boolean isEmpty();
}
