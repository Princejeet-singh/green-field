
public class CounterVO {

	private int counter;
	
	
public CounterVO() {
		super();
	}
void increementCouter(int i){
  setCounter(i+=counter);		
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
}
