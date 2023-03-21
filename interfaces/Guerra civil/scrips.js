
function habilitar(){
    nave = document.getElementById("select").value;

    if (nave == "Supremacy"){
        document.getElementById("capNav").disabled = false;
    }
    else{
        document.getElementById("capNav").disable = true;
    }
}

document.getElementById("select").addEventListener("change",habilitar);