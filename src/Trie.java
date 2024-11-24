class Node{
    Node link[] = new Node[26];
    boolean flag = false;
    public Node(){}
    int countEndPrefix = 0;
    int countPrefix = 0;

    boolean containsChar(char c){
        return (link[c-'a']!=null);
    }
    Node get(char c){
        return link[c-'a'];
    }
    void put(Node node, char c){
        link[c-'a']=node;
    }
    void setEnd(){
        flag = true;
    }
    boolean isEnd(){
        return flag;
    }
    void increaseEnd(){
        countEndPrefix++;
    }
    void increasePrefix(){
        countPrefix++;
    }
    void deletePrefix(){
        countEndPrefix--;
    }
    void reducePrefix(){
        countPrefix--;
    }
    int getEnd(){
        return countEndPrefix;
    }
    int getPrefix(){
        return countPrefix;
    }
}
public class Trie {

    private static Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containsChar(word.charAt(i))){
                node.put(new Node(),word.charAt(i));
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean search(String word) {
        Node node = root;
        for(int i=0;i<word.length();i++){
            if(!node.containsChar(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        if(node.isEnd()){
            return true;
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        Node node = root;
        for(int i=0;i<prefix.length();i++){
            if(!node.containsChar(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }
}