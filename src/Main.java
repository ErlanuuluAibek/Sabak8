import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
//        System.out.println(arif(scan.nextDouble(),scan.nextDouble(),scan.nextDouble()));
//        int[] arr=new int[]{12,213,12,34 ,21,32,31,21,44,42,12};
//        System.out.println(array(arr));
//      String[]arr={"Aibek","Kumar","Meder","Timur"};
//        System.out.println(method(arr,""));
//        int[]arr=new int[50];
//        int[]arr2=new int[50];
//
//        for (int i = 0; i < arr.length; i++) {
//        arr[i]=i;
//        }
//        array(arr,arr2);
//        for (int i = 0; i < arr.length; i++) {
//            if(arr2[i]!=0) System.out.println(arr2[i]);
//
//        }
//       if(soz(scan.nextInt())==true){
//           System.out.println("jup san");
//       }else{
//           System.out.println("tak san");
//       }
//         int result=san1(2);
//        if(result==Math.pow(2,2)){
//            System.out.println("ekoo biri birine barabar");
//        }else{
//            System.out.println(result);
//        }
        String[] name=new String[]{"Aibek","Kumar","Timur"};
        for(String a:name){
            String text = " Я люблю тебя";
            System.out.println(text+" "+a);
            System.out.println();
        }

//        System.out.println(method(5,5,5));
//         substring();
//        contains();
//        toUpperCase(); //chon kylat
//        toLowerCase(); //kichine kylat
//        System.out.println("Напишите слово");
//        String soz= scan.nextLine();
//        System.out.println(slovo(soz));
//    }
//    static String slovo(String soz){
//        System.out.println(soz.toUpperCase());
//        System.out.println(soz.trim());
//        if(soz.contains("A")==true){
//        System.out.println(soz.substring(soz.length()));
//        }else{
//            return "jok";
//        }
//        return soz;

    }

    static int method(int ...arr){
        int summ=0;
        for (int i = 0; i < arr.length; i++) {
         summ+=arr[i];
        }
        return summ;
    }

    static int san1(int san){
        return san+san;
    }
    //indeksin aluu
    static int getIndex(int array[],int san){
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=san){
                return i;
            }
        }
        return array.length;
    }
    static boolean soz(int san){
        if(Math.pow(san,2)%2==0){
           return true;
        }else{
          return false;
        }
    }
//    static void array(int[] arr,int[] arr2){
//        for (int i = 0; i <arr.length ; i++) {
//            if(arr[i]%2==0){
//                arr2[i]=arr[i];
//            }
//        }
//    }





































































































  static String method(String []array,String name){
      for (int i = 0; i < array.length ; i++) {
          if(array[i]==name){
              return array[i];
          }
      }
      return "Нет такого имени";
  }
  static int summa(){
        int summ=0;
      for (int i = 1; i <=300 ; i++) {
          if(i%3==0&&i%4==0&&i%5==0){
              summ+=i;
          }
      }
      return summ;
  }
//    static String  array(int[]san){
//        int min=san[0];
//      for (int i = 0; i < san.length; i++) {
//          min=Math.min(min,san[i]);
//      }
//      return "en kichine san "+min;
//  }
  static int sandar (int san){
        int summ=0;
      for (int i = 0; i < san; i++) {
          summ+=i;
      }
      return summ;

    }
  static double arif(double san, double san2,double san3){
       return (san+san2+san3)/3;
  }
    static void min(int[]array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("It's max " + min);
    }
       static void max(int[]array) {
           int max = array[0];
           for (int i = 0; i < array.length; i++) {
               if (max < array[i]) {
                   max = array[i];
               }
           }
           System.out.println("It's max " + max);
       }

       static void san ( int san1, int san2){
           for (int i = san1; i < san2; i++) {
               if (i > san1) {
                   System.out.println(i);

               }
           }

       }
       static void sandar ( int san1, int san2){
           if (san1 > san2) {
               System.out.println(san2);
           } else {
               System.out.println(san1);
           }


       }
       static void san ( int san1){
           System.out.println("Ваш возраст " + (2022 - san1));
       }
       static void sandar ( int san, int san1, int san2){
           if (san1 < san2 && san2 > san && san < san1) {
               System.out.println(san + "," + san1 + "," + san2);
           } else if (san > san1 && san < san2) {
               System.out.println(san1 + "," + san + "," + san2);
           }
           if (san > san2 && san1 < san2) {
               System.out.println(san1 + "," + san2 + "," + san);
           } else if (san1 > san2 && san1 < san) {
               System.out.println(san2 + "," + san1 + "," + san);
           }
           if (san1 > san && san > san2) {
               System.out.println(san2 + "," + san + "," + san1);
           } else if (san < san2 && san1 > san2) {
               System.out.println(san + "," + san2 + "," + san1);
           }

       }
       static void arif ( int san1, int san2){
           System.out.println((san1 + san2) / 2d);
       }

   }
