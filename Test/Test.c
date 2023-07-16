#include <stdio.h>
int main()
{
    char name[10] = "rajeev";
    int i = 0;
    while (name[i] != '\0')
    {
        i++;
    }
    printf("%d", i);
}