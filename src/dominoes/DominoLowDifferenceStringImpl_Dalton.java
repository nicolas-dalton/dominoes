package dominoes;

import java.util.List;

public class DominoLowDifferenceStringImpl_Dalton implements Domino
{
	private String lowDifferenceString;
	private static final char LOW_DIFFERENCE_DELIMITER='*';
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
	public DominoLowDifferenceStringImpl_Dalton( int lowPlus8TimesHigh)
	{
		assert lowPlus8TimesHigh <= (MAX_PIP_COUNT+(8*MAX_PIP_COUNT)) :lowPlus8TimesHigh + " = lowPlus8TimesHigh > " + (MAX_PIP_COUNT+(8*MAX_PIP_COUNT));
		assert DominoHighLowSetImpl_Dalton.isLowPlus8TimesHighInteger(lowPlus8TimesHigh): "cannot find a highpip and lowpip that equals " + lowPlus8TimesHigh;
		int lowPipCount = 0;
		int highPipCount = 0;
		int difference = 0;
		int count = MINIMUM_PIP_COUNT;
		while(count!=MAX_PIP_COUNT+1)
		{
			for(int i=0; i<MIN_TO_MAX.length; i++)
			{
				if(count+(8*i)== lowPlus8TimesHigh)
				{
					lowPipCount= count;
					highPipCount = i;
				}
			}
			count++;
		}
		DominoLowDifferenceStringImpl_Dalton.checkHighLow(highPipCount, lowPipCount);
		difference = highPipCount - lowPipCount;
		this.lowDifferenceString = String.valueOf(lowPipCount) + LOW_DIFFERENCE_DELIMITER + 
				String.valueOf(difference);
	}

	//post: sets lowDifferenceString = lowPipCount + * + difference
	public DominoLowDifferenceStringImpl_Dalton(List<Integer> highSum)
	{
		assert highSum.size()==2 : "highSum.size() = "+ highSum.size();
		assert highSum!= null : "highSum = null!!!";
		int sum= highSum.get(1);
		int high = highSum.get(0);
		assert high <= sum : high + " = high "+ "> "+ sum + " = sum";
		assert sum <= MAX_PIP_COUNT*2 : sum +" = sum" +" > "+ MAX_PIP_COUNT*2;
		int lowPipCount= highSum.get(1)-highSum.get(0);
		int highPipCount = highSum.get(0);
		DominoLowDifferenceStringImpl_Dalton.checkHighLow(highPipCount, lowPipCount);
		int difference= highPipCount - lowPipCount;
		String lowPipCountString = String.valueOf(lowPipCount);
		String differenceString = String.valueOf(difference);
		this.lowDifferenceString= lowPipCountString + LOW_DIFFERENCE_DELIMITER + differenceString;
	}
	
	public int getHighPipCount()
	{
		String lowPipCountString = String.valueOf(this.lowDifferenceString.charAt(0));
		int lowPipCountInt= Integer.valueOf(lowPipCountString);
		String differenceString = String.valueOf(this.lowDifferenceString.charAt(2));
		int differenceInt = Integer.valueOf(differenceString);
		int highPipCount = lowPipCountInt + differenceInt;
		return highPipCount;
	}
	public int getLowPipCount()
	{
		String lowPipCountString = String.valueOf(this.lowDifferenceString.charAt(0));
		int lowPipCountInt= Integer.valueOf(lowPipCountString);
		return lowPipCountInt;
	}
}
