package QUEUE;
//Add ,Remove and peek conditions;
public class Qu1 {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue (int n){       // Constructor
            arr = new int[n];
            this.size =  n;

        }
    
        public static boolean isEmpity(){
            return rear ==-1;
        }
        //Enqueue or Add function.
        public static void add(int data){
            if(rear ==size - 1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        //Dequeue or Remove function;
        public static int Remove(){
            if(isEmpity()){
                return -1;
            }
            int frunt = arr[0];
            for(int i =0; i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear --;
            return frunt;
        }
    
        //Peak function
        public static int peak(){
            if(isEmpity()){
                return -1;
            }
            return arr[0];
        
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpity()) {
            System.out.println(q.peak());
            q.peak();
            break;
            
        }
    }
}
