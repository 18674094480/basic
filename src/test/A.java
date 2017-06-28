package test;

import java.util.*;

public class A {
	public static void main(String[] args){
//    	Scanner sc = new Scanner(System.in);
//    	HashSet<Integer> hs1 = new HashSet<Integer>();
//    	HashSet<Integer> hs2 = new HashSet<Integer>();
//        Random rand = new Random();
//        
//        System.out.println("********************体彩神算**********************\n");
//        System.out.println("                   (1) 22选5                     ");
//        System.out.println("                   (2) 36选7                     \n");
//        System.out.println("************************************************\n");
//        
//        System.out.print("请选择:");
//        int who = sc.nextInt();
//        if(who == 1){
//        	System.out.print("22选5: ");
//        	do{
//	        	int num = rand.nextInt(21)+1;
//	        	hs1.add(num);
//	        }while(hs1.size()<5);
//	        Iterator<Integer> iter = hs1.iterator();
//	        while(iter.hasNext())
//	        	System.out.print(iter.next()+" ");
//        }
//        
//        if(who==2){
//        	System.out.print("36选7: ");
//        	do{
//	        	int sum = rand.nextInt(35)+1;
//	        	hs2.add(sum);
//	        }while(hs2.size()<7);
//        	Iterator<Integer> iter = hs2.iterator();
//	        while(iter.hasNext())
//	        	System.out.print(iter.next()+" ");
//        	
//        }
		Set<Integer> set = new HashSet<Integer>(); 
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{6,1,7,5,9};
 		for(int k =0 ; k<arr.length ; k++){
			set.add(arr[k]);
		}
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		int a = 3;
		a = a<<2;
    }
}
