#include<bits/stdc++.h>
using namespace std;
int main(){
    int x,y;
    for(int i=0;;i++){
        cin>>x>>y;
        if(x>y){
            cout<<"Decrescente"<<endl;
        }else if(x<y){
            cout<<"Crescente"<<endl;
        }

        if(x==y) break;
    }
}