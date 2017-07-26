package lambdasinaction._02stream.basic2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println(transactions.stream().filter(a->a.getYear()>=2011)
								.sorted(Comparator.comparingInt(Transaction::getValue))
								.collect(Collectors.toList()));
		

        
        // Query 2: What are all the unique cities where the traders work?
		System.out.println(transactions.stream().map(a->a.getTrader().getCity())
							.distinct()
							.collect(Collectors.toList()));



        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println(transactions.stream()
        								.filter(a->a.getTrader().getCity().equals("Cambridge"))
        								.sorted(Comparator.comparing(a->a.getTrader().getName()))
        								.distinct()
        								.collect(Collectors.toList()));

        
        // Query 4: Return a string of all traders�� names sorted alphabetically.
        System.out.println(transactions.stream()
        								.map(a->a.getTrader().getName())
        								.sorted()
        								.distinct()
        								.collect(Collectors.toList()));

        
        // Query 5: Are there any trader based in Milan?
        
        System.out.println(transactions.stream()
        								.anyMatch(d->d.getTrader().getCity().equals("Milan")));	

        
        
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
					.filter(d->d.getTrader().getCity().equals("Milan"))
					.forEach(d->d.getTrader().setCity("Cambridge"));
        								
        								

        
        
        // Query 7: What's the highest value in all the transactions?
		System.out.println(transactions.stream()
										.map(Transaction::getValue)
										.reduce(Integer::max)
										.get());
		


    }
}