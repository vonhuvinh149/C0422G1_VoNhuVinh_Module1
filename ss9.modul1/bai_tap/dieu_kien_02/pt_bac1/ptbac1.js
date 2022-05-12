let a = parseInt(prompt('nhập a'));
let b = parseInt(prompt('nhap b'));
if(a == 0 && b == 0){
    alert('phương trình vô số nghiệm')
}else if ( a != 0 && b == 0){
    alert('phương trình có nghiệm bằng 0')
}else if (a != 0 && b != 0){
    let x = (-b)/a;
    alert('phương trình có nghiệm là : '+ x)
}else {
    alert('phương trình vô nghiệm')
}