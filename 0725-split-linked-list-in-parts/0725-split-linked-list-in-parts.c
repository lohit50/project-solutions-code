struct ListNode* create(int val) {
    struct ListNode* res = (struct ListNode*)malloc(sizeof(struct ListNode));
    res->next = NULL;
    res->val = val;
    return res;
}

struct ListNode** splitListToParts(struct ListNode* head, int k, int* returnSize) {
    struct ListNode** res = (struct ListNode**)malloc(k * sizeof(struct ListNode*));
    int size = 0;
    struct ListNode* tmp = head;
    while (tmp) {
        size++;
        tmp = tmp->next;
    }
    int* sizes = (int*)malloc(k * sizeof(int));
    int mod = size % k;
    for (int i = 0; i < k; i++) {
        sizes[i] = size / k;
        if (mod > 0) {
            sizes[i]++;
            mod--;
        }
    }
    for (int i = 0; i < k; i++) {
        res[i] = (struct ListNode*)malloc(sizes[i] * sizeof(struct ListNode));
        if (head == NULL) {
            res[i] = NULL;
            continue;
        }
        res[i] = create(head->val);
        head = head->next;
        struct ListNode* curr = res[i];
        for (int j = 1; j < sizes[i]; j++) {
            curr->next = create(head->val);
            head = head->next;
            curr = curr->next;
        }
    }
    *returnSize = k;
    return res;
}