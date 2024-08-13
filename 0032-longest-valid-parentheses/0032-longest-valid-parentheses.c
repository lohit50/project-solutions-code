#include <stdio.h>
#include <stdlib.h>

int longestValidParentheses(char* s) {
    int max_len = 0;
    int current_len = 0;
    int* stack = (int*)malloc((strlen(s) + 1) * sizeof(int));
    int top = -1;
    
    // Initialize stack with -1 to handle the base case
    stack[++top] = -1;
    
    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] == '(') {
            // Push the index of the '(' onto the stack
            stack[++top] = i;
        } else if (s[i] == ')') {
            // Pop the top of the stack
            top--;
            if (top == -1) {
                // Stack is empty, push the index of the current ')' as a new base
                stack[++top] = i;
            } else {
                // Calculate the length of the current valid substring
                current_len = i - stack[top];
                if (current_len > max_len) {
                    max_len = current_len;
                }
            }
        }
    }
    
    free(stack);
    return max_len;
}
