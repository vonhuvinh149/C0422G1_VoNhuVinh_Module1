function showMessage() {
      let a = document.getElementById('mon1').value;
      let b = document.getElementById('mon2').value;
      let c = document.getElementById('mon3').value;
      let sum = 'Sum = ' +(parseInt(a) + parseInt(b) + parseInt(c)) ;
      let medium =  'Medium = ' + (parseInt(a) + parseInt(b) + parseInt(c))/3 ;
      document.getElementById('tong').innerHTML = sum;
      document.getElementById('trungbinh').innerHTML = medium;

}