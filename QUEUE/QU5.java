package QUEUE;
import java.util.*;
public class QU5 {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpity(){
            return s1.isEmpty();
        }
        public static void add(int data){
            while(!s1.isEmpty()){ // !s1 jab tak ..
                s2.push(s1.pop());
            }
            s1.push(data);
            
                
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        public static int remove(){
            if(isEmpity()){
                return 0;
            }
            return s1.pop();
        }

        public static int peek(){
            if(isEmpity()){
                System.out.println("Empty Queue");
                return 0;
            }
            return s1.peek();
        }

    }
        public static void main(String[] args) {
            Queue obj = new Queue();
            obj.add(1);
            obj.add(2);
            obj.add(3);
            obj.add(4);
            obj.add(5);

            while (!obj.isEmpity()) {
                System.out.println(obj.peek());
                obj.remove();
                
            }
            
        }
    
    
}
