package my.self.cracking.arrays_strings;

public class Matrix90NoAdditionalSpace {
    static byte[][] image = new byte[4][4];

    public static void main(String[] args) {
        for (byte row = 0; row < 4; row ++) {
            for (byte col = 0; col < 4; col ++) {
                image[row][col] = (byte) (row*10 + col);
            }
        }

        System.out.println("Before rotation: ");

        printMatrix(image);

        System.out.println("After rotation: ");

        printMatrix(rotate90());
    }

    private static void printMatrix(byte[][] toRotate) {
        for (byte row = 0; row < 4; row ++) {
            for (byte col = 0; col < 4; col ++) {
                System.out.print(toRotate[row][col]);
                if (col < 3) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    private static byte[][] rotate90() {
        byte[][] image2 = new byte[4][4];
        for (byte row = 3; row >= 0; row --) {
            for (byte col = 0; col < 4; col ++) {
                image2[col][row] = image[3 - row][col];
            }
        }
        return image2;
    }
}
