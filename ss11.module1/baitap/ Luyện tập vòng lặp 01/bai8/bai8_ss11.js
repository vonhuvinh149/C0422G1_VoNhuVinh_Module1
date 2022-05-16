function play() {
    let range = +prompt("Nhập khoảng mà bạn muốn đoán")
    let ranDom = Math.floor(Math.random() * (range + 1))
    console.log(ranDom)
    for (let i = 1; i < 4; i++) {
        let guessNum = prompt("bạn đoán số bao nhiêu")
        if (guessNum == ranDom) {
            alert("chính xác")
            break
        }
        if (guessNum < ranDom) {
            alert("số bạn chọn nhỏ hơn")
        } else {
            alert("số bạn chọn lớn hơn")
        }
    }
    alert("bạn đã hết lượt chơi")
}