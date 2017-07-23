
public class ArrayAlgo {
	public int[] removeElement(int i)
	{
		int el=0;
		int[] scoreBoard= {1,2,3,4,5,6};
		int numEntries=scoreBoard.length;
		if(i<0||i>=numEntries)
			throw new  IndexOutOfBoundsException("the index is greater"+i);
		int element=scoreBoard[i];
		for(int j=i;j<numEntries-1;j++) {
			scoreBoard[j]=scoreBoard[j+1];
		}
			scoreBoard[numEntries-1]=0;
		numEntries--;
		return scoreBoard;
	}

}
