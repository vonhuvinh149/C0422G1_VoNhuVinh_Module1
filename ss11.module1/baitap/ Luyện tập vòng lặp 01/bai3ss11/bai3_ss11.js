let numBer = prompt('nhập số' )
for (let i = 0 ; i < numBer ; i++){
    for (let j = 2 ;j < i ; j ++ ){
        if ( i % j !== 0){
            document.write(i + ' <br>')
            break ;
        }
    }
}
