class TrieNode{
	TrieNode[] children;
	boolean endOfWord;
	TrieNode(){
		children = new TrieNode[26];
		endOfWord = false;
	}
}

class Trie{
	TrieNode root;
	Trie(){
		root = new TrieNode();
	}
	public void insert(String s)
	{			
	}
	public void search(String s)
	{
		
	}
}
