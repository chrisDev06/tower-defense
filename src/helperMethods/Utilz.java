package helperMethods;

import java.util.ArrayList;

public class Utilz {

    public static int[][] ArrayListTo2Dint(ArrayList<Integer> list, int ySize, int xSize) {
        int[][] newArr = new int[ySize][xSize];

        for (int j = 0; j < newArr.length; j++) {
            for (int i = 0; i < newArr.length; i++) {
                int index = j * ySize + i;
                newArr[j][i] = list.get(index);
            }
        }
        return newArr;

    }

    public static int[] TowDto1DintArry(int[][] twoArr) {
        int[] oneArr = new int[twoArr.length * twoArr[0].length];

        for (int j = 0; j < twoArr.length; j++) {
            for (int i = 0; i < twoArr[0].length; i++) { // Utilisez twoArr[0].length ici
                int index = j * twoArr[0].length + i;
                oneArr[index] = twoArr[j][i];
            }
        }
        return oneArr;
    }

}