import java.util.ArrayList;

/**
 *  The class represent shared data used in a multi threaded environment.
 * Its contains a flag, an array of booleans with win condition,
 * an array of integers and a constant integer "b".
 */
public class SharedData 
{
	private int [] array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * Constructs a object with the given integer array and constant value "b".
	 * @param array the integer array.
	 * @param b the constant integer value "b". 
	 */
	public SharedData(int[] array, int b) {
		
		this.array = array;
		this.b = b;
	}
	
	/**
	 * Returns the array of booleans that represent the win condition.
	 * @return the array of booleans.
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * Sets the array of booleans that represent the win condition.
	 * @param winArray the array of booleans to be set as a win condition.
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * Returns the integer array.
	 * @return the integer array.
	 */
	public int[] getArray() 
	{
		return array;
	}

	/**
	 * Returns the constant integer value "b".
	 * @return the constant "b".
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * Returns the flag value.
	 * @return the flag value.
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * Sets the flag value 
	 * @param flag the flag value to be set.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
