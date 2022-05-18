let x = 0 ;
let array = [];
function showMessage() {
    array[x] = document.getElementById('myvalue').value;
    alert('element: '+ array[x] +' Added at index '+ x);
    x++;
    document.getElementById('myvalue').value = '';

}
function showMessage2() {
        let e = '<hr>'
    for ( i = 0 ;i <array.length ; i++){
        e += 'element'+i+': '+array[i] + '<br/>'
        document.getElementById('result').innerHTML = e ;
    }
}