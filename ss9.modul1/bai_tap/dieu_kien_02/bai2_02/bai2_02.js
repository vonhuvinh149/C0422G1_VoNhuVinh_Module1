function showMessage() {
    let a = document.getElementById('nhap').value;
    let b = a * a ;
    document.getElementById('result').innerHTML = b + '(Cm2)';
}
//diện tích hình chữ nhật
function showMessage1() {
     let width = document.getElementById('nhap1').value;
     let height = document.getElementById('nhap2').value;
     let S = width * height;
     document.getElementById('result1').innerHTML = S + '(cm2)';
}
//diện tích hình tam giác
function showMessage2() {
     let m = document.getElementById('nhap3').value;
     let n = document.getElementById('nhap4').value;
     let dienTich = m * n / 2;
     document.getElementById('result2').innerHTML = dienTich + '(Cm2)';
}