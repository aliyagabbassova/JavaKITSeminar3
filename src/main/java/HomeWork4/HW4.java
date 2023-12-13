//package HomeWork4;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//
//public class HW4 implements Iterable<Employee>{
//    private List<Employee> studentList;
//
//    public StudyGroup(){
//        studentList = new ArrayList<>();
//    }
//
//    public void addStudent(Employee employee){
//        studentList.add(employee);
//    }
//
//    @Override
//    public Iterator<Employee> iterator() {
//        return new EmployeeIterator(employeeList);
//    }
//
//    public void sortByName(){
//        studentList.sort(new ComparatorByName());
//    }
//
//    public void sortByExperience(){
//        studentList.sort(new ComparatorByExperience());
//    }
//    public void sortByTabelNum(){
//        studentList.sort(new ComparatorByTabelNum());
//    }
//}
