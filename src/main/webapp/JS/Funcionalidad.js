document.getElementById('file').onchange=function(e){
    let reader = new FileReader();
    reader.readAsDataURL(e.target.files[0]);
    reader.onload=function(){
        let preview = document.getElementById('preview');
        canvas=document.createElement('canvas');
        canvas.width=400; canvas.height=400;
        preview.innerHTML='';
        preview.append(canvas);
        let canvctrl = canvas.getContext("2d");
        image = new Image(); image.src = reader.result;
        image.onload = () => canvctrl.drawImage(image, 0, 0, 400, 400);
    }
}

function add(){
    let tableBody = document.getElementById("table-body");
    let newRow = document.createElement("tr");
    //imagen
    let newColumn = document.createElement("td");
    let newImage = document.createElement("img");
    newImage.src = "rsc/perro.png";
    newImage.width = "150";
    newColumn.appendChild(newImage);
    newRow.appendChild(newColumn);
    //descripción
    newColumn = document.createElement("td");
    newColumn.innerHTML = "Perro";
    newRow.appendChild(newColumn);
    //fecha
    newColumn = document.createElement("td");
    newColumn.innerHTML = "21/7/2002";
    newRow.appendChild(newColumn);
    //boton
    newColumn = document.createElement("td");
    let newButton = document.createElement("button");
    newButton.innerHTML = "Descargar";
    newColumn.appendChild(newButton);
    newRow.appendChild(newColumn);

    tableBody.appendChild(newRow);
}

console.log("Javascript is functoinal");