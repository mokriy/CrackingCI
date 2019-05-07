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
        for (int i = 0; i < 3; i ++) {
            rotationStep(image[0][i], 0, i, 0);
        }
        rotationStep(image[1][1], 1, 1, 0);
        return image;
    }

    private static void rotationStep(byte value, int row, int col, int hopCounter) {
       byte nextVal = image[col][3 - row];
       image[col][3 - row] = value;
       int newCol = 3 - row;
       if (hopCounter == 3) {
           image[col][newCol] = value;
       } else {
           rotationStep(nextVal, col, newCol, hopCounter + 1);
       }
    }
}
