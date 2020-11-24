#include <stdio.h>
#include <stdlib.h>

int main() {

    FILE *in = fopen("text.txt", "r");
    if (in == NULL) {
        // hantera fel om den är null
        printf("Fel! %s\n", strerror(errno));
        fclose(in);
        return -1;
    }

    char buf[200];
    int res = fread(buf, 200, 1, in);
    if (res != 200) {
        // hantera fel
        printf("Fel! %s\n", strerror(errno));
        fclose(in);
        return -1;
    }

    res = fread(buf, 100, 1, in);
    if (res != 100) {
        // hantera felet
        printf("Fel! %s\n", strerror(errno));
        fclose(in);
        return -1;
    }

    fclose(in);
}