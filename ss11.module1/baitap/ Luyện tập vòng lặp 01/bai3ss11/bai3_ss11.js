let fibonacci = 1
let j = 0
for (let i = 0; i < 20; i++) {
    document.write(fibonacci + "<br>")
    fibonacci += j
    j = fibonacci - j
}