
public class LinkQueue<E>   {
    private class Element{

        private E value;
        private Element next;

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Element getNext() {
            return next;
        }

        public void setNext(Element next) {
            this.next = next;
        }



        Element(E data){
            this.value=data;
        }
    }

    Element head=null;

    public LinkQueue(){}



    public boolean isFull() {
        return !(head == null);
    }


    public E dequeue() {

        E helpVal;

        if(head==null)
            return null;


        helpVal = head.value;

        head = head.getNext();

        return helpVal;
    }


    public boolean enqueue(E e) {
        Element newElem=new Element(e);
        if(head==null){
            head=newElem;
            return true;
        }
        Element tail=head;
        while(tail.getNext()!=null)
            tail=tail.getNext();
        tail.setNext(newElem);
        return true;
    }


    public int size() {
        int pos=0;
        Element actElem=head;
        while(actElem!=null)
        {
            pos++;
            actElem=actElem.getNext();
        }
        return pos;
    }





}
