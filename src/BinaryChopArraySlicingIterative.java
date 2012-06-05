import java.util.Arrays;

public class BinaryChopArraySlicingIterative implements ISearchAnArray
{

	@Override
	public int chop(int findMe,int[] searchMe)
	{
		int[] tempArray = Arrays.copyOf(searchMe, searchMe.length);
		int indexElementsToAdd = 0;

		while(tempArray.length > 0)
		{
			int middleIndex = tempArray.length / 2;

			if(findMe < tempArray[middleIndex])
			{
				tempArray = Arrays.copyOfRange(tempArray, 0,
				        middleIndex);
			}
			else if(findMe > tempArray[middleIndex])
			{
				indexElementsToAdd += middleIndex + 1;
				tempArray = Arrays.copyOfRange(tempArray,middleIndex + 1,
				        tempArray.length);
			}
			else
			{
				return indexElementsToAdd + middleIndex;
			}
		}

		return -1;
	}
}
