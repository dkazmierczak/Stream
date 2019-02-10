import java.util.Arrays;
import java.util.List;

public class FilterExample{
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");

        System.out.println("Imperative style: ");

        for(String name : names){
            if(!name.equals("Sam")){
                System.out.println(name);
            }
        }

        System.out.println("Functional Style: ");

        // this stream will print same values as a for each loop above
        names.stream()
                .filter(name -> !name.equals("Sam"))
                .forEach(System.out::println); //or : .forEach(name -> System.out.println(name));
    }
}
/*
We can also make a function:

private static boolean isNotSam(String name){
	return !name.equals(“Sam”);
}

and then stream will look like this:

names.stream().
	.filter(FilterExample::isNotSam)
	.forEach(System.out::println);

*/
