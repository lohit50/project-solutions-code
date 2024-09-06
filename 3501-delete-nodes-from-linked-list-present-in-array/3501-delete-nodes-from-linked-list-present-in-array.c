/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

#define MAX_VAL 100000

struct ListNode* modifiedList(int* nums, int n, struct ListNode* head) {
    unsigned char hash[MAX_VAL / 8 + 1] = {0};
    int i;
    
    for (i = 0; i < n; i++) {
        hash[nums[i] / 8] |= (1 << (nums[i] % 8));
    }
    
    struct ListNode dummy = {0, head};
    struct ListNode* curr = &dummy;
    
    while (curr->next) {
        if (hash[curr->next->val / 8] & (1 << (curr->next->val % 8))) {
            struct ListNode* temp = curr->next;
            curr->next = temp->next;
            free(temp);
        } else {
            curr = curr->next;
        }
    }
    
    return dummy.next;
}