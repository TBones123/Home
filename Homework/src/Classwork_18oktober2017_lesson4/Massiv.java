//package Classwork_18oktober2017_lesson4;
//
//import java.util.Arrays;
//
//public class Massiv {
//    public static void main(String[] args) {
//
//        int[] arr = new int[8];
//        arr[0] = 5;
//        arr[1] = 90;
//        arr[2] = 100;
//        arr[3] = 100;
//        arr[4] = -105;
////        int startIndex = 0;
////        while (startIndex<arr.length){
////            System.out.println(arr[startIndex]);
////            startIndex++;
////        }
////        System.out.println(arr[0]);
//
////        Boolean someVar = true;
////        int startIndex = 0;
////        int limit = arr.length;
////        while (true) {
////            if (someVar == true || startIndex < arr.length) {
////                System.out.println(arr[startIndex]);
////                startIndex++;
////            }
////
////        }
////        for (int beginIndex = 0; beginIndex<arr.length; beginIndex++){
////            System.out.println(arr[beginIndex]);
////        }
////        System.out.println("+++++");
////        String[][] fd = new String[2][3];
////        fd[0][0] = "2pac";
////        fd[0][1] = "coolio";
////        fd[0][2] = "eminem";
////
////        fd[1][0] = "acdc";
////        fd[1][1] = "pink";
////        fd[1][2] = "DP";
////        for (int i = 1; i < fd.length; i++) {
////            for (int j = 0; j < fd[i].length; j++) {
////                System.out.println(fd[i][j]);
////            }
////        }
////
////        int[] zad1 = new int[4];
////        zad1[0] = 2;
////        zad1[1] = 5;
////        zad1[2] = 10;
////        zad1[3] = 18;
////        for (int i = 0; i < zad1.length; i++) {
////            System.out.print(zad1[i] + " ");
////        }
////        System.out.println();
////        for (int i = 0; i < zad1.length; i++) {
////            System.out.println(zad1[i]);
////        }
//        System.out.println("++++++++++++++++++");
//
////        int[] zad2 = new int[6];
////        zad2[0] = 3;
////        zad2[1] = 7;
////        zad2[2] = 11;
////        zad2[3] = 13;
////        zad2[4] = 15;
////        zad2[5] = 17;
////        for (int i = zad2.length-1;  i >= 0; i-- ) {
////            System.out.print(zad2[i]+" ");
////
////        }
//
////        int[] zad4 = new int[10];
////        int[] zad4 = build_array(15);
////        int counter = 0;
////        for (int i =0; i < zad4.length; i++) {
////            if ((zad4[i] % 2) == 0) {
////                zad4[i] = -1;
////                counter++;
////            }
////        }
////        System.out.println(Arrays.toString(zad4));
////        System.out.print("counter: ");
////        System.out.println(counter);
////
////        int[] zad3 = build_array(15);
////        int counter = 0;
////        for (int aZad3 : zad3) {
////            if ((aZad3 % 2) == 0) {
////                counter++;
////            }
////        }
////        System.out.println(Arrays.toString(zad3));
////        System.out.print("counter: ");
////        System.out.println(counter);
//        int mas1 [] = new int[5];
//        int mas2 [] = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            mas1[i] = (int) (Math.random()*6);
//            mas2[i] = (int) (Math.random()*6);
//        }
//        System.out.println(Arrays.toString(mas1));
//        System.out.println(Arrays.toString(mas2));
//
//        double ave1 = 0;
//        double ave2 = 0;
//        for (int i = 0; i < 5; i++) {
//            ave1 += mas1[i];
//            ave2 += mas2[i];
//        }
//        ave1/=5;
//        ave2/=5;
//
//        if(ave1 > ave1){
//            System.out.println("Среднее арифметическое первого массива ("+ave1+") больше среднего арифметического "+
//                    "второго массива ("+ave2+")");
//        } else if(ave1 < ave2){
//            System.out.println("Среднее арифметическое первого массива ("+ave1+") меньше среднего арифметического "+
//                    "второго массива ("+ave2+")");
//        } else {
//            System.out.println("Средние арифметические массивов равны ("+ave1+")");
//        }
//
//
//
//
//
//    }
//
//    private static int[] build_array()
//    {
//        return build_array(10);
//    }
//
//    private static int[] build_array(String string)
//    {
//        return build_array(Integer.parseInt(string));
//    }
//
//    private static int[] build_array(int length)
//    {
//        int[] result = new int[length];
//        for (int i = 0; i < length; i++)
//        {
//            result[i] = (int) Math.round((Math.random() * 10));
//        }
//        return result;
//    }
//}
