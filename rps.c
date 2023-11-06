#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<time.h>

int game(char you,char computer){
    
    if(you==computer){
        return -1;
    }

    if(you=='r' && computer=='p'){
        return 0;
    }
    else if(you=='p' && computer=='r'){
        return 1;
    }
    if(you=='p' && computer=='z'){
        return 0;
    }
    else if(you=='z' && computer=='p'){
        return 1;
    }
    if(you=='z' && computer=='r'){
        return 0;
    }
    if(you=='r' && computer=='z'){
        return 1;
    }
    
}

int main(){
    int n;
    char you, computer,result;

    srand(time(NULL));

    n=rand()%100;

    if(n<33){
        computer='r';
    }
    else if(n>33 && n<66){
        computer='p';
    }
    else{
        computer='z';
    }

    printf("\nEnter 'r' for rock, 'p' for paper and 'z' for scissors-\n");
    scanf("%c", &you);

    result=game(you,computer);

    if(result==-1){
    printf("It's a tie!\n");
    }

    else if(result==1){
    printf("You won the game!\n");
    }
    else{
    printf("You lost the game\n");
    }

    printf("Your choice was %c and computer's choice was %c.", you,computer);
    printf("Thankyou for playing the game.")
}