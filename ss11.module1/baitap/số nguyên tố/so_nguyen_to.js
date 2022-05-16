
    let num = prompt("nhập số lượng số nguyên  tố đầu tiên muốn biết")
    let count = 0;
    let numBer = 2;
    let divisor = 0;
    if (num < 1000) {
    while (count < num) {
    for (let i = 2; i < numBer; i++) {
    if (numBer % i == 0) {
    divisor++;
    break;
    }
    }
    if (divisor == 0) {
    document.write(numBer + "<br>");
    count++
    }
    numBer++;
    divisor = 0;
    }
    } else {
}