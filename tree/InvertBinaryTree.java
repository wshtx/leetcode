package leetcode.tree;

/**
 * 问题描述：
 * 翻转一棵二叉树。
 * 示例：
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 *
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，
 * 但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了
 * @ClassName InvertBinaryTree
 * @Author htx
 * @Date 2018/9/22 21:07
 * @Version 1.0
 **/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root != null){
            TreeNode temp_right = root.right;
            TreeNode temp_left = root.left;
            root.left = invertTree(temp_right);
            root.right = invertTree(temp_left);
            return root;
        }
        return null;
    }
}
