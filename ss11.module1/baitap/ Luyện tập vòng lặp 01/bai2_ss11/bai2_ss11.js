let temp = prompt("nhập vào nhiệt độ hiện tại")
while(temp < 20 || temp > 100) {
    if(temp < 20) {
        temp = prompt("Tăng nhiệt độ");
    } else {
        temp = prompt("Giảm nhiệt độ");
    }
}
document.write("nhiệt độ của bạn là : " + temp);
