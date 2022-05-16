let number = '';
let i ;
for (i=1 ; i<=5 ; i++){
    number += '*'
    document.write('<p>' + number+'</p>')
}
number =''
for (i=1;i<=5;i++){
    for (let j =0;j<=5-i;j++){
        number += "*"
    }document.write(number + "<br>")
        number = ''
}