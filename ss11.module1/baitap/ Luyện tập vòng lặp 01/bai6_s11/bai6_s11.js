let natureNum = 0
let sum = 0
let count = 0
while (count < 30) {
    natureNum++
    if (natureNum % 7 == 0) {
        count++
        sum += natureNum
        console.log(natureNum)
    }
}
document.write("Tổng 30 số tự nhiên chia hết cho 7 đầu tiên là: " + sum)