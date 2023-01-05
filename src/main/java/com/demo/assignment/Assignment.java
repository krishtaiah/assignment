package com.demo.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Assignment {
	public List<Integer> findLongestSequence(int inAr[]) {
		//Arrays.sort(inAr);

		List<Integer> longestSequ = new ArrayList<>();
		HashMap<Integer, Boolean> hm = new HashMap<>();

		for (int val : inAr) {
			hm.put(val, true);
		}
		for (int val : inAr) {
			if (hm.containsKey(val - 1)) {
				hm.put(val, false);
			}
		}
		
		int mh = 0;
		int mval = 0;
		for (int val : inAr) {
			if (hm.get(val) == true) {
				int lh = 1;
				int lval = val;
				while (hm.containsKey(lval + lh)) {
					lh++;
				}
				if (lh > mh) {
					mh = lh;
					mval = val;
				}
			}
		}
		for (int i = 0; i < mh; i++) {
			longestSequ.add(mval + i);
		}
		return longestSequ;
	}

	public static void main(String[] args) {
		Assignment as = new Assignment();
		int inAr[] = { 11, 39, 13, 10, 14, 20, 12, 15 };
		// int inAr[] = { 4, 3, 6, 9, 12, 5, 22 };
		// int inAr[] = { 2, 3, 4, 7, 8, 10, 11, 12, 13 };
		List<Integer> arrayOfNos = as.findLongestSequence(inAr);
		System.out.println("new array --" + arrayOfNos);
	}

}
