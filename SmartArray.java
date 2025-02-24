package Smart_Array_Assignment_1;
import java.util.ArrayList;
import java.util.HashMap;
public class SmartArray {
	
	ArrayList<Integer> array = new ArrayList();
	HashMap<Integer,Object> hashmap = new HashMap();
	
	SmartArray(){
		array = new ArrayList();
		hashmap = new HashMap();
	}

	public boolean addElement(int key, String value) {
		if(!(array.contains(key))) {
			array.add(key);
			hashmap.put(key, value);
			return true;
		}
		return false;
	}
	
	public boolean removeElement(Integer key) {
		if(array.contains(key)) {
//			System.out.println(key);
			array.remove(key);
//			System.out.println(hashmap.get(key));
			hashmap.remove(key);
			return true;
		}
		return false;
	}
	
	
	public HashMap showAllElementsWithKeyValue() {
		return hashmap;
		
	}
	
	public ArrayList showKeyOfArray() {
		ArrayList newArray = new ArrayList();
		for(int key:array) {
			newArray.add(key);
		}
		return newArray;
	}
	
	public ArrayList showAllElements() {
	    ArrayList allElements = new ArrayList();
	    for(Integer key:array) {
	    	allElements.add(hashmap.get(key));
	    }
	    return allElements;
	}
	
	public ArrayList slice(Integer startIndex,Integer endIndex) {
		if( startIndex>=0 && endIndex<=array.size() && startIndex<=endIndex ) {
			ArrayList sliceArray = new ArrayList();
			for(Integer i = startIndex; i <= endIndex; i++) {	
					sliceArray.add(hashmap.get(i));		
	     	}
			return sliceArray;
		}
		return null;
	}
	
	public void flip() {
		ArrayList flippedArray = new ArrayList();
		for(Integer key:array) {
			flippedArray.add(key);
//			System.out.println(key);
		}
		System.out.println(flippedArray);
	}
	
	
	public static void main(String[] args) {
		SmartArray array1 = new SmartArray();
		array1.addElement(1, "Anshu Pandey");
		array1.addElement(2, "Anmol Pandey");
		array1.addElement(3, "Anubhav Tiwari");
		array1.addElement(4, "Gaurav Mishra");
		array1.addElement(5, "Prakhar Mishra");
		
		
		System.out.println("Add Element: "+array1.showAllElements());
//		System.out.println(array1.showAllElementsWithKeyValue());
   
//		array1.removeElement(3); 
//		System.out.println("Remove Element: "+array1.showAllElements());
	//System.out.println(array1.showKeyOfArray());
		//System.out.println(array1.showAllElementsWithKeyValue());
		
		System.out.println("Slice (2,4):"+array1.slice(2, 4));
	
		array1.flip();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
}

















































