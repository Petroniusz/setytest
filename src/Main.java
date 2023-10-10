import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Person> persons = new HashSet<>();
        persons.add(new Person("Marek", "Arek", 21, "64202137"));
        persons.add(new Person("Jarek", "Marek", 23, "321513100101"));
        persons.add(new Person("Boxdel", "Bombel", 25, "65103895010101010"));
        persons.add(new Person("Gaweł", "Gawłowski", 66, "21150101010"));
        persons.add(new Person("Wojtex", "Malinowski", 43, "czesc jestem wojtek"));

        for (Person person : persons){
            System.out.println(person);
        }
        Iterator<Person> userIterator = persons.iterator();
        while (userIterator.hasNext()){
            Person currentUser = userIterator.next();
            if (currentUser.getName().equals("Marek")){
                userIterator.remove();
            }
        }
        comparatorByPesel comp = new comparatorByPesel();
        Set<Person> people = new TreeSet<>(comp);
        people.add(new Person("Wojtek", "Nowak", 12, "01010101010"));
        people.add(new Person("Adam", "Psikuta", 33, "020004010105012"));
        people.add(new Person("Karol", "Baryła", 23, "0351023104120821"));
        System.out.println(" ");
        for (Person person : people){
            System.out.println(person);
        }
            }
}