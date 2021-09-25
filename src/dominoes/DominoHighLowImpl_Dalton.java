package dominoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DominoHighLowImpl_Dalton implements Domino
{
	private int highPipCount;
	private int lowPipCount;
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
	public static void checkHighLow(int highPipCount, int lowPipCount)
	{
		assert MINIMUM_PIP_COUNT <= highPipCount : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ highPipCount +" = highPipCount";
		assert highPipCount<= MAX_PIP_COUNT :  highPipCount+ " = highPipCount > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
		assert MINIMUM_PIP_COUNT <= lowPipCount : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ lowPipCount +" = lowPipCount";
		assert lowPipCount<= MAX_PIP_COUNT :  lowPipCount+ "= lowPipCount > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
		assert lowPipCount<= highPipCount : lowPipCount+ " = lowPipCount > "+ highPipCount + " = highPipCount";
	}
	// part of pre-condition: highPipCount >= lowPipCount 
	//part of pre-condition: highPipCount must be either 0,1,2,3,4,5,6
	//part of pre-condtion: lowPipCount must be either 0,1,2,3,4,5,6
	//post-condition: the instance highPipCount will equal to highPipCount 
	// && the instance lowPipCount will equal to lowPipCount
	public DominoHighLowImpl_Dalton(int highPipCount, int lowPipCount)
	{
		DominoHighLowImpl_Dalton.checkHighLow(highPipCount,lowPipCount);
		this.highPipCount= highPipCount;
		this.lowPipCount= lowPipCount;
	}

	public static final char HIGH_LOW_STRING_SEPARATOR= ':';

	//pre-condition: "nothing"
	//post-condition: rv will equal true if and only if str.length() = 3 && str.charAt(1)= :
	//str.charAt(0) > str.charAt(2), otherwise rv equals false
	//part of post-condition (STRAIGHTFORWARD):  isHighLowString(6:3) => true
	//part of post-condition (EXTREME): isHighLowString(3:334) => false
	//part of post-condition (BIZZARE/EXOTIC): isHighLowString(abc) => false
	public static boolean isHighLowString(String str)
	{
		boolean isHighLowString=(str.length()==3 && str.charAt(1)==(HIGH_LOW_STRING_SEPARATOR));
		if(isHighLowString)
		{
			if(Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(2)))
			{
				String str0ToString=String.valueOf(str.charAt(0));
				String str2ToString=String.valueOf(str.charAt(2));
				int str0Int=Integer.valueOf(str0ToString);
				int str2Int=Integer.valueOf(str2ToString);
				if(str0Int < str2Int)
				{
					isHighLowString=false;
				}
				if(str2Int > MAX_PIP_COUNT || str0Int > MAX_PIP_COUNT)
				{
					isHighLowString=false;
				}
			}
			else
			{
				isHighLowString=false;
			}
		}
		return isHighLowString;
	}

	//Constructor takes in a string that represents highPipCount and lowPipCount

	//post: instance of highPipCount equal highLowString.charAt(0) as an int
	//part of post: instance of lowPipCount equal highLowString.charAt(2) as an int
	public DominoHighLowImpl_Dalton(String highLowString)
	{
		assert highLowString.length() ==3 : "highLowString.length() = " + highLowString.length() ;
		assert highLowString.charAt(1) == HIGH_LOW_STRING_SEPARATOR : "HIGH_LOW_STRING_SEPARATOR  = "+HIGH_LOW_STRING_SEPARATOR ;
		assert Character.isDigit(highLowString.charAt(0)) : "highPipCount = "+ highLowString.charAt(0);
		assert Character.isDigit(highLowString.charAt(2)) : "lowPipCount = "+ highLowString.charAt(2);
		String highLowString0ToString=String.valueOf(highLowString.charAt(0));
		String highLowString2ToString=String.valueOf(highLowString.charAt(2));
		DominoHighLowImpl_Dalton.checkHighLow(Integer.valueOf(highLowString0ToString),Integer.valueOf(highLowString2ToString));
		this.highPipCount= Integer.valueOf(highLowString0ToString);
		this.lowPipCount= Integer.valueOf(highLowString2ToString);
	}
	public static final int INDEX_OF_SUM = 0;
	public static final int INDEX_OF_DIFFERENCE= 1;
	
	public DominoHighLowImpl_Dalton(int[] sumDifference)
	{
		assert sumDifference != null: "sumDifference cannot be null";
		assert sumDifference.length == 2 : "sumDifference.length = "+ sumDifference.length;
		int sum= sumDifference[INDEX_OF_SUM];
		int difference= sumDifference[INDEX_OF_DIFFERENCE];
		assert sum>= difference : difference + " = difference "+ " > "+ sum+ " = sum ";
		assert difference <= MAX_PIP_COUNT : difference+ " = difference > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
		assert MINIMUM_PIP_COUNT <= difference : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ difference +" = difference";
		assert MINIMUM_PIP_COUNT <= sum : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + " > "+ sum +" = sum";
		assert sum <= (MAX_PIP_COUNT*2) : "sum = " + sum  + " > " + (MAX_PIP_COUNT*2);
		assert (sum%2==0 && difference%2==0) ||  (sum%2!=0 && difference%2!=0) : "sum = " + sum + "difference = "+ difference +" Both have to be either even or odd";
		if(difference==MINIMUM_PIP_COUNT)
		{
			if(sum == MINIMUM_PIP_COUNT)
			{
				this.highPipCount=MINIMUM_PIP_COUNT;
				this.lowPipCount=MINIMUM_PIP_COUNT;
			}
			else
			{
				int lowHigh=sum/2;
				DominoHighLowImpl_Dalton.checkHighLow(lowHigh, lowHigh);
				this.highPipCount= sum/2;
				this.lowPipCount= sum/2;
			}
		}
		int countMinToMax=MINIMUM_PIP_COUNT;
		while(countMinToMax!=MAX_PIP_COUNT+1)
		{
			for(int i=0; i<MIN_TO_MAX.length;i++)
			{
				if(countMinToMax+MIN_TO_MAX[i]==sum)
				{
					if(countMinToMax-MIN_TO_MAX[i]== difference || MIN_TO_MAX[i]-countMinToMax==difference)
					{
					
						if(countMinToMax>MIN_TO_MAX[i])
						{
							
							this.highPipCount=countMinToMax;
							this.lowPipCount=MIN_TO_MAX[i];
						}
						if(MIN_TO_MAX[i]>countMinToMax)
						{
							this.highPipCount=MIN_TO_MAX[i];
							this.lowPipCount=countMinToMax;
						}
					}

				}

			}
			countMinToMax++;
		}


	}
	public int getHighPipCount()
	{
		return this.highPipCount;
	}
	public int getLowPipCount()
	{
		return this.lowPipCount;
	}
	//post: the instance of highPipCount will be set to the largest number in highLowSet, 
	//part of post: the instance of lowPipCount will be set the lowest number in highLowSet
	//part of post: if highLowSet.size() == 1, then both instances will be set to only digit in highLowSet
	public DominoHighLowImpl_Dalton(Set<Integer> highLowSet)
	{
		assert highLowSet!= null : "highLowSet = null";
		assert highLowSet.size() ==1 || highLowSet.size() ==2 : "highLowSet.size() = "+ highLowSet.size();
		ArrayList<Integer> highLowList = new ArrayList<Integer>(highLowSet);
		if(highLowSet.size()==1)
		{
			assert MINIMUM_PIP_COUNT <= highLowList.get(0) : "MINIMUM_PIP_COUNT = "+ MINIMUM_PIP_COUNT + ">"+ highLowList.get(0) +" = highPipCount";
			assert highLowList.get(0)<= MAX_PIP_COUNT :  highLowList.get(0) + "= highPipCount > "+ MAX_PIP_COUNT + " = MAX_PIP_COUNT";
			this.highPipCount=highLowList.get(0);
			this.lowPipCount=highLowList.get(0);
		}
		if(highLowSet.size()==2)
		{
			if(highLowList.get(0)>highLowList.get(1))
			{
				DominoHighLowImpl_Dalton.checkHighLow(highLowList.get(0),highLowList.get(1));
				this.highPipCount=highLowList.get(0);
				this.lowPipCount=highLowList.get(1);
			}
			if(highLowList.get(0)<highLowList.get(1))
			{
				DominoHighLowImpl_Dalton.checkHighLow(highLowList.get(1),highLowList.get(0));
				this.highPipCount=highLowList.get(1);
				this.lowPipCount=highLowList.get(0);
			}
		}
	}
	DominoHighLowImpl_Dalton(
							int highPipCountDivisionBy2Quotient,
							int highPipCountDivisionBy3Remainder,
							int lowPipCountDivisionBy2Quotient,
							int lowPipCountDivisionBy3Remainder)
	{
		assert (MINIMUM_PIP_COUNT/2) <= highPipCountDivisionBy2Quotient : "highPipCountDivisionBy2Quotient = " + highPipCountDivisionBy2Quotient + "<" + (MINIMUM_PIP_COUNT/2);
		assert highPipCountDivisionBy2Quotient <= (MAX_PIP_COUNT/2) : "highPipCountDivisionBy2Quotient = " + highPipCountDivisionBy2Quotient + ">" + (MAX_PIP_COUNT/2);
		assert 0 <= highPipCountDivisionBy3Remainder : "0 > " + "highPipCountDivisionBy2Quotient = " + highPipCountDivisionBy2Quotient;
		assert highPipCountDivisionBy3Remainder < 3 : "highPipCountDivisionBy2Quotient = " + highPipCountDivisionBy2Quotient + "> 3";
		assert (MINIMUM_PIP_COUNT/2) <= lowPipCountDivisionBy2Quotient : "lowPipCountDivisionBy2Quotient = " + lowPipCountDivisionBy2Quotient + "<" + (MINIMUM_PIP_COUNT/2);
		assert lowPipCountDivisionBy2Quotient <= (MAX_PIP_COUNT/2) : "lowPipCountDivisionBy2Quotient = " + lowPipCountDivisionBy2Quotient + ">" + (MAX_PIP_COUNT/2);
		assert 0 <= lowPipCountDivisionBy3Remainder : "0 > " + "lowPipCountDivisionBy3Remainder = " + lowPipCountDivisionBy3Remainder;
		assert lowPipCountDivisionBy3Remainder < 3 : "lowPipCountDivisionBy3Remainder = " + lowPipCountDivisionBy3Remainder + "> 3";
		int highPipCount = 0;
		int lowPipCount = 0;
		for(int i=0; i<MIN_TO_MAX.length;i++)
		{
			if(MIN_TO_MAX[i]/2 == highPipCountDivisionBy2Quotient && MIN_TO_MAX[i]%3== highPipCountDivisionBy3Remainder)
			{
				highPipCount = MIN_TO_MAX[i];
			}
			if(MIN_TO_MAX[i]/2 != highPipCountDivisionBy2Quotient || MIN_TO_MAX[i]%3 != highPipCountDivisionBy3Remainder)
			{
				assert false;
			}
			if(MIN_TO_MAX[i]/2 == lowPipCountDivisionBy2Quotient && MIN_TO_MAX[i]%3== lowPipCountDivisionBy3Remainder)
			{
				lowPipCount = MIN_TO_MAX[i];
			}
			if(MIN_TO_MAX[i]/2 != lowPipCountDivisionBy2Quotient && MIN_TO_MAX[i]%3 != lowPipCountDivisionBy3Remainder)
			{
				assert false;
			}
		}
		
		DominoHighLowImpl_Dalton.checkHighLow(highPipCount,lowPipCount);
		this.highPipCount = highPipCount;
		this.lowPipCount = lowPipCount;
	}
	public static void main(String[]args)
	{
		System.out.println(2%11);
	}
	
}
