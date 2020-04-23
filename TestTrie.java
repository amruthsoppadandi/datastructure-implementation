package noote;

public class TestTrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieeImpl tree = new TrieeImpl();
		tree.insert("Amruth");
		tree.insert("Anitha");
		tree.insert("bAt");
		tree.insert("cAt");
		tree.insert("Amma");
		System.out.println("iiiiiiiii");
		
		System.out.println(tree.searchItem("Ani"));
	}

}
