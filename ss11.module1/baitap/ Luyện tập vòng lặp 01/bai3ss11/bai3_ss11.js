
 let n1=0 , n2=1 , numBer;
for (let i=1 ; i <= 20; i++ ) {
    numBer = n1 ;
    n1 += n2 ;
    n2 = numBer;
    document.write(numBer+'<br/>')
}