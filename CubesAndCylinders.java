// Question for this program is at https://www.hackerrank.com/contests/university-codesprint-4/challenges/cubes-and-cylinders/problem

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CubesAndCylinders {

    /*
     * Complete the function below.
     */
    static int maximumPackages(int[] S, int[] K, int[] R, int[] C) {
         // Return the maximum number of packages that can be put in the containers.
        // S -> edge length of each package
        // K -> number of copies of each type
        // R -> radius of each type of cylinder
        // C -> capacity of each cylinder
        int[] maxPackagesInACylinder = new int[R.length];
        int sum = 0;
        
        // Consider Largest Cylinder first
        Arrays.sort(R);
        
        // main logic ---------!
        for(int i = R.length-1; i >= 0; i-- ) {
            double threshold = Math.sqrt((R[i]*R[i])+(R[i]*R[i]));
            
            int[] array = findNextPackage(S, threshold);
            int packageEdgeLength = array[0];
            int packageType = array[1];
            
            // if package fits the cylinder
            if (packageEdgeLength != 0) {
                
                // if cylinder has greater capacity than the number of a type of package
                if(K[packageType] <= C[i]) {
                    // number to be filled in maxPackagesInACylinder
                    int number = K[packageType];
                    int capToFill = C[i] - number;
                    // this packageType is now done
                    S[packageType] = -1;
                    
                    // if cylinder still has capacity
                    if(capToFill != 0) {
                        // try to fill it as much as it can take
                        while(capToFill != 0) {
                            int[] array1 = findNextPackage(S, threshold);
                            packageEdgeLength = array1[0];
                            packageType = array1[1];
                            
                            // if no other packageType can fit the cylinder
                            if(packageEdgeLength == 0) {
                                capToFill = 0;
                                maxPackagesInACylinder[i] = number;
                            } else {
                                if(number + K[packageType] > C[i]) {
                                    maxPackagesInACylinder[i] = C[i];
                                    K[packageType] = K[packageType] - C[i] + number; 
                                    capToFill = 0;
                                } else {
                                    number += K[packageType];
                                    S[packageType] = -1;
                                    capToFill = C[i] - number;
                                    if(capToFill == 0) {
                                        maxPackagesInACylinder[i] = C[i];
                                    }
                                }
                            }      
                        }
                    } else {
                        maxPackagesInACylinder[i] = number;
                    }
                  
                // if cylinder has fewer capacity than the number of a type of package
                } else {
                    maxPackagesInACylinder[i] = C[i];
                    K[packageType] = K[packageType] - C[i];
                }  
            } else {
                maxPackagesInACylinder[i] = 0;
            }  
        }
        // main logic ends-----!
        
        for(int x : maxPackagesInACylinder) {
            sum += x;
        }
        
        return sum;
    }
    
    static int[] findNextPackage(int[]  S, double threshold) {
        int packageEdgeLength = 0;
        int packageType = -1;
        for(int j = 0; j < S.length; j++) {
            //          max             |  fits the cylinder | packageType is not finished
            if(packageEdgeLength < S[j] && S[j] < threshold && S[j] > 0) {
                packageEdgeLength = S[j];
                packageType = j;
            }
        }
        int[] array = new int[2];
        array[0] = packageEdgeLength;
        array[1] = packageType;
        return array;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        if (bw == null) {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());
        int m = Integer.parseInt(nm[1].trim());

        String[] SItems = scan.nextLine().split(" ");   
        int[] S = new int[SItems.length];

        for (int SItr = 0; SItr < SItems.length; SItr++) {
            int SItem = Integer.parseInt(SItems[SItr].trim());
            S[SItr] = SItem;

        }
        
        String[] KItems = scan.nextLine().split(" ");
        int[] K = new int[KItems.length];

        for (int KItr = 0; KItr < KItems.length; KItr++) {
            int KItem = Integer.parseInt(KItems[KItr].trim());
            K[KItr] = KItem;

        }

        String[] RItems = scan.nextLine().split(" ");
        int[] R = new int[RItems.length];

        for (int RItr = 0; RItr < RItems.length; RItr++) {
            int RItem = Integer.parseInt(RItems[RItr].trim());
            R[RItr] = RItem;

        }

        String[] CItems = scan.nextLine().split(" ");
        int[] C = new int[CItems.length];

        for (int CItr = 0; CItr < CItems.length; CItr++) {
            int CItem = Integer.parseInt(CItems[CItr].trim());
            C[CItr] = CItem;

        }

        int result = maximumPackages(S, K, R, C);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
