package dominoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DominoTestCases_Dalton 
{
	//public DominoHighLowImpl_Dalton(int highPipCount, int lowPipCount)
	private static void DominoHighLowImpl_Dalton1()
	{
		System.out.println("    Now testing DominoHighLowImpl_Dalton"
				+ "(int highPipCount, int lowPipCount)    ");
		Domino domino1 = new DominoHighLowImpl_Dalton(5,2);
		int expectedRV =  5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV= 2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino2 = new DominoHighLowImpl_Dalton(3,3);
		expectedRV= 3;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- completed DominoHighLowImpl_Dalton"+ 
				"(int highPipCount, int lowPipCount)\n");
	}
	//public static boolean isHighLowString(String str)
	private static void isHighLowStringBoolean()
	{
		System.out.println("\n    Now testing DominoHighLowImpl_Dalton."
				+ "isHighLowString(String str)    ");
		String str1 = "6:4";
		boolean expectedRV= true;
		boolean actualRV= DominoHighLowImpl_Dalton.isHighLowString(str1);
		String failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str1+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str1+") = "+ actualRV+", as expected" );
		String str2 = "3:3";
		expectedRV= true;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str2);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str2+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str2+") = "+ actualRV+", as expected" );
		String str3 = "3:6";
		expectedRV= false;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str3);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str3+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str3+") = "+ actualRV+", as expected" );
		String str4 = "a:b";
		expectedRV= false;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str4);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str4+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str4+") = "+ actualRV+", as expected" );
		String str5 = "77:6";
		expectedRV= false;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str5);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str5+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str5+") = "+ actualRV+", as expected" );
		String str6 = "abc";
		expectedRV= false;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str6);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str6+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str6+") = "+ actualRV+", as expected" );
		String str7 = "0:0";
		expectedRV= true;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str7);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str7+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str7+") = "+ actualRV+", as expected" );
		String str8 = "7:5";
		expectedRV= false;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str8);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str8+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str8+") = "+ actualRV+", as expected" );
		String str9 = "8:2";
		expectedRV= false;
		actualRV= DominoHighLowImpl_Dalton.isHighLowString(str9);
		failureMessage= "DominoHighLowImpl_Dalton.isHighLowString("+ str9+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowImpl_Dalton.isHighLowString("+ str9+") = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- DominoHighLowImpl_Dalton." + 
				"isHighLowString(String str) \n");
	}
	private static void DominoHighLowImpl_Dalton2()
	{
		System.out.println("\n    Now testing DominoHighLowImpl_Dalton"
				+ "(String highLowString)    ");
		String str1= "5:2";
		Domino domino1 = new DominoHighLowImpl_Dalton(str1);
		int expectedRV =  5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		String str2= "3:3";
		Domino domino2 = new DominoHighLowImpl_Dalton(str2);
		expectedRV =  3;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  3;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- DominoHighLowImpl_Dalton" + 
				" (String highLowString)    ");
	}
	private static void DominoHighLowImpl_Dalton3()
	{
		System.out.println("\n    Now testing DominoHighLowImpl_Dalton"
				+ "(int[] sumDifference)    ");
		int[] intArray= {7,3};
		Domino domino1 = new DominoHighLowImpl_Dalton(intArray);
		int expectedRV =  5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		int[] intArray2 = {6,0};
		Domino domino2 = new DominoHighLowImpl_Dalton(intArray2);
		expectedRV =  3;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  3;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		int[] intArray3= {2, 2};
		Domino domino3 = new DominoHighLowImpl_Dalton(intArray3);
		expectedRV =  2;
		actualRV = domino3.getHighPipCount();
		failureMessage= "domino3.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  0;
		actualRV = domino3.getLowPipCount();
		failureMessage= "domino3.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getLowPipCount() = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- DominoHighLowImpl_Dalton" + 
				" (int[] sumDifference)   ");
	}
	private static void DominoHighLowImpl_Dalton4()
	{
		System.out.println("\n    Now testing DominoHighLowImpl_Dalton"
				+ "(Set<Integer> highLowSet    ");
		Set<Integer> aSet1 = new HashSet<Integer>();
		aSet1.add(2);  aSet1.add(3); 
		Domino domino1 = new DominoHighLowImpl_Dalton(aSet1);
		int expectedRV =  3;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		Set<Integer> aSet2 = new HashSet<Integer>();
		aSet2.add(4);  
		Domino domino2 = new DominoHighLowImpl_Dalton(aSet2);
		expectedRV =  4;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  4;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- DominoHighLowImpl_Dalton"  
								+ "(Set<Integer> highLowSet /n   ");
	}
	private static void isSumDifferenceString()
	{
		System.out.println("\n    Now testing isSumDifferenceString()");
		String str1 = "5,4";
		boolean expectedRV= false;
		boolean actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str1);
		String failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str1+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str1+") = "+ actualRV+", as expected" );
		String str2 = "7,3";
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str2);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str2+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str2+") = "+ actualRV+", as expected" );
		String str3 = "a,c";
		expectedRV= false;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str3);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str3+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str3+") = "+ actualRV+", as expected" );
		String str4 = "7,33";
		expectedRV= false;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str4);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str4+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str4+") = "+ actualRV+", as expected" );
		String str5 = "7%3";
		expectedRV= false;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str5);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str5+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str5+") = "+ actualRV+", as expected" );
		String str6 = "6,0";
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str6);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str6+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str6+") = "+ actualRV+", as expected" );
		String str7 = "3,2";
		expectedRV= false;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str7);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str7+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str7+") = "+ actualRV+", as expected" );
		String str8 = "2,2";
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isSumDifferenceString(str8);
		failureMessage= "DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str8+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isSumDifferenceString("+ str8+") = "+ actualRV+", as expected" );
		System.out.println("SUCCESS-- isSumDifferenceString() \n");
		
	}
	private static void DominoHighLowSetImpl_Dalton()
	{
		System.out.println("    Now testing DominoHighLowSetImpl_Dalton"
				+ "(String sumDifferenceString)");
		Domino domino1= new DominoHighLowSetImpl_Dalton("7,3");
		int expectedRV =  5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino2 = new DominoHighLowSetImpl_Dalton("6,0");
		expectedRV =  3;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  3;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino3 = new DominoHighLowSetImpl_Dalton("2,2");
		expectedRV =  2;
		actualRV = domino3.getHighPipCount();
		failureMessage= "domino3.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  0;
		actualRV = domino3.getLowPipCount();
		failureMessage= "domino3.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino4 = new DominoHighLowSetImpl_Dalton("0,0");
		expectedRV =  0;
		actualRV = domino4.getHighPipCount();
		failureMessage= "domino4.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino4.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  0;
		actualRV = domino4.getLowPipCount();
		failureMessage= "domino4.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino4.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino5 = new DominoHighLowSetImpl_Dalton("10,0");
		expectedRV =  5;
		actualRV = domino5.getHighPipCount();
		failureMessage= "domino5.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino5.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV =  5;
		actualRV = domino5.getLowPipCount();
		failureMessage= "domino5.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino5.getLowPipCount() = "+ actualRV+", as expected" );
		System.out.println("SUCCESS--DominoHighLowSetImpl_Dalton"  
						+ "(String sumDifferenceString)");
	}
	private static void isLowPlus8TimesHighInteger()
	{
		System.out.println("    Now testing isLowPlus8TimesHighInteger()");
		int k = 43;
		boolean expectedRV= true;
		boolean actualRV= DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(k);
		String failureMessage= "DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") = "+ actualRV+", as expected" );
		k = 16;
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(k);
		failureMessage= "DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") = "+ actualRV+", as expected" );
		k = 36;
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(k);
		failureMessage= "DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") = "+ actualRV+", as expected" );
		k = 51;
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(k);
		failureMessage= "DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") = "+ actualRV+", as expected" );
		k = 23;
		expectedRV= false;
		actualRV= DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(k);
		failureMessage= "DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") = "+ actualRV+", as expected" );
		k = 0;
		expectedRV= true;
		actualRV= DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(k);
		failureMessage= "DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger("+ k+") = "+ actualRV+", as expected" );
		System.out.println("SUCCESS--isLowPlus8TimesHighInteger()");
	}
	private static void DominoLowDifferenceStringImpl_Dalton1()
	{
		System.out.println("    Now testing DominoLowDifferenceStringImpl_Dalton(int lowPlus8TimesHigh)");
		int k = 43;
		Domino domino1 = new DominoLowDifferenceStringImpl_Dalton(k);
		int expectedRV = 5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 3;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		k = 16; 
		Domino domino2 = new DominoLowDifferenceStringImpl_Dalton(k);
		expectedRV = 2;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 0;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		k = 0;
		Domino domino3 = new DominoLowDifferenceStringImpl_Dalton(k);
		expectedRV = 0;
		actualRV = domino3.getHighPipCount();
		failureMessage= "domino3.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 0;
		actualRV = domino3.getLowPipCount();
		failureMessage= "domino3.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getLowPipCount() = "+ actualRV+", as expected" );
		System.out.println("SUCCESS--DominoLowDifferenceStringImpl_Dalton(int lowPlus8TimesHigh)");
	}
	private static void DominoLowDifferenceStringImpl_Dalton2()
	{
		System.out.println("    Now testing DominoLowDifferenceStringImpl_Dalton(List<Integer> highSum)");
		ArrayList <Integer> highSum= new ArrayList<Integer>(); highSum.add(5); highSum.add(7);
		
		Domino domino1 = new DominoLowDifferenceStringImpl_Dalton(highSum);
		int expectedRV = 5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		ArrayList <Integer> highSum1= new ArrayList<Integer>(); highSum1.add(3); highSum1.add(5);
		Domino domino2 =  new DominoLowDifferenceStringImpl_Dalton(highSum1);
		expectedRV = 3;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 2;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		ArrayList <Integer> highSum2= new ArrayList<Integer>(); highSum2.add(4); highSum2.add(4);
		Domino domino3 =  new DominoLowDifferenceStringImpl_Dalton(highSum2);
		expectedRV = 4;
		actualRV = domino3.getHighPipCount();
		failureMessage= "domino3.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 0;
		actualRV = domino3.getLowPipCount();
		failureMessage= "domino3.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino3.getLowPipCount() = "+ actualRV+", as expected" );
		ArrayList <Integer> highSum3= new ArrayList<Integer>(); highSum3.add(3); highSum3.add(6);
		Domino domino4 =  new DominoLowDifferenceStringImpl_Dalton(highSum3);
		expectedRV = 3;
		actualRV = domino4.getHighPipCount();
		failureMessage= "domino4.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino4.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 3;
		actualRV = domino4.getLowPipCount();
		failureMessage= "domino4.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino4.getLowPipCount() = "+ actualRV+", as expected" );
	}
	private static void DominoHighLowSetImpl_Dalton_lowPlus8TimesHigh()
	{
		System.out.println("    Now testing DominoHighLowSetImpl_Dalton(int LowPlus8TimesHighInteger)");
		
		Domino domino1= new DominoHighLowSetImpl_Dalton(43);
		int expectedRV = 5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 3;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV== expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		
		
		System.out.println("SUCCESS--DominoHighLowSetImpl_Dalton"  
				+ "(int lowPlus8TimesHigh)/n");
	}
	public static void main(String[]args)
	{
		//assert false;
		DominoHighLowImpl_Dalton1();
		isHighLowStringBoolean();
		DominoHighLowImpl_Dalton2();
		DominoHighLowImpl_Dalton3();
		DominoHighLowImpl_Dalton4();
		isSumDifferenceString();
		DominoHighLowSetImpl_Dalton();
		isLowPlus8TimesHighInteger();
		DominoLowDifferenceStringImpl_Dalton1();
		DominoLowDifferenceStringImpl_Dalton2();
		DominoHighLowSetImpl_Dalton_lowPlus8TimesHigh();
		System.out.println("******************** SUCCESS-- COMPLETED ALL TESTS ********************");
	}
}
