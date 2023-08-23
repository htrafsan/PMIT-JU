`timescale 1ns / 100ps 

module remon; 
// inputs 
reg a;
reg b;
reg c;
//output 
wire z;

vlsi uut (
.a(a),
.b(b),
.c(c),
.z(z)
);

initial begin
        // initialize inputes
        a=0;
        b=0;
        c=0;
    end
    always #2 a=~a; 
    always #4 b=~b; 
    always #4 c=~c;
    initial $monitor($time,"a=%b,b=%b,c=%b,z=%b",a,b,c,z);
    initial #50 $finish;
 
endmodule
