
bool isIsomorphic(char* s, char* t) {
    int map1[256] = {0}; 
    int map2[256] = {0}; 
    int i = 0;
    
    while (s[i] != '\0' && t[i] != '\0') {
        if (map1[(int)s[i]] != map2[(int)t[i]]) {
            return false;
        }

        map1[(int)s[i]] = i + 1;
        map2[(int)t[i]] = i + 1;

        i++;
    }

    return s[i] == '\0' && t[i] == '\0';
}