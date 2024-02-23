public class Main {
    public static void main(String[] args) {
        Pencilcase p1 = new Pencilcase();
        p1.addPencil(3,1);
        p1.openZip(1);
        p1.addPencil(4,2);
        p1.openZip(2);
        p1.addPencil(3,1);
        p1.addPencil(2,2);
        p1.addPencil(2,1);
        p1.addPencil(2,2);
        p1.addPencil(5,1);
        p1.removePencil(2,2);
        p1.removePencil(5,1);
        p1.removePencil(5,1);
        p1.closeZip(1);
        p1.closeZip(2);
        p1.addPencil(2,1);
        p1.addPencil(2,2);
    }
}