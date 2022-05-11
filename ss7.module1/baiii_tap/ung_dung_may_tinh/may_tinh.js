function Tong() {
    let a = document.getElementById('giatri1').value;
    let b = document.getElementById('giatri2').value;
    let Tong =  parseInt(a) + parseInt(b) ;
    document.getElementById('ketqua').innerHTML = Tong ;

}
function Hieu() {
    let a = document.getElementById('giatri1').value;
    let b = document.getElementById('giatri2').value;
    let Hieu =  parseInt(a) - parseInt(b) ;
    document.getElementById('ketqua').innerHTML = Hieu ;

}
function Tich() {
    let a = document.getElementById('giatri1').value;
    let b = document.getElementById('giatri2').value;
    let Tich =  parseInt(a) * parseInt(b) ;
    document.getElementById('ketqua').innerHTML = Tich ;

}
function Thuong() {
    let a = document.getElementById('giatri1').value;
    let b = document.getElementById('giatri2').value;
    let Thuong =  parseInt(a) / parseInt(b) ;
    document.getElementById('ketqua').innerHTML = Thuong ;
}

