function commission() {
    let amount = document.getElementById("amount").value;
    let total = amount * 10000;
    console.log(total);
    let result;
    if (amount < 1000) {
        result = total * 0.1;
    } else {
        if (amount < 5000) {
            result = total * 0.15;
        } else {
            result = total * 0.2
        }
    }
    document.getElementById("result6").innerText = "Hoa hồng: " + result + "Đ";
}