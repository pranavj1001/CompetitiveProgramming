//The Question for this solution can be found at https://www.hackerrank.com/challenges/kruskalmstrsub

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class KruskalMST {
	static int[] sets;
	static int findSet(int i)
	{
		if (sets[i] == i) {
			return i;
		}
		return findSet(sets[i]);
	}
	static boolean sameSet(int a , int b)
	{
		return findSet(a) == findSet(b);
	}
	static void mergeSet(int a, int b)
	{
		int i = findSet(a);
		int j = findSet(b);
		sets[i] = j;
	}
	
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] graph = new int[M][3];
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < 3; j++) {
				graph[i][j] = sc.nextInt();
			}
		}
		Arrays.sort(graph, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[2] - o2[2];
			}
		});
		 sets = new int[N+1];
		for (int i = 0; i < sets.length; i++) {
			sets[i] = i;
		}
		
		int sum = 0;
		for (int[] t : graph) {
			if (!sameSet(t[0], t[1])) {
				sum += t[2];
				mergeSet(t[0], t[1]);
			}
		}
		System.out.println(sum);
		sc.close();
	}
}