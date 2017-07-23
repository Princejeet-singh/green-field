
public class TestCode {
	
	public static void main(String[] args) {
		CounterVO obj=new CounterVO();
		obj.increementCouter(5);
    System.out.println("The counter is "+obj.getCounter());
    ArrayAlgo arr=new ArrayAlgo();
    int[] array=arr.removeElement(3);
   
    for(int i=0;i<=array.length;i++)
    	System.out.println(array[i]);
    	
    		
	}
	

}
