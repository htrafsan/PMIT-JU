/* 
Full Adder Module for bit Addition 
*/
module fulladder
(
 input x,
 input y,
 input cin,
 
 output A, 
 output cout
 );
 

assign A =  ((~cin) & x &(~y)) | ((~cin) &(~x)&y ) | (cin &(~x) &(~y)) | (cin & x & y)     ;
assign cout = ((~cin) & x &y) | ((cin) &(~x)&y ) | (cin &(x) &(~y)) | (cin & x & y)  ;
 
endmodule
 