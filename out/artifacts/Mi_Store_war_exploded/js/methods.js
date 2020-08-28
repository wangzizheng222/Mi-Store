/**
 * 将数据库中price的字符串转换为数组
 */
function transPrice(price) {
    return price.split(",")
}
function getQueryVariable(variable)
{
    const query = window.location.search.substring(1);
    const vars = query.split("&");
    for (let i=0; i<vars.length; i++) {
        const pair = vars[i].split("=");
        if(pair[0] === variable){return pair[1];}
    }
    return false;
}
function setStatus(id,status) {
    let mi_status = [id,status]
    localStorage.setItem("mi_status",JSON.stringify(mi_status));
}

function getStatus() {
    return JSON.parse(localStorage.getItem("mi_status"))
}
