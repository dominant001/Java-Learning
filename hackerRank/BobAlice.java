package com.company.hackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BobAlice {

    // Complete the compareTriplets function below.
    static List compareTriplets(List<Integer> a, List<Integer> b) {
        int Alice =0;
        int Bob =0;
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0,j=0;i<=a.size() && j<b.size();i++,j++){
            if(a.get(i) > b.get(j)){
                Alice+=1;
            }
            else if (a.get(i) < b.get(j)){
                Bob+=1;
            }
        }


        arr.add(0,Alice);
        arr.add(1,Bob);
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
