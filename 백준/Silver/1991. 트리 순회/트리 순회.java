import java.io.*;


class Node{
    String data;
    Node left, right;

    Node(String data){
        this.data = data;
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Tree tree = new Tree();

        for(int i = 0; i<N; i++){
            String[] input = br.readLine().split(" ");

            tree.createNode(input[0], input[1], input[2]); // 루트 왼쪽 오른쪽
        }

        //전위순회
        tree.preOrder(tree.root);
        System.out.println();

        //중위순회
        tree.inOrder(tree.root);
        System.out.println();

        //후위순회
        tree.postOrder(tree.root);
        System.out.println();
    }
}

class Tree{
    Node root = new Node("."); //루트 노드를 .으로 초기화

    void createNode(String mid, String left, String right){
        if(root.data.equals(".")){ //만약 현재 노드값이 . (초기값) 이라면
            if(!mid.equals("."))
                root = new Node(mid);
            if(!left.equals("."))
                root.left = new Node(left);
            if(!right.equals("."))
                root.right = new Node(right);
        }

        else find(root, mid, left, right); //만약 현재값이 존재한다면 탐색
    }

    void find(Node node, String mid, String left, String right){
        if(node == null) //존재하지 않으면 리턴
            return;
        else if(mid.equals(node.data)){ //만약 현재 루트 노드의 값이 같다면
            if(!left.equals("."))
                node.left = new Node(left);
            if(!right.equals("."))
                node.right = new Node(right);
        }

        find(node.left, mid, left, right); // 재귀로 탐색 (dfs)
        find(node.right, mid, left, right);
    }

    //루트 -> 왼 -> 오
    void preOrder(Node node){

        //루트
        System.out.print(node.data); //현재 루트 노드의 값 출력

        //왼쪽
        if(node.left != null)
            preOrder(node.left); // 재귀로 탐색 dfs

        //오른쪽
        if(node.right != null)
            preOrder(node.right);
    }

    //왼 -> 루트 -> 오
    void inOrder(Node node){

        //왼쪽
        if(node.left != null)
            inOrder(node.left);

        //루트
        System.out.print(node.data);

        //오른쪽
        if(node.right != null)
            inOrder(node.right);
    }

    //왼 -> 오 -> 루트
    void postOrder(Node node){

        //왼쪽
        if(node.left != null)
            postOrder(node.left);
        //오른쪽
        if(node.right != null)
            postOrder(node.right);

        //루트
        System.out.print(node.data);
    }
}

