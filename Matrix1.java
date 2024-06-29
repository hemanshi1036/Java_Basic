import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        int[][] array1 = getArray("Enter the elements for the first 3x3 array:");
        int[][] array2 = getArray("Enter the elements for the second 3x3 array:");

        displayArray("First array:", array1);
        displayArray("Second array:", array2);

        int choice = getOperationChoice();
        int[][] result;

        switch (choice) {
            case 1:
                result = addArrays(array1, array2);
                displayArray("Sum of arrays:", result);
                break;
            case 2:
                result = subtractArrays(array1, array2);
                displayArray("Difference of arrays:", result);
                break;
            case 3:
                result = multiplyArrays(array1, array2);
                displayArray("Product of arrays:", result);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }
    }
    private static int[][] getArray(String message) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println(message);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        return array;
    }
    private static void displayArray(String message, int[][] array) {
        System.out.println(message);
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    private static int getOperationChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");

        return scanner.nextInt();
    }
    private static int[][] addArrays(int[][] array1, int[][] array2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }

        return result;
    }

    private static int[][] subtractArrays(int[][] array1, int[][] array2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = array1[i][j] - array2[i][j];
            }
        }

        return result;
    }

    private static int[][] multiplyArrays(int[][] array1, int[][] array2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        return result;
    }
}

