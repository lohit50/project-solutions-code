long parseLong(char* n) {
    long r = 0;
    for(int i = 0; n[i]; i++)
        r = r * 10 + (n[i] - '0');
    return r;
}

void minusOne(char* n) {
    while (*n == '0')
        *n-- = '9';
    (*n)--;
}

void plusOne(char* n) {
    while (*n == '9')
        *n-- = '0';
    (*n)++;
}

char* clone(char* n, int len) {
    char* t = malloc(len * sizeof(char) + 2);
    t[len + 1] = '\0';
    t[0] = '0';
    int mid = (len - 1) / 2;
    for (int i = 0; i <= mid; i++)
        t[i + 1] = n[i];
    return t;
}

char* nearestPalindromic(char* t) {
    int len = strlen(t);
    int tLen = len + 1;
    int mid = tLen / 2;

    if(len == 1) {
        --*t;
        return t;
    }

    char* t1 = clone(t, len);
    char* t2 = clone(t, len);
    char* t3 = clone(t, len);

    int left = 1, right = tLen - 1;
    for (int i = 0; i <= mid; i++)
        t1[right - i] = t1[left + i];

    minusOne(t2 + mid);
    for (int i = 0; i <= mid; i++)
        t2[right - i] = t2[left + i];

    if (t2[left] == '0')
        t2[right] = '9';

    plusOne(t3 + mid);
    if(*t3 != '0') left = 0;
    for (int i = 0; i <= mid; i++)
        t3[right - i] = t3[left + i];

    long ln = parseLong(t);
    long ln1 = parseLong(t1), diff1 = abs(ln1 - ln);
    long ln2 = parseLong(t2), diff2 = abs(ln2 - ln);
    long ln3 = parseLong(t3), diff3 = abs(ln3 - ln);

    char* res;
    if (ln > ln1)
        res = diff1 > diff3 ? t3 : t1;
    else if (ln < ln1)
        res = diff2 > diff1 ? t1 : t2;
    else
        res = diff2 > diff3 ? t3 : t2;

    while (*res == '0') res++;

    return res;
}
