package Tries_Huffman_Coding;

public class Trie_Use {
public static void main(String[] args) {
	Trie t = new Trie();
	t.add("this");
	t.add("news");
	System.out.println(t.search("news"));
	t.remove("news");
	System.out.println(t.search("news"));
}
}
