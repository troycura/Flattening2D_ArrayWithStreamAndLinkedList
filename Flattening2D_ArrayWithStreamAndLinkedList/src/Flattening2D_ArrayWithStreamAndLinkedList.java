import java.util.LinkedList;

import static java.util.Arrays.stream;

public class Flattening2D_ArrayWithStreamAndLinkedList {

    public static void main(String [] args){
        /*
        int[][] nestedArray = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        array must be sorted first before flattening... flattening means combining, must be sorted before combining e.a.
        */

        /* 1st LinkedList - Flatten */
        int[][] nestedArray = {{3, 4, 5, 6}, {1, 2}, {7, 8, 9}};

        LinkedList<Integer> theList = new LinkedList<>();
        for(int[] sList: nestedArray) {
            stream(sList)
                    .forEach(theList::add);
        }
        theList.stream()
                .forEach(e ->System.out.println(e));
    }


}
