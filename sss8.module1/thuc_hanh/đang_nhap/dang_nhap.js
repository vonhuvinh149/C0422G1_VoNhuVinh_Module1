let name = prompt('tên đăng nhập')
if (name == 'Admin'){
    let pass = prompt('nhập mật khẩu')
    if (pass == 'Vonhuvinh'){
        alert('đăng nhập thành công')
    }else if (pass !== 'Vonhuvinh'){
        alert('mật khẩu không chính xác')
    }
}else {
    alert('tên đăng nhập không chính xác')
}