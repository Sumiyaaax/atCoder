var pics_src = new Array("./img/10.jpeg","./img/11.jpeg","./img/12.jpeg");
var num = -1;

slideshow_timer();
function slideshow_timer() {
    if(num === 2) {
        num = 0;
    } else {
        num ++;
    }
    document.getElementById("mypic").src=pics_src[num];
}
setInterval(slideshow_timer, 3000);