let numBer = '<table width=800 border=1 cellpadding=10 cellspaning=0 >'
let i , j ;
debugger;
for (i=1 ; i <= 10 ; i++){
    numBer += '<tr>'
    for (j = 2 ; j < 10 ;j++){
        numBer += '<td>' + j + ' x ' + i + ' = ' + i * j + '</td>' ;

    }
    numBer +=  '</tr>'
}
numBer += '</table>'
document.write(numBer)