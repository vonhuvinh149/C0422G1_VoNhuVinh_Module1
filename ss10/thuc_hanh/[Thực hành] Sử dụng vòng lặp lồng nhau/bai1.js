let sout = '<table width=300 height="200p" border="1" cellpadding="10 cellspacing="0" >'

for (i =1 ; i <=10 ; i++){
    sout = sout + '<tr>'
    for (j = 1 ; j <= 10 ; j++){
        sout += '<td>'+ i * j + '</td>'
    }
    sout += '</tr>'
}
    sout += '</table>'
document.write(sout);