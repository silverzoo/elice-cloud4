function highlightWords() {
    const txt = document.getElementById("targetp").innerText;
    let words = txt.split(" ");

    let output = "";

    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let replacementword;

        // 2. 단어의 길이가 8 이상인 경우 단어를 하이라이트 하세요.
        if(word.length >= 8) replacementword = "<span class='lightext'>" + word + "</span>"
        else replacementword = word;

        output += " " + replacementword + " ";
    }

    return output;
}

document.getElementById("targetp").innerHTML = highlightWords();

// 3. 볼드체인 텍스트를 모두 파란색으로 변경하세요.
function highlight() {
    var text = getElementsByTagName("strong");
    text.style.color = "blue";
}

//4. 볼드체인 텍스트를 모두 검은색으로 변경하세요.
    function returnNormal() {
    var text = getElementsByTagName("strong");
    text.style.color = "black";
}
