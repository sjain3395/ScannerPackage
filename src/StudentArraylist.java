import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StudentArraylist {
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<String>();
        student.add("Shree");
        student.add("Sumit");
        student.add("Anup");
        student.add("Rahul");
        student.add("Jhon");
        Collections.sort(student);
        for(int i=0; i<student.size(); i++){
            System.out.println(student.get(i));
        }
        Iterator<String> it = student.iterator();
        System.out.println(it.next());
    }
}
