package Bin_Search;

import java.awt.Graphics;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;

public class BinarySearchTest  {
	
	public static boolean search(int[] list,int target){
		int low=0;
		int high=list.length-1;
		int mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(list[mid]==target) {
				return true;
			}
			else if(list[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
		}
	        return   false;
}

public static void main(String[] args)
{		Scanner sc = new Scanner(System.in);
			int[] list={1,3,5,6,7,9,11,17};
			
			System.out.print("Enter Target:");
			int target =sc.nextInt();
			boolean res=search(list,target);
			System.out.println("Target Found: "+res);
			}
}
