public class Pencilcase {
    public int numberofslot = 2;
    public boolean[] isOpen= new boolean[numberofslot];
    public int[] capacity= new int[numberofslot];
    public int[] totalAmount= new int[numberofslot];
    Pencilcase() {
        this.capacity[0] = 5;
        this.capacity[1] = 3;
        this.totalAmount[0] = 0;
        this.totalAmount[1] = 0;
    }
    public void openZip(int numberofslot) {
        if (!(isOpen[numberofslot - 1])) {
            isOpen[numberofslot - 1] = true;
        }
    }
    public void closeZip(int numberofslot) {
        if (isOpen[numberofslot - 1]) {
            isOpen[numberofslot - 1] = false;
        }
    }
    public void addPencil(int nofpencil, int numberofslot) {
        if (!(isOpen[numberofslot - 1])) {
            System.out.println("please open zip");
        }
        else {
            if(totalAmount[numberofslot-1] == capacity[numberofslot-1]) {
                System.out.println("capacity is full!");
            }
            else {
                int i = 0;
                while (totalAmount[numberofslot-1] < capacity[numberofslot-1] && nofpencil > 0) {
                    nofpencil--;
                    totalAmount[numberofslot-1]++;
                    i++;
                }
                System.out.println("number of slot: " + (numberofslot));
                System.out.println(i + " added pencil");
                System.out.println("total number of pencil in slot :" + totalAmount[numberofslot-1]);
                if (nofpencil > 0) {
                    System.out.println(nofpencil + " pencil not added, capacity is full");
                }
            }
        }
        System.out.println("********************");
    }
    public void removePencil(int nofpencil, int numberofslot) {
        if (!(isOpen[numberofslot - 1])) {
            System.out.println("please open zip");
        }
        else {
            if (totalAmount[numberofslot-1] <= 0) {
                System.out.println("there is no pencil in slot");
            }
            else {
                int i = 0;
                while (totalAmount[numberofslot-1] > 0 && nofpencil > 0) {
                    nofpencil--;
                    totalAmount[numberofslot-1]--;
                    i++;
                }
                System.out.println("number of slot: " + (numberofslot));
                System.out.println(i + " removed pencil");
                System.out.println("total number of pencil in slot :" + totalAmount[numberofslot-1]);
                if (nofpencil > 0) {
                    System.out.println(nofpencil + " pencil not removed, there is no pencil");
                }
            }
        }
        System.out.println("*************");
    }
}
