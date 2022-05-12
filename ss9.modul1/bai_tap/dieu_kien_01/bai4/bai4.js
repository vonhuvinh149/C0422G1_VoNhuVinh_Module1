let a = parseInt(prompt('nhap a'));
let b = parseInt(prompt('nhap b'));
let c = parseInt(prompt('nhap c'));

if (a>b && a>c){
    alert(a +' là số lớn nhất');
}else if (a<b && b>c){
    alert(b +' là số lớn nhất')
}else if (a<c && b<c){
    alert(c + ' là số lớn nhất')
}else if(a == b && a > c ){
    alert('số lớn nhất là '+ a)
}else if(a == b && a<c){
    alert('số lớn nhất là '+ c)
}else if (a=c && a>b){
    alert('số lớn nhất là '+a);
}else if (a=c && a<b) {
    alert('số lớn nhất là ' +b)
}else if (b=c && a>b){
    alert('số lớn nhất là '+a)
}else {
    alert('số lớn nhất là '+b)
}