#include <bits/stdc++.h>
using namespace std;

struct node {
  int key;
  struct node *left, *right;
};

// Create a new node
struct node *newNode(int item) {
  struct node *temp = new node;
  temp->key = item;
  temp->left = temp->right = NULL;
  return temp;
}

// Inorder Traversal (Left, Root, Right)
void inorder(struct node *root) {
  if (root != NULL) {
    inorder(root->left);
    cout << root->key << " -> ";
    inorder(root->right);
  }
}

// Insert a node in BST
struct node *insert(struct node *node, int key) {
  if (node == NULL)
    return newNode(key);

  if (key < node->key)
    node->left = insert(node->left, key);
  else
    node->right = insert(node->right, key);

  return node;
}

int main() {
  struct node *root = NULL;

  int n;
  cout << "Enter number of elements to insert in BST: ";
  cin >> n;

  cout << "Enter " << n << " elements:\n";
  for (int i = 0; i < n; i++) {
    int val;
    cin >> val;
    root = insert(root, val);
  }

  cout << "Inorder traversal of the BST: ";
  inorder(root);
  cout << "NULL\n";

  return 0;
}
