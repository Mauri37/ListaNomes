package org.example;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private static final int STATUS_VALUE = 0;
    private static final int FLAGGED = 0;

    public List<int[]> getflaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        int[][] gameBoard = new int[0][];
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
