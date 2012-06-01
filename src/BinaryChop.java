
public class BinaryChop implements ISearchAnArray
{

	@Override
    public int chop(int findMe,int[] searchMe)
    {
		return chop(findMe, searchMe, 0, searchMe.length);
    }
	
	public int chop(int findMe, int[] searchMe, int currentStart, int currentEnd)
	{	
		if((currentEnd - currentStart) == 0) return -1;
		if((currentEnd - currentStart) == 1) return searchMe[currentStart] == findMe ? currentStart : -1;
		int middleIndex = ((currentEnd - currentStart) / 2) + currentStart;
		if(findMe < searchMe[middleIndex]) return chop(findMe,searchMe,currentStart, middleIndex);
		else if(findMe > searchMe[middleIndex]) return chop(findMe,searchMe, middleIndex, currentEnd);
		else return middleIndex;
	}

}
