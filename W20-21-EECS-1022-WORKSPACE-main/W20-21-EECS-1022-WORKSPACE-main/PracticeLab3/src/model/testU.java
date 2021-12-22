//package model;
//
//public class testU {
//	public static int[] getInterLeaving(int[] a1, int[] a2) {
//		int[] result = null;
//		int[] finalArray = new int[a1.length + a2.length];
//		
//		if (a1.length == a2.length) {
//			for(int i = 0; i < a1.length; i++) {
//				
//				boolean test1 = true;
//				boolean test2 = true;
//				
//				while(test1) {
//					finalArray[2 * i] = a1[i];
//					test1 = false;
//					test2 = true;
//				}
//				
//				while(test2) {
//					finalArray[(2 * i) + 1] = a2[i];
//					test2 = false;
//					test1 = true;
//				}
//			}
//		}
//		else if (a1.length > a2.length) {
//			for(int i = 0; (((2 * i) + 1) < finalArray.length); i++) {
//				
//				boolean test1 = true;
//				boolean test2 = true;
//				
//				while(test1) {
//					finalArray[2 * i] = a1[i];
//					test1 = false;
//					if  (i < a2.length) {
//						test2 = true;
//					}
//					else {
//						test2 = false;
//						finalArray[(2 * i) + 1] = a1[i + 1];
//					}
//				}
//				while(test2) {
//					finalArray[(2 * i) + 1] = a2[i];
//					test2 = false;
//					test1 = true;
//				}
//			}
//		}
//		
////		if ((2 * i ) < (finalArray.length - 1)) {
////		test1 = true;
////	}
////	else {
////		test1 = false;
//////		if ((2 * i) < (finalArray.length - 1)) {
//////			test2 = true;
//////		}
//////		else {
//////			test2 = false;
//////		}
////	}
//		
//		else if (a1.length < a2.length) {
//			for(int i = 0; i < a2.length; i++) {
//				
//				boolean test1 = true;
//				boolean test2 = true;
//				
//				while(test1) {
//					finalArray[(2 * i) + 1] = a2[i];
//					test2 = false;
//					test1 = true;
//				}
//				while(test2) {
//					finalArray[2 * i] = a1[i];
//					test1 = false;
//					if (((2 * i) + 1) < finalArray.length) {
//						test2 = true;
//					}
//					else {
//						test2 = false;
//					}
//				}
//			}
//		}
//		
//		result = finalArray;
//		return result;
//}
