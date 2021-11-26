package com;

import java.util.Arrays;

public class TransposedMatrix {

	public static void main(String[] args) {
		var obj = new TransposedMatrix();
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		if(obj.tranpose(array)) {
			System.out.println(Arrays.deepToString(array));
		}
	}
	
	public boolean tranpose(int[][] a) {
		if(a.length==0 || a.length!=a[0].length) return false;
		int n = a.length;
		for(int layer = 0; layer<n/2;layer++) {
			int first = layer;
			int last = n-1-layer;
			for(int i=first;i<last;i++) {
				int offset = i-first;
				int top = a[first][i];
				a[first][i] = a[last-offset][first];
				a[last-offset][first] = a[last][last-offset];
				a[last][last-offset] = a[i][last];
				a[i][last] = top;
			}
		}
		return true;
	}

}
