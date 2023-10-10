import java.util.Comparator;

public class comparatorByPesel implements Comparator<Person> {

    public int compare(Person a1, Person a2){
        if(a1.getPesel().length() > a2.getPesel().length()){
            return 1;
        }
        return 0;
    }

}
