// Converted from B.S.Tree.c
import java.util.*;
public class B_S_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        struct node{
        int data;
        struct node* left;
        struct node* right;
        };
        
        struct node* createnode(int data){
        struct node* newnode = (struct node*)malloc(sizeof(struct node));
        newnode->data = data;
        newnode->left = newnode->right = 0;
        return newnode;
        }
        
        struct node* insert(struct node* root, int data){
        if(root==0){
        return createnode(data);
        }
        if(data < root->data){
        root -> left = insert(root->left, data);
        }
        else if(data > root->data){
        root -> right = insert(root->right, data);
        }
        return root;
        }
        void inorder(struct node *root){
        if(root == 0){
        return; }
        inorder(root->left);
        System.out.printf("%d ",root->data);
        inorder(root-> right);
        }
        void findmin(struct node* root){
        while(root -> left != 0){
        root = root->left;
        }
        System.out.printf("%d",root->data);
        }
        void findmax(struct node* root){
        while(root -> right != 0){
        root = root->right;
        }
        System.out.printf("%d",root->data);
        };
        struct node* searchNode(struct node* root, int data) {
        if (root == NULL || root->data == data) {
        return root;
        }
        
        if (data < root->data) {
        return searchNode(root->left, data);
        }
        else if(data > root -> data){
        return searchNode(root->right, data);
        }
        }
        
        int main(){
        struct node* root;root = 0;
        int values[] = {15,10,20,8,12,18,25};
        for(int i=0; i<7; i++){
        root = insert(root, values[i]);
        }
        System.out.printf("The Inorder is...: ");
        inorder(root);
        
        System.out.printf("\nThe largest element is...: ");
        findmax(root);
        System.out.printf("\nThe smallest element is...: ");
        findmin(root);
        
        int searchValue = 18;
        struct node* searchResult = searchNode(root, searchValue);
        if (searchResult != NULL) {
        System.out.printf("\n%d found in BST.\n", searchValue);
        } else {
        System.out.printf("\n%d not found in BST.\n", searchValue);
        }
        
        }
    }
}