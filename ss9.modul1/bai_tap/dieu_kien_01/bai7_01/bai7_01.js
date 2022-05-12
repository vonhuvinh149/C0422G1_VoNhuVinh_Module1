 function showMessage() {
    let minute = document.getElementById('nhap').value;
    let vung = document.getElementById('vung').value;

    if (vung == 'Noi'){
        let result = minute * 1000;
        document.getElementById('result').innerHTML = result + '(vnd)';
    }else if (vung == 'Ngoai'){
        let result1 = minute * 2000;
        document.getElementById('result').innerHTML = result1+ '(vnd)';

    }


 }