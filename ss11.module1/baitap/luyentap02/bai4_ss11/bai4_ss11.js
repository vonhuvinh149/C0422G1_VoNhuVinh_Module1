
    let width = prompt("nhập chiều dài hình chữ nhật")
    let height = prompt("nhập chiều rộng hình chữ nhật")
    for (let i =1;i<= height ;i++){
    for (let j = 1;j<=width;j++){
    if(i == 1 || i == height || j == 1 || j == width){
    document.write("*")
    }
    else {
    document.write("&nbsp&nbsp")
}
    }
    document.write("<br>")
    }