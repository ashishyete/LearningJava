package com.learn.algos;

public class CustomHashMapExample {

	private static final int DEF_SIZE = 16;

	private Entry table[] = new Entry[DEF_SIZE];

	class Entry {

		private String key;
		private String val;
		Entry next;

		public Entry(String key, String val) {
			this.key = key;
			this.val = val;
		}

		public String getKey() {
			return key;
		}

		public String getVal() {
			return val;
		}

		public void setVal(String val) {
			this.val = val;
		}

	}
	
	public Entry get(String key) {
		int hash = key.hashCode()% DEF_SIZE;
		Entry e = table[hash];
		while(e!=null) {
			if(e.key.equals(key))
				return e;
		}
		return null;
	}
	
	public void put(String key, String val) {
		int hash = key.hashCode()%DEF_SIZE;
		Entry e = table[hash];
		if(e!=null) {
			if(e.key.equals(key)) {
				e.val=val;
			}else {
				while(e.next!=null) {
					e=e.next;
				}
				Entry entryInOldBucket = new Entry(key, val);
				e.next = entryInOldBucket;
			}
		}else {
			Entry entryInNewBucket = new Entry(key, val);
			table[hash] = entryInNewBucket;
		}
	}

	
	public static void main(String[] args) {
		CustomHashMapExample ee = new CustomHashMapExample();
		ee.put("Ashish", "1");
		ee.put("Ayana", "2");

		System.out.println(ee.get("Ayana").val);
	}
}
