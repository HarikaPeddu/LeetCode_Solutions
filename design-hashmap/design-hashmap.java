class MyHashMap {
	private int[] hashMap;
	
	public MyHashMap() {
    	this.hashMap=new int[1000001];
	}
 
	
	public void put(int key, int value) {
    	hashMap[key] = value+1;
	}
 
	
	public int get(int key) {
    	return hashMap[key] - 1;
	}
 
	public void remove(int key) {
    	hashMap[key] = 0;
	}
}
