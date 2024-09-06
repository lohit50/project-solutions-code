
#define MAX_VAL 100000

struct ListNode* modifiedList(int* nums, int n, struct ListNode* head) {
    if (head == NULL) {
        return head;
    }

    // Create a hash set
    bool hash_set[MAX_VAL + 1] = {false};
    for (int i = 0; i < n; i++) {
        hash_set[nums[i]] = true;
    }

    struct ListNode dummy = {0, head};
    struct ListNode* current = &dummy;

    while (current->next != NULL) {
        if (hash_set[current->next->val]) {
            struct ListNode* temp = current->next;
            current->next = current->next->next;
            free(temp);
        } else {
            current = current->next;
        }
    }

    return dummy.next;
}