
public class SuperArray implements Iterable<String>{
    public String[] data;
    private int size;

    
  //0
    public SuperArray(){
	data = new String [10];
	size = 0;
    }
    public SuperArray(int s){
	if (s < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[s];
	size = 0;
    }
    public SuperArray(String[] ary){
	data = ary;
	size = 0;
    }

    public int size(){
	return size;
    }
//1
    public boolean add(String element){
	if (size()== data.length){
	    this.grow();
	}
	size++;
	data[size]=element;
	return true;
    }
		       
    public void add(int index, String element){
	if (index<0 || index>=size()){
	    throw new IndexOutOfBoundsException(); 
	}
	if(size == data.length){
 	    this.grow();
	}
	for(int i = size; i > index; i--){
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }


 

//2
    public String get(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String ans;
	ans = data[index];
	return ans;    
    }

    private void grow(){
        String[] temp = new String[data.length+10];
	for (int i = 0; i < data.length; i++){
	    temp[i]=data[i];
	}
	data = temp;
    }

  //3
   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/

    public String toString(){
	String ans = "[";
        for (int i = 0; i < (size - 1) ; i++){
	    ans += data[i] + ", ";
	}
	if (size > 0){
	    ans += data[(size -1)];
       	}
	ans += "]";
	return ans;
    }


//Clear

    public void clear(){
	String[] temp = new String[data.length];
	data = temp;
	size = 0;
	
    }


//isEmpty
    public boolean isEmpty(){
	return size == 0;
    }

//Setting (the table???)
    public String set (int index, String element){
	if (index < 0 || index>=size()){
	    throw new IndexOutOfBoundsException();
	}
	data[index] = element;
	String x = data[index];
	return x;
    }

    public String remove(int n){
	if (n<0 || n>=size()){
	    throw new IndexOutOfBoundsException();
	}
	String val = data[n];
	for(int i = n; i < size(); i++){
	    data[i] = data[i+1];
	}
	size--;
	return val;
    }

    public String[] toArray(){
	String[] ary = new String[size];
	for (int i = 0; i<size(); i++){
	    ary[i] = data[i];
	}
	return ary;
    }

     public int indexOf(String element){
	 for(int i = 0; i < size; i++){
	    if(element == data[i]){
		return i;
	    }
	}
	return -1;
    }
    
    public int lastIndexOf(String element){
	for(int i = size-1; i >= 0; i--){
	    if(element == data[i]){
		return i;
	    }
	}
	return -1;
    }
    
    public String toStringDebug(){
	String str = "[";
	for(int i = 0; i < size; i++){
	    if(i == (data.length-1)){
		str += data[i];
	    }
	    else{
		str += data[i] + ", ";
	    }
	}
	for(int i = size; i < data.length; i++){
	    if(i == (data.length-1)){
		str += "_";
	    }
	    else{
		str += "_, ";
	    }
	}
	return str + "]";
    }

    public void trimToSize(){
	String[] temp = new String[size()];
	for(int i = 0; i <size(); i++){
	    temp[i]=data[i];
	}
	data = temp;
    }

    public Iterator<String> iterator() {
	Iterator<Strings> it = new SuperArrayIterator(this);
	return it;
    }
}
