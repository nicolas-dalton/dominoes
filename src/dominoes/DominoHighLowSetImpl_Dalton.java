package dominoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DominoHighLowSetImpl_Dalton implements Domino
{
	private Set<Integer> highLowSet;
	public static void checkHighLow(int highPipCount, int lowPipCount)
	{
		assert MINIMUM_PIP_COUNT <= highPipCount : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ highPipCount +" = highPipCount";
		assert highPipCount<= MAX_PIP_COUNT :  highPipCount+ " = highPipCount > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
		assert MINIMUM_PIP_COUNT <= lowPipCount : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ lowPipCount +" = lowPipCount";
		assert lowPipCount<= MAX_PIP_COUNT :  lowPipCount+ "= lowPipCount > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
		assert lowPipCount<= highPipCount : lowPipCount+ " = lowPipCount > "+ highPipCount + " = highPipCount";
	}
	public DominoHighLowSetImpl_Dalton(int highPipCount, int lowPipCount)
	{
		Set <Integer> highLowSet= new HashSet<Integer>();
		DominoHighLowSetImpl_Dalton.checkHighLow(highPipCount,lowPipCount);
		highLowSet.add(highPipCount); highLowSet.add(lowPipCount);
		this.highLowSet=highLowSet;
	}
	public static final char SUM_DIFFERENCE_DELIMITER= ',';
	public static final int[] MIN_TO_MAX = new int[MAX_PIP_COUNT-MINIMUM_PIP_COUNT+1];
	static 
	{
		int k=MINIMUM_PIP_COUNT;
		while(k!= MAX_PIP_COUNT+1)
		{
			for(int i=0; i<MIN_TO_MAX.length; i++)
			{
				MIN_TO_MAX[i] = k;
				k++;
			}
		}
	}

	//preconditon: "Nothing"
	//post condition: rv= true, if and only if highLowString.charAt(1) = ,
	// && highLowString.charAt(0) && highLowString.charAt(2) are integers && highLowString = 3
	//otherwise rv = false
	public static boolean isSumDifferenceString(String str)
	{
		boolean isSumDifferenceString=false;

		if(Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(2)))
		{
			String str0ToString=String.valueOf(str.charAt(0));
			String str2ToString=String.valueOf(str.charAt(2));
			int sum=Integer.valueOf(str0ToString);
			int difference=Integer.valueOf(str2ToString);
			double sumDividedBy2= (double) sum/2;
			double differenceDivideBy2 = (double) difference/2;
			double highPipCount= sumDividedBy2 + differenceDivideBy2;
			double lowPipCount = sumDividedBy2 - differenceDivideBy2;
			for(int i=1; i<MIN_TO_MAX.length;i++)
			{
				if(highPipCount== i || lowPipCount == i)
				{
					isSumDifferenceString= true;
				}
			}
		}
		if(str.length()!=3 || str.charAt(1)!=(SUM_DIFFERENCE_DELIMITER))
		{
			isSumDifferenceString =  false;
		}
		return isSumDifferenceString;
	}
	// equal an int && sumDifferenceString.charAt(2) must equal an int
	//postcondition: the instance highLowSet equal to {lowPipCount, highPipCount}
	public DominoHighLowSetImpl_Dalton(String sumDifferenceString)
	{
		assert sumDifferenceString.length()== 3 || sumDifferenceString.length() == 4 : "sumDifferenceString.length() = " + sumDifferenceString.length();
		int sum  =0;
		int difference = 0;
		if(sumDifferenceString.length()==3)
		{
			assert Character.isDigit(sumDifferenceString.charAt(0)) : "the sum must be a digit. sum = " +sumDifferenceString.charAt(0);
			assert Character.isDigit(sumDifferenceString.charAt(2)) : "the difference must be a digit. difference = " +sumDifferenceString.charAt(2);
			assert sumDifferenceString.charAt(1)== SUM_DIFFERENCE_DELIMITER: "SUM_DIFFERENCE_DELIMITER = "+ sumDifferenceString.charAt(1);
			String str0ToString=String.valueOf(sumDifferenceString.charAt(0));
			String str2ToString=String.valueOf(sumDifferenceString.charAt(2));
			sum=Integer.valueOf(str0ToString);
			difference=Integer.valueOf(str2ToString);
		}
		if(sumDifferenceString.length()==4)
		{
			assert Character.isDigit(sumDifferenceString.charAt(0)) && Character.isDigit(sumDifferenceString.charAt(1)) : "sum = " +sumDifferenceString.charAt(0)+sumDifferenceString.charAt(1) ;
			assert Character.isDigit(sumDifferenceString.charAt(3)) : "the difference must be a digit. difference = " +sumDifferenceString.charAt(3);
			assert sumDifferenceString.charAt(2)== SUM_DIFFERENCE_DELIMITER: "SUM_DIFFERENCE_DELIMITER = "+ sumDifferenceString.charAt(2);
			String str0ToString=String.valueOf(sumDifferenceString.charAt(0));
			String str1ToString=String.valueOf(sumDifferenceString.charAt(1));
			String sumString = str0ToString + str1ToString;
			String str3ToString=String.valueOf(sumDifferenceString.charAt(3));
			sum=Integer.valueOf(sumString);
			difference=Integer.valueOf(str3ToString);
		}
		assert sum >= difference : difference+ " = difference > "+ sum + " = sum";
		assert difference <= MAX_PIP_COUNT : difference+ " = difference > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
		assert MINIMUM_PIP_COUNT <= difference : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ difference +" = difference";
		assert MINIMUM_PIP_COUNT <= sum : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ sum +" = sum";
		assert sum <= (MAX_PIP_COUNT*2) : "sum = " + sum  + " > " + (MAX_PIP_COUNT*2);
		assert (sum%2==0 && difference%2==0) ||  (sum%2!=0 && difference%2!=0) : "sum = " + sum + " && difference = "+ difference +" Both have to be either even or odd";
		double sumDividedBy2= (double) sum/2;
		double differenceDivideBy2 = (double) difference/2;
		double highPipCount= sumDividedBy2 + differenceDivideBy2;
		double lowPipCount = sumDividedBy2 - differenceDivideBy2;
		int highPipCountInt = (int) highPipCount;
		int lowPipCountInt = (int) lowPipCount;
		DominoHighLowSetImpl_Dalton.checkHighLow(highPipCountInt,lowPipCountInt);
		Set <Integer> highLowSet= new HashSet<Integer>();
		highLowSet.add(highPipCountInt); highLowSet.add(lowPipCountInt);
		this.highLowSet=highLowSet;

	}
	//precondition: nothing
	//post condition: rv = true if only if there is a lowPipCount + (8 *highPipCount),
	//otherwise rv = false
	public static boolean isLowPlus8TimesHighInteger(int k)
	{
		int count=0;
		boolean rv= false;
		while(count!=7)
		{
			for(int i=0; i<MIN_TO_MAX.length; i++)
			{
				if(count+(8*i)== k)
				{
					rv= true;
				}
			}
			count++;
		}
		return rv;
	}
	public DominoHighLowSetImpl_Dalton(int lowPlus8TimesHigh)
	{
		assert lowPlus8TimesHigh <= (MAX_PIP_COUNT+(8*MAX_PIP_COUNT)) :lowPlus8TimesHigh + " = lowPlus8TimesHigh > " + (MAX_PIP_COUNT+(8*MAX_PIP_COUNT));
		assert DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(lowPlus8TimesHigh): "cannot find a highpip and lowpip that equals " + lowPlus8TimesHigh;
		Set <Integer> highLowSet= new HashSet<Integer>();
		int count = MINIMUM_PIP_COUNT;
		while(count!= MAX_PIP_COUNT+1)
		{
			for(int i=0; i<MIN_TO_MAX.length; i++)
			{
				if(count+(8*i)== lowPlus8TimesHigh)
				{
					DominoHighLowSetImpl_Dalton.checkHighLow(i,count);
					highLowSet.add(count); highLowSet.add(i);
				}
			}
			count++;
		}
		this.highLowSet=highLowSet;
	}
	public int getHighPipCount()
	{
		int highPipCount= 0;
		ArrayList<Integer> highLowList=new ArrayList<Integer>(this.highLowSet);
		if(highLowList.size()==1)
		{
			highPipCount= highLowList.get(0);
		}
		else
		{
			if(highLowList.get(0)>highLowList.get(1))
			{
				highPipCount= highLowList.get(0);
			}
			if(highLowList.get(0)<highLowList.get(1))
			{
				highPipCount= highLowList.get(1);
			}
		}
		return highPipCount;
	}
	public int getLowPipCount()
	{
		int lowPipCount= 0;
		ArrayList<Integer> highLowList=new ArrayList<Integer>(this.highLowSet);
		if(highLowList.size()==1)
		{
			lowPipCount= highLowList.get(0);
		}
		else
		{
			if(highLowList.get(0)<highLowList.get(1))
			{
				lowPipCount= highLowList.get(0);			
			}
			if(highLowList.get(0)>highLowList.get(1)) 
			{ 
				lowPipCount= highLowList.get(1);
			}
		}

		return lowPipCount;
	}
	
}

