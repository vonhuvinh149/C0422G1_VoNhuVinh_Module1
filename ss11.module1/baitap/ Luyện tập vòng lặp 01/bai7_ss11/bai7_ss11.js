for (let i = 1 ; i <= 100 ; i++){
    document.write(i+'<br>')
    if (i %3 == 0 && i % 5==0){
        document.write('fizzbuzz'+'<br>')
  }else if ( i% 3 == 0 ){
        document.write('fizz' + '<br>')
    }else if (i%5 == 0){
        document.write('buzz'+'<br>')
    }
}
