

public class ArrayQueue<E>implements Queue<E> {
        private  int s=0;
        private int  f=0;
        static  final  int CAPACITY=10;
        E []data;
        public ArrayQueue(int cap) {
            data= (E[]) new Object[cap];
        }
        public ArrayQueue() {
            this(CAPACITY);
        }

        public void rotate(ArrayQueue<E> q){
            q.enqueue(q.dequeue());
        }
        public  void  print(ArrayQueue<E>q) {
            ArrayQueue<E> q1 = new ArrayQueue<>();
            while (!q.isEmpty()) {
                System.out.print(q.first() + "  ");
                q1.enqueue(q.dequeue());

            }
            while (!q1.isEmpty()) {
                q.enqueue(q1.dequeue());

            }

        }
        public ArrayQueue<E> clone(ArrayQueue<E>q){
            ArrayQueue<E>q1=new ArrayQueue<>(10);
            int ff=q.size();
            while (ff>0){
                q1.enqueue(q.first());
                rotate(q);
                ff--;
            }

            return q1;


        }
        @Override
        public boolean isEmpty() {
            return s==0;
        }

        @Override
        public int size() {
            return s;
        }

        @Override
        public E first() {
            if (isEmpty())return  null;
            return data[f];
        }

        @Override
        public void enqueue(E e) {
            if(size()==data.length)
                throw new IllegalStateException("Queue is full");
            int x=(f+s)%data.length;
            data[x]=e;
            s++;
        }

        @Override
        public E dequeue() {
            if (isEmpty())return  null;
            E delet=data[f];
            data[f]=null;
            f=(f+1)%data.length;
            s--;
            return delet;
        }

        @Override
        public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {
            return null;
        }
    }
