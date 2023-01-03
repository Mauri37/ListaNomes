package org.example;

import java.util.ArrayList;
import java.util.List;

public class Class {
        public List<int[]> getThem () {
            List<int[]> list1 = new ArrayList<int[]>();
            int[][] theList = new int[0][];
            for (int[] x : theList)
                if (x[0] == 4)
                    list1.add(x);
            return list1;
        }
}
