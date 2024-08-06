

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    // Initialize a dummy node to act as the head of the result list.
    struct ListNode dummy;
    struct ListNode *current = &dummy;
    int carry = 0;

    // Loop through both lists until both lists are fully traversed.
    while (l1 != NULL || l2 != NULL) {
        // Get the values from the current nodes of both lists.
        int val1 = (l1 != NULL) ? l1->val : 0;
        int val2 = (l2 != NULL) ? l2->val : 0;

        // Calculate the sum of values and the carry.
        int sum = val1 + val2 + carry;
        carry = sum / 10;

        // Create a new node with the digit value of the current sum.
        current->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        current->next->val = sum % 10;
        current->next->next = NULL;

        // Move to the next nodes in the result list and the input lists.
        current = current->next;
        if (l1 != NULL) l1 = l1->next;
        if (l2 != NULL) l2 = l2->next;
    }

    // If there is a carry left after the last addition, add a new node for it.
    if (carry > 0) {
        current->next = (struct ListNode*)malloc(sizeof(struct ListNode));
        current->next->val = carry;
        current->next->next = NULL;
    }

    // Return the next node of the dummy node, which is the head of the result list.
    return dummy.next;
}