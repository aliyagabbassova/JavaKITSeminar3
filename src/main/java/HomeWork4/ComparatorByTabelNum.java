package HomeWork4;

public class ComparatorByTabelNum {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getTabelNum(), o2.getTabelNum());
    }
}
