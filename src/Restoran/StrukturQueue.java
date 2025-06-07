package Restoran;

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

    public int size() {
        int count = 0;
        Node current = FRONT;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Node current = FRONT;
            int nomor = 1;
            while (current != null) {
                System.out.println("Transaksi #" + nomor++);
                current.getData().tampilkanInfo();
                System.out.println("------------------------");
                current = current.getNext();
            }
            System.out.println("Total antrian: " + size());
        }
    }

    public void cariTransaksi(String namaDicari) {
    Node current = FRONT;
    boolean ditemukan = false;

    while (current != null) {
        Transaksi data = current.getData();
        if (data.getNamaPelanggan().equalsIgnoreCase(namaDicari)) {
            System.out.println("Transaksi ditemukan:");
            data.tampilkanInfo();
            ditemukan = true;
            break; // berhenti setelah ditemukan
        }
        current = current.getNext();
    }

    if (!ditemukan) {
        System.out.println("Transaksi atas nama \"" + namaDicari + "\" tidak ditemukan dalam antrian.");
    }
}
}