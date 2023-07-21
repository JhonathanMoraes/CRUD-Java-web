let campos = document.querySelectorAll('input[required]');
let botao = document.querySelector('button[type=submit]');
for (let input of campos) {
    input.oninput = function () {
        let camposPreenchidos = 0;
        for (let item of campos) {
            if (item.value === null || item.value <= 0 || item.value === '') {
                camposPreenchidos--;
            } else if (item.value !== null || item.value > 0 ||item.value !== '') {
                camposPreenchidos++;
            }
        }
        if (camposPreenchidos >= campos.length) {
            botao.removeAttribute('disabled');
        } else {
            botao.setAttribute("disabled", "");
        }
    };
}

