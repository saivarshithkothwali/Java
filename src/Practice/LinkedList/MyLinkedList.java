package Practice.LinkedList;

public class MyLinkedList
{
    public static void main(String[] args)
    {
        MyLinkedList obj=new MyLinkedList();
        obj.insertTail(12);
        obj.printList();
        obj.insertHead(11);
        obj.printList();
        obj.insertNode(13,3);
        obj.printList();
        obj.insertNode(14,2);
        obj.printList();
        obj.insertTail(10);
        obj.printList();
        obj.insertHead(2);
        obj.printList();
        obj.deleteHead();
        obj.printList();
        obj.deleteHead();
        obj.printList();
        obj.deleteTail();
        obj.printList();
        obj.deleteNode(2);
        obj.printList();
        obj.updateValue(3,15);
        obj.printList();
        obj.updateValue(2,16);
        obj.printList();
        System.out.println(obj.searchValue(14));
        System.out.println(obj.searchValue(15));


    }

    Node<Integer> head;
    int size;

    MyLinkedList()
    {
        this.head=null;
        this.size=0;
    }

    public  void insertNode(int data,int position)
    {
        if(position>size+1 || position<=0)
        {
            System.out.println("Wrong Input");
            return;
        }
        if(position==1)
        {
            insertHead(data);
            return;

        }
        else if(position==size+1)
        {
            insertTail(data);
            return;
        }
        else
        {
            Node<Integer> newNode=new Node<>(data);
            Node<Integer> temp=head;
            int counter=1;

            while(counter<position-1 && temp!=null)
            {
                counter++;
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
        System.out.println("Insertion successful at position"+position);
    }

    public void insertHead(int data)
    {
        Node<Integer> newNode=new Node<>(data);
        if(head==null)
        {
            head=newNode;
            System.out.println("Insertion at head is successful");
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
        System.out.println("Insertion at head is successful");
    }

    public void insertTail(int data)
    {
        Node<Integer> newNode=new Node<>(data);
        if(head==null)
        {
            head=newNode;
            size++;
            System.out.println("Insertion at tail is successful");
            return;
        }
        Node<Integer> temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
        System.out.println("Insertion at tail is successful");
    }

    public void deleteHead()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }

        Node<Integer> temp=head;
        head=head.next;
        temp.next=null;
        System.out.println("deletion at head is successful");
        size--;
    }

    public void deleteTail()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node<Integer> temp=head;
        Node<Integer> prev=null;

        if(temp.next==null)
        {
            size--;
            head=null;
            System.out.println("deletion at tail is successful");
            return;
        }
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;

        }
        prev.next=null;
        size--;
        System.out.println("deletion at tail is successful");
    }

    public void deleteNode(int position)
    {

        if(position>size || position<=0)
        {
            System.out.println("Wrong Input");
            return;
        }
        if(position==1)
        {
            deleteHead();
            return;
        }
        else if(position==size)
        {
            deleteTail();
            return;
        }
        else
        {
            Node<Integer> temp=head;
            Node<Integer> prev=null;
            int counter=1;
            while(counter<position && temp!=null)
            {
                prev=temp;
                temp=temp.next;
                counter++;
            }
            prev.next=temp.next;
            temp.next=null;

            size--;
            System.out.println("deletion at position "+position);
        }
    }

    public void updateValue(int position,int updatedValue)
    {
        if(position>size || position<=0)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(head==null)
        {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node<Integer> temp=head;
        int counter=1;
        while(counter<position && temp!=null)
        {
            temp=temp.next;
            counter++;
        }

        temp.data=updatedValue;

        System.out.println("LinkedList updated successfully");

    }

    public int searchValue(int value)
    {
        Node<Integer> temp=head;

        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return -1;
        }
        int counter=1;

        while(temp!=null)
        {
            if(temp.data==value)
            {
                return counter;
            }

            temp=temp.next;
            counter++;
        }
        return -1;
    }

    public void printList()
    {
        Node<Integer> temp=head;
        while(temp!=null)
        {
            System.out.println("data is->"+temp.data);
            temp=temp.next;
        }
    }


}
class Node<T>
{
    T data;
    Node<T> next;

    Node()
    {
        this.next=null;
    }
    Node(T data)
    {
        this.data=data;
        this.next=null;
    }
}



