let fibonacci = 1
let j = 0
for (let i = 0; i < 20; i++) {
    fibonacci += j
    j = fibonacci - j
    if (fibonacci % 5 == 0) {
        document.write("số đầu tiên trong dãy fibonacci chia hết cho 5 là: " + fibonacci)
        break
    }
}
