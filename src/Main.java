import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] values = {12, 56, 5, 789, 45, 933, 78, 32, 1, 97, 23};
        ArrayList <Integer> myAl = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            myAl.add(values[i]);
        }
        System.out.println(myAl);

        System.out.println(reverse(myAl));
        System.out.println(mijTvabanakan(myAl));
        System.out.println(maxValue(myAl));
        System.out.println(maxMin(myAl));
//        System.out.println(sort(myAl));
        Collections.sort(myAl); // 3 jam tarber baner porceluc heto ... enqan vor))
        System.out.println(myAl);
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        for(int i = 0, j = list.size() - 1; i < j; i++) {
            list.add(i, list.remove(j));
        }
        return list;
    }
    public static int mijTvabanakan(ArrayList<Integer> list){
        int sum = 0;
        for(int element : list){
            sum += element;
        }
        return sum / list.size();
    }
    public static int maxValue(ArrayList<Integer> list){
        int max = list.get(0);
        for(int i = 0; i< list.size(); i++){
            if (list.get(i)> max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static int maxMin(ArrayList<Integer> list){
        int max = list.get(0);
        int min = list.get(0);
        for(int i = 0; i< list.size(); i++){
            if (list.get(i)> max){
                max = list.get(i);
            }
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        return (max + min) / 2;
    }
//    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
//        Object[] array = list.toArray();
//        int temp;
//        for(int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++){
//                 if (array[i] > array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            list.add(array[i]);
//        }
//        return list;
//    }

}
