package DZ2.Ex2;

public class program {
    public static void main(String[] args) {
        Market market = new Market();
        
        market.addPerson("Покупатель 1");
        market.addPerson("Покупатель 2");
        market.addPerson("Покупатель 3");
        market.addPerson("Покупатель 4");
        market.addPerson("Покупатель 5");
        market.addPerson("Покупатель 6");
        

        System.out.println("Первый покупатель в очереди: " + market.peek());
        while (true) {
            
        
        String removedPerson = market.removePerson();
        
        System.out.println("Удаленный покупатель: " + removedPerson);

        System.out.println("Очередь пуста? " + market.isEmpty());
        
        market.update();

        if(market.isEmpty() == false){
            continue;
        }
        else{
            break;
        }
        
        
       
        }
}
}
