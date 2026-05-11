#include<stdio.h>
int main(){
    int i,a[100],n,sum=0;
    printf("Enter n: ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("Enter element %d: ",i+1);
        scanf("%d",&a[i]);
        if(a[i]%2==0){
            sum=sum+a[i];
        }
    }
    printf("Sum of elements: %d",sum);
    return 0;
}