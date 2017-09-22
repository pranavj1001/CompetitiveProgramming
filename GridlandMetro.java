// Question for this problem: https://www.hackerrank.com/challenges/gridland-metro/problem

package com.pranavjain.programming;

import java.util.*;

public class GridlandMetro {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long m = in.nextLong();
        long n = in.nextLong();
        int trains = in.nextInt();
        Map<Long, List<ArrayList<Long>>> matrix = new HashMap<>();

        for (int i = 0; i < trains; i++) {

            long row = in.nextLong();
            long from = in.nextLong();
            long to = in.nextLong();

            // row already has some existing paths
            if(matrix.containsKey(row)) {

                List<ArrayList<Long>> listTrains = matrix.get(row);

                // logic to add path
                for (ArrayList<Long> train: listTrains) {

                    long c1 = train.get(0);
                    long c2 = train.get(1);

                    // if there is overlapping, take union or increase the range
                    if(!( (to < c1) || (from > c2))) {
                        if (to > c2)
                            train.set(1, to);
                        if (from < c1)
                            train.set(0, from);

                    // the path does not overlap therefore add a new path
                    }else{
                        ArrayList<Long> tempTrain = new ArrayList<>();
                        tempTrain.add(from);
                        tempTrain.add(to);
                        listTrains.add(tempTrain);
                        break;
                    }

                }

            // new row, just add the path
            }else{

                ArrayList<Long> train = new ArrayList<>();
                train.add(from);
                train.add(to);

                List<ArrayList<Long>> listTrains = new ArrayList<>();
                listTrains.add(train);
                matrix.put(row, listTrains);

            }

        }

        // Calculate the result
        long sum = 0;
        for (long j: matrix.keySet()) {
            List<ArrayList<Long>> listTrains = matrix.get(j);
            for(ArrayList<Long> train: listTrains) {
                sum += train.get(1) - train.get(0) + 1;
            }
        }
        System.out.println(m * n - sum);
        in.close();
    }

}
