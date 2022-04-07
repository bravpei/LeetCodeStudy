package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

public class InorderTraversal {
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
      public static List<Integer> solve(TreeNode root){
          List<Integer> numbers=new ArrayList<>();
          if (Objects.isNull(root)){
              return numbers;
          }
          Stack<TreeNode> stack=new Stack<>();
          TreeNode node=root;
          while(!stack.empty()||!Objects.isNull(node)){
              while (!Objects.isNull(node)){
                  stack.push(node);
                  node=node.left;
              }
              node=stack.pop();
              numbers.add(node.val);
              node=node.right;
          }
          return numbers;
      }

    public static void main(String[] args) {
        TreeNode one=new TreeNode(1);
        TreeNode two=new TreeNode(2);
        TreeNode three=new TreeNode(3);
        one.right=two;
        two.left=three;
        solve(one);
    }
}
