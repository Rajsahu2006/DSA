package QUEUE;
//CIRCULAR QUEUE USING ARRAY;
public class Qu2 {
    static class Queue{
        static int arr[];
        static int size; // last element ka index
        static int rear;  // first element ka index
        
        static int front;

        Queue(int n){
            arr = new int [n];
            this.size = n;
        }
        //Condition 1;
        public static boolean isEmpity(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear + 1)% size == front;//Condition of Circular Queue.
        }
        //Enqueue;
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            //Add first Element.
            if(front == -1){
                front= 0;
            }
            rear = (rear + 1)% size; // rear++ ki jagha
            arr[rear] = data;
        }
        //Dequeue;
        public static int Remove(){
            if(isEmpity()){
                System.out.println("Queue is empity");
                return -1;
            }
            int result = arr[front]; // = 1
            //Single element condition'
            if(rear == front){
                rear = front =-1;

            }else{
                front = (front +1)% size;
            }
            return result;
        }
        //Peek;
        public static int peek(){
            if(isEmpity()){
                System.out.println("Queue is empity");
                return -1;
            }
            return arr[front];
        }
    }
    //Main function;
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.Remove());
        q.add(6);
        System.out.println(q.Remove());
        q.add(7);
        while (!q.isEmpity()) {
            System.out.println(q.peek());
        q.Remove();
            
        }
    }
    
}
