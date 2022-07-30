/*
CSE430
UNIVERSITY OF ASIA PACIFIC
HASAN TAHSIN RAFSAN
FALL 2021
Final Assignment - 2
18 APRIL 2022
*/

%option noyywrap
%{
#include <math.h>

int sw = 0;
float a,b,res,tmp;
void calc()
{
	if(sw==0)

		a=atof(yytext); 

	else
	{
		b=atof(yytext);

		switch(sw)
		{
			case 1:res=a+b;
				   break;

			case 2:res=a-b;
				   break;

			case 3:res=a*b;
				   break;

			case 4:res=a/b;
				   break;

			case 5:for(int i=a;b>1;b--)
					   res=a*i;
				   break;
			case 6:while (a >= b){
					   a -= b;
				   }
				   res = a;
				   break;
			case 7:res=pow(a,(1/b));
				   break;
			case 8:res=log(a)/log(b);
				   break;
			case 9:res=log(a);
				   break;
			case 10:tmp=a*b;
					res=tmp/100;
					break;

		}
	}
}

%}

dig [0-9]+|([0-9]*)"."([0-9]+)
add "+"
sub "-"
mul "*"
div "/"
pow "^"
mod "%"
sqrt "rt"
log "lg"
ln "ln"
prcn "prcn"
result \n

%%
{dig} {calc();} 
{add} {sw=1;}
{sub} {sw=2;}
{mul} {sw=3;}
{div} {sw=4;}
{pow} {sw=5;}
{mod} {sw=6;}
{sqrt} {sw=7;}
{log} {sw=8;}
{ln} {sw=9;}
{prcn} {sw=10;}
{result} {printf("Result %.2f\n", res);}
%%


int main()
{
	printf("Supports: +, -, *, /, ^, %%, rt, lg, ln, prcn\nHow to:");
	printf("\n9 rt 2(√9): 3, 100 rt 4(⁴√100): 3.16...");
	printf("\n100 lg 3: 4.191, 3 base log of 100");
	printf("\n100 ln 1: 4.61");
	printf("\n12 prcn 100: 12, 12 percent of 100");
	printf("\n\nEnter num :");
	yylex();
}
