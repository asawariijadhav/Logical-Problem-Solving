for ($i = 51; $i -le 100; $i++) {
    $fileName = "program$i.c"
    @"
/*
    program$i - Auto-generated C Program
*/

#include <stdio.h>

int main() {
    printf("This is program $i\n");
    return 0;
}
"@ | Set-Content -Encoding ASCII $fileName
}
