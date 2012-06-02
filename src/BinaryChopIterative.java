
public class BinaryChopIterative implements ISearchAnArray
{

	@Override
    public int chop(int findMe,int[] searchMe)
    {
		int currentStart = 0;
		int currentEnd = searchMe.length;
		int middleIndex = searchMe.length / 2;
		
		while(currentEnd > currentStart)
		{
			middleIndex = ((currentEnd - currentStart) / 2) + currentStart;
			
			if(findMe < searchMe[middleIndex])
			{
				currentEnd = middleIndex;
			}
			else if(findMe > searchMe[middleIndex])
			{
				currentStart = middleIndex + 1;
			}
			else
			{
				return middleIndex;
			}
		}
		
		return -1;
    }
}
