var pics_src = new Array("./img/1.jpeg","./img/2.jpeg","./img/3.jpeg");
var pics_src_domestic = new Array("./img/4.jpeg","./img/5.jpeg","./img/6.jpeg");
var num = -1;

slideshow_timer();
function slideshow_timer() {
    if(num === 2) {
        num == 0;
    } else {
        num ++;
    }
    document.getElementById("mypic").src=pics_src[num];
    document.getElementById("mypic-domestic").src=pics_src_domestic[num];
}
setInterval(slideshow_timer, 3000);
// setTimeout("slideshow_timer()", 3000);
