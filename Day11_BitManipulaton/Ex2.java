//Operations in Bit
public class Ex2 {
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearIthBit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, newBit);
        } else {
            return setIthbit(n, newBit);
        }
    }

    public static int clearLastIthBit(int n, int i) {
        int bitmask =~((1 << i) - 1);
        return n & bitmask;
    }

    public static int clearRangeBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        return n & (a | b);
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(15, 2));

        System.out.println(setIthbit(10, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(updateIthBit(11, 3, 1));

        System.out.println(clearIthBit(42, 3));

        System.out.println(clearRangeBits(10, 2, 4));

    }
}
