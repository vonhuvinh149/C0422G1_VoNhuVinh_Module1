function showMessage() {
    let tienNo = document.getElementById('nhap').value;
    let soThang = document.getElementById('soThang').value;

    if (soThang == 'tra3'){
      let  result = tienNo * 0.02;
      document.getElementById('result').innerHTML = result + '(vnd)'
    }else if (soThang == 'tra6'){
       let result1 = tienNo * 0.05 ;
        document.getElementById('result').innerHTML = result1 + '(vnd)'
    }else  if (soThang == 'tra12'){
        let result2 = tienNo * 0.1 ;
        document.getElementById('result').innerHTML = result2 + '(vnd)'
    }else {
        document.getElementById('result').innerHTML = 'Thu hồi tài sản'
    }
}