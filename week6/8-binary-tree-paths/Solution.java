import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) constructPaths(root, "", paths);
        return paths;
    }

    private void constructPaths(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
            return;
        }
        if (node.left != null) constructPaths(node.left, path + node.val + "->", paths);
        if (node.right != null) constructPaths(node.right, path + node.val + "->", paths);
    }
}
