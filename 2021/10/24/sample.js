var pics_src = new Array("./img/1.jpeg","./img/2.jpeg","./img/3.jpeg");
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