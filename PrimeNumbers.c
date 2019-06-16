#include<stdio.h>
#include<conio.h>
  void main()
  {
    int N;
    scanf( "%d", N );
    if ( (N & 1) == 1){
      printf( "true" );
    }
    else{
      printf( "false" );
    }
  }
