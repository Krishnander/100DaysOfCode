package com;

public class HeapOps {
	
	int lastpos;
	int[] heap;
	
	public void add(int a) {
		heap[++lastpos]=a;
		trickleUp(lastpos);
	}
	
	public void swap(int from,int to) {
		int temp=heap[from];
		heap[from]=heap[to];
		heap[to]=temp;
	}

	private void trickleUp(int lastpos) {
		if (lastpos==0) {
			return;
		}
		int parent=(lastpos-1)/2;
		if (heap[lastpos]>heap[parent]) {
			swap(heap[lastpos], heap[parent]);
			trickleUp(parent);
		}
		
	}
	
	public int remove() {
		int temp=heap[0];
		swap(heap[0], lastpos--);
		trickleDown(heap[0]);
		return temp;
	}

	private void trickleDown(int parent) {
		int left=(2*parent)+1;
		int right=(2*parent)+2;
		
		if (left==lastpos && (left>parent)) {
			swap(parent, left);
			return;
		}
		
		if (right==lastpos && (right>parent)) {
			swap(parent, right);
			return;
		}
		
		if (left>=lastpos || right>=lastpos) {
			return;
		}
		
		if (heap[left]>heap[right] && heap[left]>heap[parent]) {
			swap(left, right);
			trickleDown(left);
		}
		
		if ( heap[right]>heap[parent]) {
			swap(parent, right);
			trickleUp(left);
		}
		
	}


}
