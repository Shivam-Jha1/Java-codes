package has_PQ_HUF_CN;

public class tries_huffman_coding {

	//SEARCH WORD IN A TRIE
	
	lass TrieNode{

		char data;
		boolean isTerminating;
		TrieNode children[];
		int childCount;

		public TrieNode(char data) {
			this.data = data;
			isTerminating = false;
			children = new TrieNode[26];
			childCount = 0;
		}
	}


	public class Trie {

		private TrieNode root;
		public int count;
		public Trie() {
			root = new TrieNode('\0');
		}

		public boolean search(String word) {
				
				return search(root,word);
			}

			private boolean search(TrieNode root, String word) {
				
				if(word.length() == 0) {
					return root.isTerminating;
				}
				
				int childIndex = word.charAt(0) - 'a';
				TrieNode child = root.children[childIndex];
				if(child == null) {
				return false;
				}
				return search(child,word.substring(1));
			}


		private void add(TrieNode root, String word){
			if(word.length() == 0){
				root.isTerminating = true;
				return;
			}		
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				child = new TrieNode(word.charAt(0));
				root.children[childIndex] = child;
				root.childCount++;
			}
			add(child, word.substring(1));

		}

		public void add(String word){
			add(root, word);
		}
	}
	
	//COUNT WORDS IN A TRIE
	
	class TrieNode{
		char data;
		boolean isTerminating;
		TrieNode children[];
		int childCount;

		public TrieNode(char data) {
			this.data = data;
			isTerminating = false;
			children = new TrieNode[26];
			childCount = 0;
		}
	}


	public class Trie {

		private TrieNode root;
		private int numWords;

		public Trie() {
			root = new TrieNode('\0');
			numWords = 0;
		}
		

		public void remove(String word){
			if(remove(root, word)) {
				numWords--;
			}
		}
		

		private boolean remove(TrieNode root, String word) {
			if(word.length() == 0){
				if(root.isTerminating) {
					root.isTerminating = false;
					return true;
				}
				else {
					return false;
				}
			}
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				return false;
			}
			boolean ans = remove(child, word.substring(1));
			// We can remove child node only if it is non terminating and its number of children are 0	

			if(!child.isTerminating && child.childCount == 0){
				root.children[childIndex] = null;
				child = null;
				root.childCount--;
			}
			return ans;
		}

		private boolean add(TrieNode root, String word){
			if(word.length() == 0){
				if(root.isTerminating) {
					return false;
				}
				else {
					root.isTerminating = true;
					return true;
				}
			}		
			int childIndex = word.charAt(0) - 'a';
			TrieNode child = root.children[childIndex];
			if(child == null){
				child = new TrieNode(word.charAt(0));
				root.children[childIndex] = child;
				root.childCount++;
			}
			return add(child, word.substring(1));
		}

		public void add(String word){
			if(add(root, word)) {
				numWords++;
			}
		}
		
		public int countWords() {
	        
	        return numWords;
		}
		
	}
	
	//PATTERN MATCHING
	
	mport java.util.ArrayList;

	class TrieNode{

	    char data;
	    boolean isTerminating;
	    TrieNode children[];
	    int childCount;

	    public TrieNode(char data) {
	        this.data = data;
	        isTerminating = false;
	        children = new TrieNode[26];
	        childCount = 0;
	    }
	}


	public class Trie {

	    private TrieNode root;
	    public int count;
	    public Trie() {
	        root = new TrieNode('\0');
	    }

	    public boolean search(String word){
	        return search(root, word);
	    }

	    private boolean search(TrieNode root, String word) {
	        if(word.length() == 0){
	            return true;
	        }
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode child = root.children[childIndex];
	        if(child == null){
	            return false;
	        }
	        return search(child, word.substring(1));
	    }


	    public boolean patternMatching(ArrayList<String> vect, String pattern) {

	        for(int i=0;i<vect.size();i++)
	        {
	            for(int j=0;j<vect.get(i).length();j++)
	                add(vect.get(i).substring(j));


	            if(search(pattern))
	                return true;
	        }
	        return false;
	    }
	    private void add(TrieNode root, String word){
	        if(word.length() == 0){
	            root.isTerminating = true;
	            return;
	        }		
	        int childIndex = word.charAt(0) - 'a';
	        TrieNode child = root.children[childIndex];
	        if(child == null){
	            child = new TrieNode(word.charAt(0));
	            root.children[childIndex] = child;
	            root.childCount++;
	        }
	        add(child, word.substring(1));

	    }

	    public void add(String word){
	        add(root, word);
	    }
	}
	
	//PALINDROME PAIR
	
	
	
}
