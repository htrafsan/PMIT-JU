`timescale 1ns / 100ps 

module testhalfa; 
    // input
    reg a;
    reg b;

    // outputs
    wire s;
    wire c;

    halfa utt (
        .a(a),
        .b(b),
        .s(s),
        .c(c)
    );

    initial begin
        // initialize inputes
        a=0;
        b=0;
    end
    always #2 a=~a; // a =0 , a =1 // 0 0 / 1 0 / 0 1 / 1 1
    always #4 b=~b; // b =0 , b =1 // 
    initial $monitor($time,"a=%b,b=%b,s=%b,c=%b",a,b,s,c);
    initial #50 $finish;
endmodule