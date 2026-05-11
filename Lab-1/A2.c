#include<stdio.h>
int main(){
    int i,n,m,sum=0;
    printf("Enter n: ");
    scanf("%d",&n);
    for(i=1;n>0;i++){
        m=n%10;
        sum=sum+m;
        n=n/10;
    }
    printf("Sum of digits: %d",sum);
    return 0;
}