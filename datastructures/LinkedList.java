package datastructures;

public class LinkedList<T>{

    Node<T> head;
    public LinkedList(){
        head = null;
    }

    public void insert(T data){
        if(head == null)
            head = new Node<T>(data);
        else{
            Node<T> temp = head;
            while(temp.next != null) temp = temp.next;
            temp.next = new Node<T>(data);
        }
    }

    public void insertAfter(Node<T> node, Node<T> newNode){
        newNode.next = node.next;
        node.next = newNode;
    }

    public boolean contains(T key){
        Node<T> temp = head;
        while(temp != null && temp.data != key){
            temp  = temp.next;
        }
        return temp != null;
    }

    public void delete(T key){
        Node<T> temp = head;
        if(temp.data == key){
            head = head.next;
            return;
        }

        while(temp.next != null){
            if(temp.next.data == key){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> temp = head;
        while(temp != null){
            sb.append(temp.data + ",");
            temp = temp.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] aStrings){
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println(list);
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        System.out.println(list);
        list.delete(3);
        System.out.println(list);
    }
    
}

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
    }
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
}
