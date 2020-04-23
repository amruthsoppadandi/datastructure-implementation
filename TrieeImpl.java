package noote;

import java.util.HashMap;

public class TrieeImpl {
	
	class TriNode{
		HashMap<Character, TriNode> map;
		boolean isTheEnd;
		
		TriNode(){
			map=new HashMap<Character, TrieeImpl.TriNode>();
			isTheEnd= false;
		}
	}
	
	public TrieeImpl() {
		this.root = new TriNode();
	}
	
	private final TriNode root;
	
	// insert into Node
	public void insert(String word) {
//		if(root==null) {
//			root= new TriNode();
//			root.map.put(word.charAt(0),null);
//		}
		TriNode dummy = root;
		for(int i=0; i<word.length();i++) {
			char ch= word.charAt(i);
			TriNode node;
			node = dummy.map.get(ch);
			if(node==null) {
				node=new TriNode();
				 dummy.map.put(ch,node);
				System.out.println(ch+" "+dummy.map.get(ch).isTheEnd);
			}
			dummy=node;
		}
		dummy.isTheEnd=true;		
		
	}
	
	public String searchItem(String word) {
	
			String message="";
			TriNode noded= root;
			TriNode node;
			try {
			for (int i =0; i<word.length();i++) {
				char ch = word.charAt(i);
				node= noded.map.get(ch);
				if(node!=null) {
				noded= node;
				}
				else
					message = "Not Found";
				break;
			}
			}
			catch(Exception e) {
				System.out.println(e.getClass().getSimpleName());
			}
			return message;
		}
	
	
	public void show() {
		
	}
	
}
