class binarySearch{
	public int search(int x , int[] array , int start , int end)
	{
		int mid = (start + end) / 2; 
		if(start  > end)
		{
			return 0;

		}
		else
			
			if(array[mid] == x)
			{
				return mid;
			}
			else
			{
				if(array[mid] > x)
					{
						return search(x , array , start , mid-1 );
					}
				else
					{
						return search(x , array , mid + 1 , end);
					}
			}
			
	} 
	public static void main(String[] args) {
		binarySearch obj = new binarySearch();
		int[] array = new int[]{1 , 2 , 3 ,4 ,5 ,6};
		int result = obj.search(6 , array , 0 , array.length - 1);
		if(result == 0){
			System.out.println("Not Found ");
		}
		else
			result = result + 1;
		System.out.println("Found at " + result + "th position");
	}
}