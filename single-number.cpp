#include <algorithm>
#include <vector>
#include <unordered_map>
#include <iostream>
using namespace std;

int convert_into_integer(int *arr)
{
    int final = 0;
    
    for(int i = 31;i >= 0; i--)
    {
        final = final + (arr[i]  * pow(2,31 - i) );
    }
    
    return final;
}

int main(){
	/*
	Enter Your Code Here
	*/
	/*
	Enter Your Code Here
	*/
	
	int arr[32] = {0}, i, j = 31, n,num;
    int bit;
    cin >> n;
    
    while(n--)
    {
        cin >> num;
        j = 31;
        while(num != 0)
        {
            bit =  (num & 1);       
            arr[j] = arr[j] + bit;
            j--;
            num = num >> 1;
        }
    }
    
    for( i =0 ; i < 32;i++)
        arr[i] = arr[i] % 3;
    	
    cout << convert_into_integer(arr);
}
