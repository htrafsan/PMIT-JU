/*
CSE430
UNIVERSITY OF ASIA PACIFIC
HASAN TAHSIN RAFSAN
FALL 2021
Final Assignment - 1
18 APRIL 2022
*/

%{
    #include <stdio.h>
    #include <stdlib.h>
    #include <string.h>
	char punctu[100],keyw[100],oper[100],loper[100],braces[100],iden[100],constan[100],string[100],def[200];
    int lineno = 1;
    int key,ope,lope,brac,punc,ide,consta,strin,defn = 0;
    void store_tok(char *token_type);
    void yyerror();
%}

%x ML_COMMENT
alpha       [a-zA-Z]
digit       [0-9]
alnum       {alpha}|{digit}
print       [ -~]

preprocessor_directives #.*
ARRAY       ({alpha}+{alnum}*"[".+"]")|({alpha}+{alnum}*"["+"]")
POINTER     "*"+{alpha}+{alnum}*
ID          {alpha}+{alnum}*
ICONST      "0"|[0-9]{digit}*
FCONST      "0"|{digit}*"."{digit}+
STRING      \"{print}*\"
 
%%
 
"//".*                  { printf("\nSingle line comment at line %d\n", lineno); } 
 
"/*"                    { printf("\nComment from line %d ", lineno); BEGIN(ML_COMMENT); }
<ML_COMMENT>"*/"        { printf("to line %d\n", lineno); BEGIN(INITIAL); }
<ML_COMMENT>[^*\n]+     
<ML_COMMENT>"*"         
<ML_COMMENT>"\n"        { lineno += 1; }
 

"auto"|"int"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while"|"AUTO"|"INT"|"BREAK"|"CASE"|"CHAR"|"CONST"|"CONTINUE"|"DEFAULT"|"DO"|"DOUBLE"|"ELSE"|"ENUM"|"EXTERN"|"FLOAT"|"FOR"|"GOTO"|"IF"|"INT"|"LONG"|"REGISTER"|"RETURN"|"SHORT"|"SIGNED"|"SIZEOF"|"STATIC"|"STRUCT"|"SWITCH"|"TYPEDEF"|"UNION"|"UNSIGNED"|"VOID"|"VOLATILE"|"WHILE" { key++; store_tok("KEYWORD"); }
 
"+"|"-"|"*"|"/"|"++"|"--" { ope++;store_tok("OPERATOR"); }

"||"|"&&"|"!"|"=="|"!="|">"|"<"|">="|"<=" { lope++;store_tok("LOGICAL OPERATOR"); }
 
 
"("|")"|"["|"]"|"{"|"}" { brac++;store_tok("BRACKETS"); }

";"|"."|","|"="|"&" { punc++;store_tok("Punctuations and ASSIGN"); }

{preprocessor_directives} { defn++; store_tok("DEFINES"); }
{POINTER}       { ide++; store_tok("ID"); }
{ARRAY}         { ide++; store_tok("ID"); }
{ID}            { ide++; store_tok("ID"); }
{ICONST}        { consta++; store_tok("CONST"); }
{FCONST}        { consta++; store_tok("CONST"); }
{STRING}        { strin++; store_tok("STRING"); }
 

"\n"*           { lineno += 1; }
[ \t\r\f]+      
.               { yyerror("Unrecognized character"); }
 
%%
 
void store_tok(char *token_type){
	if (strcmp(token_type, "KEYWORD")==0){
		strcat(keyw, yytext);
		strcat(keyw, "✼");
	}
	else if (strcmp(token_type, "OPERATOR")==0){
		strcat(oper, yytext);
		strcat(oper, "✼");
	}
	else if (strcmp(token_type, "LOGICAL OPERATOR")==0){
		strcat(loper, yytext);
		strcat(loper, "✼");
	}
	else if (strcmp(token_type, "BRACKETS")==0){
		strcat(braces, yytext);
		strcat(braces, "✼");
	}
	else if (strcmp(token_type, "Punctuations and ASSIGN")==0){
		strcat(punctu, yytext);
		strcat(punctu, "`");
	}
	else if (strcmp(token_type, "ID")==0){
		strcat(iden, yytext);
		strcat(iden, "✼");
	}
	else if (strcmp(token_type, "CONST")==0){
		strcat(constan, yytext);
		strcat(constan, "✼");
	}
	else if (strcmp(token_type, "STRING")==0){
		strcat(string, yytext);
		strcat(string, "✼");
	}
	else if (strcmp(token_type, "DEFINES")==0){
		strcat(def, yytext);
		strcat(def, "✼");
	}
	else
		printf("yytext: %s\ttoken: %s\tlineno: %d\n", yytext, token_type, lineno);

}

void yyerror(char *message){
    printf("Error: \"%s\" in line %d. Token = %s\n", message, lineno, yytext);
    exit(1);
}


char *RemoveDuplicates(char *resentence) {
  char *temp1 = malloc(100);
  char *temp = NULL;

  *temp1 = 0;
  temp = strtok(resentence, "✼`");

  if (temp != NULL) {
    strcpy(temp1, temp);
    while ((temp = strtok(NULL, "✼`")) != NULL) {
      if (strstr(temp1, temp) == NULL) {
        strcat(temp1, "', '");
        strcat(temp1, temp);
      }
    }
    strcat(temp1, "'");
  }
  strcpy(resentence, temp1);
  return resentence;
  free(temp1);
}

int main(int argc, char *argv[]){
    yyin = fopen(argv[1], "r");
    yylex();
    fclose(yyin);

    printf("\nNumber of Defines = %d\n", defn);
	printf("Defines: '%s",RemoveDuplicates(def));

    printf("\n\nNumber of Keywords = %d\n", key);
	printf("Keywords: '%s",RemoveDuplicates(keyw));

    printf("\n\nNumber of Identifires = %d\n", ide);
	printf("Identifires: '%s",RemoveDuplicates(iden));

    printf("\n\nNumber of Constants = %d\n", consta);
	printf("Constants: '%s",RemoveDuplicates(constan));

    printf("\n\nNumber of Operator = %d\n", ope);
	printf("Operators: '%s",RemoveDuplicates(oper));

    printf("\n\nNumber of Logical Operator = %d\n", lope);
	printf("Logical Operators: '%s",RemoveDuplicates(loper));

    printf("\n\nNumber of Brackets = %d\n", brac);
	printf("Brackets: '%s",RemoveDuplicates(braces));

    printf("\n\nNumber of Punctuations = %d\n", punc);
	printf("Punctuations: ',', '%s",RemoveDuplicates(punctu));

	printf("\n\nNumber of Literal = %d\n", strin);
	printf("Literal: '%s",RemoveDuplicates(string));
	
	printf("\n");

    return 0;
}
