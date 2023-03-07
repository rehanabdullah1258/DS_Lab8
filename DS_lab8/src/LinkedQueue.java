import java.util.LinkedList;

public class LinkedQueue<E> implements Queue<E>  {
    LinkedList<E>list=new LinkedList<>();//ظ‡ط°ظ‡ ط§ظ„ط¬ط§ظ‡ط²ط©
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
        return list.getLast() ;//ط·ط§ط¨ظˆط± ط¹ظƒط³ظٹ
        //  return list.getFirst() ;  //ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ

    }

    @Override
    public void enqueue(E e) {
        list.addFirst(e);//ط·ط§ط¨ظˆط± ط¹ظƒط³ظٹ
        //  list.addLast(e);//ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ
    }

    @Override
    public E dequeue() {
        return   list.removeLast();//ط·ط§ط¨ظˆط± ط¹ظƒط³ظٹ
        // return   list.removeFirst(); //ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ
    }

    @Override
    public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {
        return null;
    }
//    public E f() {
//        return lis ;//ط·ط§ط¨ظˆط± ط¹ظƒط³ظٹ
//        //  return list.getFirst() ;  //ط·ط§ط¨ظˆط± ط¹ط§ط¯ظٹ
//
//    }
//    public sLinkedQueue<E> append(sLinkedQueue<E> L, sLinkedQueue<E> M) {
//        singleLinkedList.Node<E>h=L.list.head;
//        System.out.println(h);
//        return L;
//    }

    public void rotate(){
        enqueue(dequeue());
    }
}
