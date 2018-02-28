//package Homework_191017_array;
//
//import java.util.Arrays;
//
//public class Homework {
//    public static void main(String[] args) {
//        int[] array1 = buildArray(10);
//        int[] array2 = buildArray(10);
//        int[] array3 = buildArray(10);
//        int[] array4 = buildArray(10);
//
//        int [][] arrayD = {array1, array2, array3, array4};
////        int [][] arrayD = {
////                {1,2,3,4,5},
////                {12,22,32,42,52},
////                {13,23,33,43,53},
////                {14,24,34,44,54},
////        };
//        for (int i = 0; i < arrayD.length; i++) {
//            int[] arrayNechet = arrayD[i];
//            for (int j = 0; j < arrayNechet.length; j++) {
//                if(j%1 == 0 && j>0){
//                    System.out.println(arrayNechet[j]);
//                }
//                else if(j%1 == 0 && j<0){
//                    System.out.println(arrayNechet[j]);
//                }
//            }
//        }
//        for (int i = 0; i < arrayD.length; i++) {
//            int [] arrayRow = arrayD[i];
//            for (int j = 0; j < arrayRow.length; j++) {
//                System.out.print(arrayRow[j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//        }
//
//        int [] resultSumArray = new int [10];
////        for (int j = 0; j < 10; j++) {
////            resultSumArray[j] = 0;
////            for (int i = 0; i < arrayD.length ; i++) {
////                resultSumArray[j] += arrayD[i][j];
////            }
////        }
//        for (int i = 0; i < arrayD.length ; i++) {
//            for (int j = 0; j < arrayD[i].length ; j++) {
//                resultSumArray[j] += arrayD[i][j];
//            }
//        }
//        System.out.println(Arrays.toString(resultSumArray));
//    }
//
//    private static int[] buildArray(int length) {
//        int result[] = new int[length];
//        for (int i = 0; i < length; i++) {
//            result[i] = -100 + (int) (Math.random() * 200);
//
//        }
//        return result;
//    }
//
//    private static int[] build_array() {
//        return buildArray(10);
//    }
//
//}
