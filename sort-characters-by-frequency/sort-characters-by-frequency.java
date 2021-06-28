class Solution {
	public String frequencySort(String s) {
   	HashMap<Character,Integer> hashmap = new HashMap<>();
    	StringBuilder sb = new StringBuilder();
    	int len=s.length();
    	
    	for(int i=0;i<len;i++){
        	char ch = s.charAt(i);
        	if(!hashmap.containsKey(ch)){
            	hashmap.put(ch,1);
        	}
        	else{
                hashmap.put(ch,hashmap.get(ch)+1);
        	}
    	}
List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(hashmap.entrySet());
    	Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
        	public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
            	return -o1.getValue().compareTo(o2.getValue());
        	}
    	});
            	
    	for(Map.Entry<Character,Integer> mapping:list){
        	for(int i=0;i<mapping.getValue();i++){
            	sb.append(mapping.getKey());
        	}
    	}
    	return sb.toString();
	}
}
