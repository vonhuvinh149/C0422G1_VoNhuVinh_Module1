let a = parseInt(prompt('diểm giữa kỳ'));
let b = parseInt(prompt('diểm cuối kỳ'));
let c = (a+b)/2
if (c>=9 ){
    alert('xếp loại giỏi')
}else if (c > 7){
    alert('xếp loại khá')
}else if (c>=5){
    alert('xếp loại trung binh')
}else {
    alert('xếp loại kém')
}