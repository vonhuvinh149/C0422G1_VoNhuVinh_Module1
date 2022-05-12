let a = parseInt(prompt('nhap a'));
let b = parseInt(prompt('nhap b'));
let c = parseInt(prompt('nhap c'));
if(a>0 && b>0 && c>0){
      if ((a + b) > c && (a + c) > b && (b + c) > a) {
          alert('a,b,c là 3 cạnh của 1 tam giác')
      }else {
          alert('a,b,c không phải 3 cạnh của tam giac')
      }
}else {
    alert('a,b,c không phải là ba cạnh của 1 tam giác')
}