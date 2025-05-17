// Converted from BSTREE.c
import java.util.*;
public class BSTREE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Define a structure for a node in the binary search tree
        struct Node {
        int data;
        struct Node* left;
        struct Node* right;
        };
        
        // Function to create a new node
        struct Node* createNode(int data) {
        struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
        newNode->data = data;
        newNode->left = newNode->right = NULL;
        return newNode;
        }
        
        // Function to insert a node into the BST
        struct Node* insert(struct Node* root, int data) {
        if (root == NULL) {
        return createNode(data);
        }
        
        if (data < root->data) {
        root->left = insert(root->left, data);
        } else if (data > root->data) {
        root->right = insert(root->right, data);
        }
        
        return root;
        }
        
        // Function to perform in-order traversal
        void inOrderTraversal(struct Node* root) {
        if (root != NULL) {
        inOrderTraversal(root->left);
        System.out.printf("%d ", root->data);
        inOrderTraversal(root->right);
        }
        }
        void preorder(struct Node* root){
        if(root != NULL){
        System.out.printf("%d ",root->data);
        preorder(root->left);
        preorder(root->right);
        }
        }
        void postorder(struct Node *root){
        if(root!= NULL){
        postorder(root -> left);
        postorder(root->right);
        System.out.printf("%d ",root->data);
        }
        }
        
        int main() {
        struct Node* root = NULL;
        int values[] = {10, 5, 15, 3, 7, 12, 18};
        
        for (int i = 0; i < 7; i++) {
        root = insert(root, values[i]);
        }
        
        System.out.printf("In-order traversal of the BST: ");
        inOrderTraversal(root);
        System.out.printf("\nPreorder...: ");
        preorder(root);
        System.out.printf("\nPost-order...: ");
        postorder(root);
        
        return 0;
        }
    }
}