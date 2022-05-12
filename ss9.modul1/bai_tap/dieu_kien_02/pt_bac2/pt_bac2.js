let a = parseInt(prompt('nhập a'));
let b = parseInt(prompt('nhap b'));
let c = parseInt(prompt('nhap c'));
let delta = (b * b) - (4* a* c);

if (delta > 0){
    let x1 = (-b + Math.sqrt(delta)) / 2*a;
    let x2 = (-b - Math.sqrt(delta)) / 2*a;
    alert('phương trình có 2 nghiệm phân biệt là: ' + 'x1='+ x1 + ' x2='+ x2)
}else if (delta == 0){
    let x = -(b/2*a);
    alert('phương trình có 1 nghiệm kép' + x);
}else {
    alert('phương trình vô nghiệm');
}

