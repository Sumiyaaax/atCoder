var pics_src_overseas = new Array("./img/7.jpeg","./img/8.jpeg","./img/9.jpeg");
var num_overseas = -1;

slideshow_timer_overseas();
function slideshow_timer_overseas() {
    if(num_overseas === 2) {
        num_overseas = 0;
    } else {
        num_overseas ++;
    }
    document.getElementById("mypic-overseas").src=pics_src_overseas[num_overseas];
}
setInterval(slideshow_timer_overseas, 3000);