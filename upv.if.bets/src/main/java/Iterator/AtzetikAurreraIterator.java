package Iterator;
import java.util.Vector;

import domain.Event;

public class AtzetikAurreraIterator<Object> implements ExtendedIterator{
	
	Vector<Object> bektorea;
	int index=-1;
	
	public AtzetikAurreraIterator(Vector<Object> b) {
		this.bektorea=b;
	}

	public boolean hasNext() {
		if(index==bektorea.size()-1) {
			return false;
		}
		return true;
	}

	public Object next() {
		index++;
		return bektorea.get(index);
	}

	public Object previous() {
		index--;
		return bektorea.get(index);
		// TODO Auto-generated method stub

	}

	public boolean hasPrevious() {
		if(index==0) {
			return false;
		}
		// TODO Auto-generated method stub
		return true;
	}

	public void goFirst() {
		index=-1;
		
	}

	public void goLast() {
		index=bektorea.size();
		
	}

}
