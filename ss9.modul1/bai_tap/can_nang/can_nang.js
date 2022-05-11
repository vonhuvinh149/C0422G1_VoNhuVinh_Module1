let myWeight = parseInt(prompt('nhap can nang'));
let myHeight = parseInt(prompt('nhap chieu cao'));

let bmi = myWeight / (myHeight * myHeight);
if (bmi < 18.5){
    document.write('underweight')
}else if (18.5<= bmi && bmi <25){
    document.write('Normal')
}else if(25<=bmi && bmi < 30){
    document.write('overweight')
}else {
    document.write('Obese')
}