 function chuVi() {
    var a = document.getElementById('nhap').value;
    const PI = 3.14;
    var P = 2 * a * PI + '(m)';
    document.getElementById('ketqua').innerHTML = P;
}
function dienTich() {
    var a = document.getElementById('nhap').value;
    const PI = 3.14;
    var S = a * a * PI + '(m2)';
    document.getElementById('ketqua').innerHTML = S;
}



