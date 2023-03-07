public class sLinkedQueue <E> implements Queue<E> {
    singleLinkedList<E> list=new singleLinkedList<>();//ظ‡ط°ظ‡ ط§ظ„ط¬ط§ظ‡ط²ط©
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {

        return list.first() ;  //ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ

    }

    @Override
    public void enqueue(E e) {

        list.addLast(e);//ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ
    }

    @Override
    public E dequeue() {

        return   list.removeFirst(); //ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ
    }
    public void rotate(){
        enqueue(dequeue());
    }
    public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {

        L.list.size+=M.list.size;
        L.list.tail.next=M.list.head;
        L.list.tail= M.list.tail;

        return L;
    }
    public void print(){
        singleLinkedList.Node<E> i=list.head;
        while (i!=null){
            System.out.println(i.getElement());
            i=i.next;
        }
    }
}


