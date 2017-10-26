package graphs;

import arrays_and_strings.String_rotation;

import java.util.Scanner;

public class MinimalTree {

    public static void main(String[] args) {
        MinimalTree mt = new MinimalTree();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int root_index = array.length/2 + 1;

        BST tree = new BST(array[root_index]);
        tree.root = tree.createMinBST(array);

        tree.inOrder(tree.root);

    }


}
