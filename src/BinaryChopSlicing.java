import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BinaryChopSlicing implements ISearchAnArray
{
	@Override
	public int chop(int findMe,int[] searchMe)
	{
		Integer[] searchMeBoxed = new Integer[searchMe.length];
		int i = 0;
		for(int unboxed : searchMe)
        {
	        searchMeBoxed[i++] = unboxed;
        }
		
		return chop(findMe,Arrays.asList(searchMeBoxed),0);
	}

	private int chop(int findMe,List<Integer> searchMe, int indexElementsToAdd)
    {
		if(searchMe.size() == 0) return -1;
		int middleIndex = searchMe.size() / 2;
		
		if(findMe < searchMe.get(middleIndex))
		{
			return chop(findMe,searchMe.subList(0, middleIndex),0);
		}
		else if(findMe > searchMe.get(middleIndex))
		{
			return chop(findMe,searchMe.subList(middleIndex + 1, searchMe.size()),indexElementsToAdd + middleIndex + 1);
		}
		else
		{
			return indexElementsToAdd + middleIndex;
		}
    }
}
