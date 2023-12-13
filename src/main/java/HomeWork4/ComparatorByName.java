package HomeWork4;
import java.util.Comparator;
public class ComparatorByName {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
