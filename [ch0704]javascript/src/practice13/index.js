var iconList = document.getElementsByClassName('favorites-icon');

function changeColor(e) {

    for(var icon of iconList) {
        icon.classList.remove('on');
    }
    e.target.classList.toggle('on');
}

for(var icon of iconList) {
    icon.addEventListener('click', changeColor);
}