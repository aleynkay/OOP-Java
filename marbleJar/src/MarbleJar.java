public class MarbleJar {
    public int capacity = 10;
    public int totalAmount = 0;
    public boolean LidStatus = false;
    public void openLid() {
        if (LidStatus == false) {
            LidStatus = true;
        }
    }
    public void closeLid() {
        if (LidStatus == true) {
            LidStatus = false;
        }
    }
    public void addMarble(int nofPencil) {
        if (LidStatus == false) {
            System.out.println("please open lid");
        }
        else {
            if (totalAmount == capacity) {
                System.out.println("capacity is full");
            }
            else {
                int i = 0;
                while (totalAmount < capacity && nofPencil > 0) {
                    totalAmount++;
                    nofPencil--;
                    i++;
                }
                System.out.println("total number of marble : " + totalAmount);
                System.out.println(i + " marble added");
                if (nofPencil > 0) {
                    System.out.println(nofPencil + " marble not added.Capacity is full");
                }
            }
        }
        System.out.println("*******************");
    }
    public void removeMarble(int nofPencil) {
        if (LidStatus == false) {
            System.out.println("please open lid");
        }
        else {
            if (totalAmount == 0) {
                System.out.println("there is no marble");
            }
            else {
                int i = 0;
                while (totalAmount > 0 && nofPencil > 0) {
                    totalAmount--;
                    nofPencil--;
                    i++;
                }
                System.out.println("total number of marble : " + totalAmount);
                System.out.println(i + " marble removed");
                if (nofPencil > 0) {
                    System.out.println(nofPencil + " marble not removed. There is no marble");
                }
            }
        }
        System.out.println("*******************");
    }
}
