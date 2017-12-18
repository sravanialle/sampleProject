package mySampleProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) {
		//Stream.of(arrayOfElements)
		Stream<Integer> stream = Stream.of(new Integer[]{1,2,3,4,5,6,7,8,9});
        stream.forEach(p->System.out.print(p + "  "));
        //someList.stream()
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0 ; i<10 ; i++){
        	list.add(i);        	
        }
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(p->System.out.print(p + "  "));
        //Stream.generate() or Stream.iterate()
        System.out.print("Stream.generate() or Stream.iterate()");
        Stream<Date> dateStream = Stream.generate(()-> {return new Date();});
       // dateStream.forEach(p->System.out.println(p));
        //String chars or String tokens
        System.out.println("String chars or String tokens");
        
        IntStream stream3 = "1212321_jhbhjghjb".chars();
        stream3.forEach(p->System.out.println(p));        
        
        Stream stream4 = Stream.of("A&B&N&V&B&C".split("\\&"));
        stream4.forEach(p->System.out.println(p));
        //Stream to List
        System.out.println("Stream to List");
        Stream<Integer> stream5 = list.stream();
        List<Integer> listInt = stream5.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(listInt);
        
        System.out.println("Stream to array using stream.toArray(EntryType[]::new)");
        
         Stream<Integer> stream6 = list.stream();
        /* Integer[] evenNumbersArr = stream6.
        		 					filter(i -> i%2 == 0).
        		 					toArray(Integer[]::new);
         System.out.print(evenNumbersArr);*/
         
         list.stream().
			filter(i -> i%2 != 0).
			forEach(System.out::println);
         
         List<String> memberNames = new ArrayList<String>();
         memberNames.add("Amitabh");
         memberNames.add("Shekhar");
         memberNames.add("Aman");
         memberNames.add("Rahul");
         memberNames.add("Shahrukh");
         memberNames.add("Salman");
         memberNames.add("Yana");
         memberNames.add("Lokesh");
         
         memberNames.stream().sorted().
         map(String::toUpperCase).forEach(System.out::println);
         
         boolean result =  memberNames.stream().anyMatch(p-> p.startsWith("A"));
        System.out.println(result);
        
        Optional<String> optinal = memberNames.stream().reduce((s1,s2)-> s1+"#"+s2);
        optinal.ifPresent(System.out::println);
        
        int[] array = {23,43,56,97,32};
        Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
        Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));

	}

}
