/*
Разработать проект, в котором для ввода, вывода и изменения односвязного линейного списка создать следующие методы:
а) с использованием цикла:
– ввод с головы createHead();
– ввод с хвоста createTail();
– вывод (возвращается строка, сформированная из элементов списка) toString();
– добавление элемента в начало списка AddFirst();
– добавление элемента в конец списка AddLast();
– вставка элемента в список с указанным номером Insert();
– удаление элемента с головы списка RemoveFirst();
– удаление последнего элемента списка RemoveLast();
– удаление из списка элемента с указанным номером Remove();
а) с использованием рекурсии:
– ввод с головы createHeadRec();
– ввод с хвоста createTailRec();
– вывод (возвращается строка, сформированная из элементов списка) toStringRec().
 */
package Lab08_06;

public class Main {
    public static void main(String[] args) {
        Node LinkedList = new Node();

        LinkedList.createHead(new int[]{0,1,2});
//LinkedList.printNodeLinkedList(LinkedList.head);
        System.out.println(LinkedList.toString());

        LinkedList.createTail(new int[]{3,2,1});
//LinkedList.printNodeLinkedList(LinkedList.head);
        System.out.println(LinkedList.toString());

        LinkedList.AddFirst(-1);
        System.out.println(LinkedList.toString());

        LinkedList.AddLast(17);
        System.out.println(LinkedList.toString());

        LinkedList.Insert(100,3);
        System.out.println(LinkedList.toString());

        LinkedList.RemoveFirst();
        System.out.println(LinkedList.toString());

        LinkedList.RemoveLast();
        System.out.println(LinkedList.toString());

        LinkedList.Remove(2);
        System.out.println(LinkedList.toString());

        LinkedList.createHeadRec(new int[]{5,6,7});
        System.out.println(LinkedList.toString());
    }
}
class Node {
    protected int value;
    protected Node next;
    protected Node head;

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node() {
    }

    protected void createHead(int [] values) { //– ввод с головы createHead();
        Node head=new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.println("Формирование односвязного списка от головы:");
    }
    protected void createTail(int [] values) {//– ввод с хвоста createTail();
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        this.head = head;
        System.out.println("Формирование односвязного списка от хвоста:");
    }
    protected void printNodeLinkedList(Node head){
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
        System.out.println("\n");
    }
    public String toString(){// вывод (возвращается строка, сформированная из элементов списка) toString();
        Node ref = head;
        String toString = "";
        while (ref != null) {
            toString += " "+ref.value;
            ref = ref.next;
        }
        return toString;
    }
    protected void AddFirst(int head){//добавление элемента в начало списка AddFirst();
        this.head = new Node(head, this.head);
        System.out.println("Добавление элемента в начало списка:");
    }
    protected void AddLast(int tail) {//добавление элемента в конец списка AddLast();
        Node newtail=new Node(tail, null);
        Node ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next=newtail;
        System.out.println("Добавление элемента в конец списка:");
    }
    protected void Insert(int middle, int queue){//– вставка элемента в список с указанным номером Insert();
        Node newNode=new Node(middle, null);
        Node ref = this.head;
        int k=1;
        while (ref.next!= null && (k<queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next=ref.next;
        ref.next=newNode;
        System.out.println("Добавление элемента за № "+queue+" списка:");
    }
    protected void RemoveFirst(){//– удаление элемента с головы списка RemoveFirst();
        this.head=this.head.next;
        System.out.println("Удаление элемента из головы списка:");
    }

    protected void RemoveLast(){// – удаление последнего элемента списка RemoveLast();
        Node ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next=null;
        System.out.println("Удаление элемента из хвоста списка:");
    }

    protected void Remove(int queue){//– удаление из списка элемента с указанным номером Remove();
        Node ref = this.head;
        int k = 1;
        while (ref.next!= null && (k<queue)) {
            ref = ref.next;
            k++;
        }
        ref.next=ref.next.next;
        System.out.println("Удаление элемента под № "+queue+" списка:");
    }
    //с использованием рекурсии:
    protected int createHeadRec(int [] values){ // – ввод с головы createHeadRec();
        Node head=new Node(values[0], null);
        Node tail = head;
        int i = values.length;
        tail.next = new Node (createHeadRec(outputHeadValueRec(values,i-1)), null);
        tail = tail.next;
        this.head = head;
        System.out.println("Формирование односвязного списка рекурсией от головы:");
        return values[i];
        }
    int[] outputHeadValueRec(int [] values, int value) {
        int temp[] = {values[value]};
        return temp;
        }
        /*i
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
         */

        }




