package com.job.designPattern.iterator;

public class CollectionImpl  implements Collection{
	
	String inputArray[] = {"Anurag","Aman","Saurav","Rabi"};

	@Override
	public Iterator getIterator() {
		return new getItr();
	}
	
	class getItr implements Iterator {
		int index = 0;

		@Override
		public boolean hasNext() {
			if(index < inputArray.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return inputArray[index++];
			}
			return null;
		}

	}


}
