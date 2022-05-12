function commission() {
    let amount = document.getElementById("amount").value;
    if (amount <= 10000000) {
        let result = amount * 0.1;
        document.getElementById('result').innerHTML = result + '(vnd)';
    } else if (amount > 10000000) {
        let result2 = amount * 0.2;
        document.getElementById('result').innerHTML = result2 + '(vnd)';
    } else {
        let result3 = amount * 0.3;
        document.getElementById('result').innerHTML = result3 + '(vnd)';
    }
}
