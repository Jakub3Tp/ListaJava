import javax.swing.*;

public class MyList<T> {
    private Node<T> head;

    //dodaje element
    public void addElement(T value){
        Node<T> node = new Node<>(value, null);
        if(head==null){
            head = node;
        }else{
            Node<T> element = head;
            while(element.next != null){
                element = element.next;
            }
            element.next = node;
        }
    }

    // wyświetla wszystkie elementy listy
    public void display(){
        Node<T> node = head;
            if (head != null) {
                    while (node != null) {
                        System.out.println(node.value);
                        node = node.next;
                    }
                }
    }

    //usuwa ostatni element list
    public void removeElement(){
        Node<T> node = head;
            if (head != null) {
                Node<T> prev = head;
                while (head != null){
                    prev = head;
                    node = head.next;
                }
                if (prev != node) {
                    prev.next = null;
                }else{
                    head = null;
                }
            }
    }

    //wyszukiwanie elementu
    public  Node<T> getElement(T value){
        Node<T> node = head;
        if (node != null) {
            while (node != null) {
                if (node.value.equals(value)){
                    return node;
                }
                node = node.next;
            }
        }
        return null;
    }
}
