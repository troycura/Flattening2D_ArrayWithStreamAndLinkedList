# Flattening2D_ArrayWithStreamAndLinkedList


This is how to Flatten two Dimensional Nested Array
e.g.   int[][] nestedArray = {{3, 4, 5, 6}, {1, 2}, {7, 8, 9}};
With the helped of API; I used stream and LinkedList to Flatten a Two Nested Dimensional Array

Array must be sorted first before flattening... flattening means combining.

here is the code.




    public static void main(String [] args){

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




