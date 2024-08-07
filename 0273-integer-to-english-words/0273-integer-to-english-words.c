char* belowTwenty[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
char* tens[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
char* thousands[] = {"", "Thousand", "Million", "Billion"};

void appendWord(char** result, char* word) {
    if (**result) {
        strcat(*result, " ");
    }
    strcat(*result, word);
}

void helper(int num, char** result) {
    if (num == 0) return;
    if (num < 20) {
        appendWord(result, belowTwenty[num]);
    } else if (num < 100) {
        appendWord(result, tens[num / 10]);
        helper(num % 10, result);
    } else if (num < 1000) {
        appendWord(result, belowTwenty[num / 100]);
        appendWord(result, "Hundred");
        helper(num % 100, result);
    }
}

char* numberToWords(int num) {
    if (num == 0) return "Zero";

    char* result = (char*)malloc(1024 * sizeof(char));
    memset(result, 0, 1024);

    int i = 0;
    while (num > 0) {
        if (num % 1000 != 0) {
            char* temp = (char*)malloc(1024 * sizeof(char));
            memset(temp, 0, 1024);
            helper(num % 1000, &temp);
            if (strlen(thousands[i]) > 0) {
                appendWord(&temp, thousands[i]);
            }
            if (*result) {
                strcat(temp, " ");
                strcat(temp, result);
                strcpy(result, temp);
            } else {
                strcpy(result, temp);
            }
            free(temp);
        }
        num /= 1000;
        i++;
    }

    return result;
}