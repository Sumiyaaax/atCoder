var pics_src_domestic = new Array("./img/4.jpeg","./img/5.jpeg","./img/6.jpeg");
var num = -1;

slideshow_timer_domestic();
function slideshow_timer_domestic() {
    if(num === 2) {
    num = 0;
    } else {
        num ++;
    }
    document.getElementById("mypic-domestic").src=pics_src_domestic[num];
}

setInterval(slideshow_timer_domestic, 3000);
