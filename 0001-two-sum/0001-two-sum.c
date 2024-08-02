typedef struct Entry {
    int key;
    int value;
    struct Entry* next;
} Entry;

#define TABLE_SIZE 10000

unsigned int hash(int key) {
    return abs(key) % TABLE_SIZE;
}

void insert(Entry** table, int key, int value) {
    unsigned int index = hash(key);
    Entry* newEntry = (Entry*)malloc(sizeof(Entry));
    newEntry->key = key;
    newEntry->value = value;
    newEntry->next = table[index];
    table[index] = newEntry;
}

Entry* search(Entry** table, int key) {
    unsigned int index = hash(key);
    Entry* entry = table[index];
    while (entry != NULL) {
        if (entry->key == key) {
            return entry;
        }
        entry = entry->next;
    }
    return NULL;
}

int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    Entry* table[TABLE_SIZE];
    memset(table, 0, sizeof(table));
    
    for (int i = 0; i < numsSize; i++) {
        int complement = target - nums[i];
        Entry* entry = search(table, complement);
        if (entry != NULL) {
            int* result = (int*)malloc(2 * sizeof(int));
            result[0] = entry->value;
            result[1] = i;
            *returnSize = 2;
            return result;
        }
        insert(table, nums[i], i);
    }
    
    *returnSize = 0;
    return NULL;
}