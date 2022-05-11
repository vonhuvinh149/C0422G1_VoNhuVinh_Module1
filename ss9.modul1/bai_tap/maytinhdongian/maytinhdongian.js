let nhap = document.getElementById('view');
function nhapValue(value) {
    nhap.value += value ;
}
let ketqua = document.getElementById('ketqua');
function result(value) {
    let result = eval(view.value)
    ketqua.value = result ;
}
function xoa(value) {
    nhap.value = "";
    ketqua.value= "";
}
