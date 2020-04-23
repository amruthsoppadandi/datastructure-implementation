package noote;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingClass sort = new SortingClass();
		int[] array = new int[]{2555555,0,-55,314,45,234,52,23,235235,213};
		int[] dummy =sort.quick(array);
		
		for(int i=0;i<dummy.length;i++)
			System.out.println(dummy[i]);
	}

}
