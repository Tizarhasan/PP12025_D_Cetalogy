package TugasBesar;

public class StrukturQueue {
    private Node FRONT, REAR;

    public void enqueue(Transaksi transaksi) {
        Node newNode = new Node(transaksi);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public Transaksi dequeue() {
        Transaksi hasil = null;
        if (FRONT != null) {
            hasil = FRONT.getData();
            if (FRONT == REAR) {
                FRONT = null;
                REAR = null;
            } else {
                FRONT = FRONT.getNext();
            }
        }
        return hasil;
    }

    public Transaksi front() {
        if (FRONT != null) {
            return FRONT.getData();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return FRONT == null;
    }
}