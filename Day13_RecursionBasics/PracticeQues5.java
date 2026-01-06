
/*
                TOWER OF HANOI
Youb have 3 Towers and N disks of different sizes which can side onto any Tower.
The  Puzzle starts with disks sorted in ascending order of size from Top to Bottom
(i.e, each disks sits on top of an even larger one)

You have the Following Constraints:
1) Only one Disk can be Moved at a Time
2) A Disk is Slid off the top of one Tower onto another tower
3) A disk cannot be placed on top of a smaller disk

WAP to move the disk from the firstv tower to the Last Using Stacks
*/
public class PracticeQues5 {
    public static void towerOfHanoi(int n,String src, String helper, String dest){
        //base case
        if(n==1){
            System.out.println("Tranfer disk "+n+" from "+src+"to"+dest);
            return;
        }
        //kaam
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Tranfer disk "+n+" from "+src+"to"+dest);
        towerOfHanoi(n-1, helper, src, dest);

    }
    public static void main(String[] args) {
        int n = 2;
        towerOfHanoi(n, "S", "H", "D");

    }
}
