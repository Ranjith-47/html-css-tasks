import java.util.PriorityQueue;
class student{
    int roll_no;
    String name;
    float cgpa;
    student(int roll_no,String name,float cgpa){
        this.name = name;
        this.cgpa = cgpa;
        this.roll_no = roll_no;
    }
}
public class Custom_priority {
    public static void main(String[] args) {
        PriorityQueue<student> que = new PriorityQueue<>(//(s1,s2) -> Float.compare(s1.cgpa,s2.cgpa)
        //(s1,s2) -> s1.roll_no - s2.roll_no;
                //(s1,s2) -> s1.name.compareTo(s2.name))
                (s1,s2) -> {
                    if(!s1.name.equals(s2.name))
                        return s1.name.compareTo(s2.name);
                    return  s1.roll_no - s2.roll_no;
                }
        );
        que.offer(new student(104,"CCC",5.67f));
        que.offer(new student(103,"CCC", 6.78f));
        que.offer(new student(105,"EEE",7.88f));
        while (!que.isEmpty()) {
            student s = que.poll();
            System.out.println(s.roll_no);
            System.out.println(s.name);
            System.out.println(s.cgpa);
        }
    }
}
