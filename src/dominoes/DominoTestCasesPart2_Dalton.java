package dominoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DominoTestCasesPart2_Dalton 
{
	private static void DominoHighLowImpl_Dalton_QuotientRemainder()

	{
		System.out.println("\nNow testing DominoHighLowImpl_Dalton_QuotientRemainder()");
		Domino domino1 = new DominoHighLowImpl_Dalton(2,2,1,2);
		System.out.println("Domino domino1 = new DominoHighLowImpl_Dalton(2,2,1,2)");
		int expectedRV = 5;
		int actualRV = domino1.getHighPipCount();
		String failureMessage= "domino1.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV == expectedRV: failureMessage;
		System.out.println("domino1.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 2;
		actualRV = domino1.getLowPipCount();
		failureMessage= "domino1.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV == expectedRV: failureMessage;
		System.out.println("domino1.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino2 = new DominoHighLowImpl_Dalton(2,1,0,1);
		System.out.println("Domino domino2 = new DominoHighLowImpl_Dalton(2,1,0,1)");
		expectedRV = 4;
		actualRV = domino2.getHighPipCount();
		failureMessage= "domino2.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV == expectedRV: failureMessage;
		System.out.println("domino2.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 1;
		actualRV = domino2.getLowPipCount();
		failureMessage= "domino2.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV == expectedRV: failureMessage;
		System.out.println("domino2.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino3 = new DominoHighLowImpl_Dalton(1,0,1,0);
		System.out.println("Domino domino3 = new DominoHighLowImpl_Dalton(1,0,1,0)");
		expectedRV = 3;
		actualRV = domino3.getHighPipCount();
		failureMessage= "domino3.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV == expectedRV: failureMessage;
		System.out.println("domino3.getHighPipCount() = "+ actualRV+", as expected" );
		expectedRV = 3;
		actualRV = domino3.getLowPipCount();
		failureMessage= "domino3.getLowPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		assert actualRV == expectedRV: failureMessage;
		System.out.println("domino3.getLowPipCount() = "+ actualRV+", as expected" );
		Domino domino4 = new DominoHighLowImpl_Dalton(3,0,3,2);
		actualRV = domino4.getHighPipCount();
		System.out.println(actualRV);
		actualRV = domino4.getLowPipCount();
		System.out.println(actualRV);
		failureMessage= "domino3.getHighPipCount()"+ " to be "
				+ expectedRV+", instead it was "+ actualRV;
		
		System.out.println("-------------------------------------------------------------------\n");
	}

	private static void DominoHighLowImpl_Dalton_HighLow_Assertions()

	{
		System.out.println("Now testing DominoHighLowImpl_Dalton"
				+ "(int highPipCount, int lowPipCount)");
		//Domino domino1 = new DominoHighLowImpl_Dalton(7,2);
		//Domino domino2 = new DominoHighLowImpl_Dalton(6,-2);
		//Domino domino3 = new DominoHighLowImpl_Dalton(-2,-2);
		//Domino domino4 = new DominoHighLowImpl_Dalton(3,5);
	}

	private static void DominoHighLowImpl_Dalton_HighLowString_Assertions()
	{
		//Domino domino1 =  new DominoHighLowImpl_Dalton("5:-2");
	}
	private static void DominoHighLowImpl_Dalton_SumDifference()
	{
//		int[] list1= {17,1};
//		Domino domino1 = new DominoHighLowImpl_Dalton(list1);
	}
	private static void DominoHighLowImpl_Dalton_HighLowSet()
	{
		Set<Integer> aSet1 = new HashSet<Integer>();
		aSet1.add(8);  aSet1.add(8); 
		Domino domino1 = new  DominoHighLowImpl_Dalton(aSet1);
	}
	
	private static void DominoHighLowSetImpl_Dalton_HighLow()
	{
		
		Domino domino1 = new  DominoHighLowSetImpl_Dalton(5,8);
	}
	private static void DominoHighLowSetImpl_Dalton_SumDifferenceString()
	{
		Domino domino1 = new  DominoHighLowSetImpl_Dalton("6,-2");
		
	}
	private static void DominoHighLowSetImpl_Dalton_LowPlus8TimesHigh()
	{
		//Domino domino1 = new  DominoHighLowSetImpl_Dalton(39);
	}
	private static void DominoLowDifferenceStringImpl_Dalton_lowPlus8TimesHigh()
	{
		
	}
	private static void DominoLowDifferenceStringImpl_Dalton_highSum()
	{
		ArrayList<Integer> aList1 = new ArrayList<Integer>();
		aList1.add(7);  
		Domino domino1 = new  DominoLowDifferenceStringImpl_Dalton(aList1);
	}
	public static void main(String[]args)
	{
		//assert false;
		DominoHighLowImpl_Dalton_QuotientRemainder();
		//DominoHighLowImpl_Dalton_HighLow_Assertions();
//		DominoHighLowImpl_Dalton_HighLowString_Assertions();
//		DominoHighLowImpl_Dalton_SumDifference();
//		DominoHighLowImpl_Dalton_HighLowSet();
//		DominoHighLowSetImpl_Dalton_HighLow();
//		//DominoHighLowSetImpl_Dalton_SumDifferenceString();
//		DominoHighLowSetImpl_Dalton_LowPlus8TimesHigh();
//		//DominoLowDifferenceStringImpl_Dalton_highSum();
	}
}
