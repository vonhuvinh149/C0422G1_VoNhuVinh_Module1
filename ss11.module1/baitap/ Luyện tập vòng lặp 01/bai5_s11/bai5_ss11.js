let fibonacci = 1
let j = 0
let sum = 0;
for (let i = 0; i < 20; i++) {
    fibonacci += j
    j = fibonacci - j
    sum += fibonacci;
}
document.write("Tổng 20 số đầu tiên của dãy fibonacci là: " + sum)