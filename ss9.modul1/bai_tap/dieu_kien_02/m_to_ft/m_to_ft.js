function showMessage() {
    let m = document.getElementById('nhap').value;
    let To = m * 3.2808 ;
    document.getElementById('result').innerHTML = '= '+To + '(feet)';
}