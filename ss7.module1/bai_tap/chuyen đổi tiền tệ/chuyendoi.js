
function showMessage() {
    let Amount = document.getElementById('nhap').value;
    let From = document.getElementById('from').value;
    let To = document.getElementById('to').value;
    let result;
    if (From == "VND" && To == "USD") {
        result = (Amount / 23000) + '($)';
    } else if (From == "USD" && To == "VND") {
        result = (Amount * 23000) + '(vnd)';
    } else if (From == "VND" && To == "VND") {
        result = Amount + "(vnd)";
    } else {
        result = Amount + "($)";
    }
    document.getElementById('Result').innerHTML = result;
    }




