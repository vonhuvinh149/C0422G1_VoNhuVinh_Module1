function showMessage() {
   let thuNhap = document.getElementById('nhap').value;
   if (thuNhap < 50000000){
       document.getElementById('result').innerHTML = 'Miễn Thuế';
   }else if (thuNhap >= 50000000){
       let result = thuNhap * 0.05;
       document.getElementById('result').innerHTML = result + '(vnd)'
   }else if(thuNhap >= 100000000){
       let result1 = thuNhap * 0.1;
       document.getElementById('result').innerHTML = result1 + '(vnd)'
   }else if (thuNhap >=500000000){
       let result2 = thuNhap * 0.15;
        document.getElementById('result').innerHTML = result2 + '(vnd)'
   }
}