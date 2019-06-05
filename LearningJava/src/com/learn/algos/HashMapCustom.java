package com.learn.algos;

public class HashMapCustom {

	private static final int DEF_SIZE = 16;
	Entry table[] = new Entry[DEF_SIZE];

	class Entry {
		private String key;
		private String val;
		Entry next;

		public String getKey() {
			return key;
		}

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

		public Entry(String key, String val) {
			super();
			this.key = key;
			this.val = val;
		}
	}

	public void put(String key, String val) {
		int hash = key.hashCode() % DEF_SIZE;
		Entry entry = table[hash];
		if(entry != null) {
			if (entry.getKey().equals(key)) {
				entry.setVal(val);
			} else {
				while (entry.next != null) {
					entry.next = entry;
				}
				Entry entryInOldBucket = new Entry(key, val);
				entry.next = entryInOldBucket;
			}
		}else {	
			Entry entryInNewBucket = new Entry(key, val);
			table[hash]= entryInNewBucket;
		}
	}
	
	public Entry get(String key) {
		int hash = key.hashCode()%DEF_SIZE;
		Entry entry = table[hash];
		while(entry!=null) {
			if(entry.getKey().equals(key))
				return entry;
		}
		return null;
	}
	public int getKey(Object key) {
		return Math.abs(key.hashCode() %DEF_SIZE);
	}
	

	public void remove(String key) {
		int hash = key.hashCode()%DEF_SIZE;
		Entry entry = table[hash];
		if(entry!=null) {
			if(entry.getKey().equals(key)) {
				System.out.println("Element Found Need to remove this Element");
			}
		}else {
		System.out.println("Entry not in HashMap");
		}
	}
	public static void main(String[] args) {
		HashMapCustom obj = new  HashMapCustom();
		obj.put("Ashish","ML");
		obj.put("Ashish","ML");
		obj.put("Ayana","Manager");
		System.out.println(obj.get("Ashish").val);
		obj.remove("Nidhi");
	}
}
