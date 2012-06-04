import java.util.Arrays;


public class BinaryChopArraySlicing implements ISearchAnArray
{
	@Override
	public int chop(int findMe,int[] searchMe)
	{
		return chop(findMe,searchMe,0);
	}
	
	public int chop(int findMe,int[] searchMe, int indexElementsToAdd)
	{
		if(searchMe.length == 0) return -1;
		int middleIndex = searchMe.length / 2;
		if(findMe < searchMe[middleIndex])
		{
			return chop(findMe,Arrays.copyOfRange(searchMe, 0, middleIndex),0);
		}
		else if(findMe > searchMe[middleIndex])
		{
			return chop(findMe,Arrays.copyOfRange(searchMe, middleIndex + 1, searchMe.length),indexElementsToAdd + middleIndex + 1);
		}
		else
		{
			return indexElementsToAdd + middleIndex;
		}
	}

}
