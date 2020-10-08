console.log("Server is starting");
function saveJSON() {
    var varName = document.getElementById('name').value;
    var varSurname = document.getElementById('surname').value;
    var varCompany = document.getElementById('company').value;
    var varMail = document.getElementById('mail').value;
    var varNeed = document.getElementById('need').value;
    var varSummary = document.getElementById('summary').value;
    console.log("Nombre= " + varName + "; Apellido= " + varSurname + "; Compañia= " + varCompany + "; Correo= " + varMail + "; Nececidad= " + varName + "; Resumen= " + varSummary);
}

document.querySelector('#boton').addEventListener('click', traerDatos);

function traerDatos() {
    console.log("Dentro de la función traerDatos");
    const xhttp = new XMLHttpRequest();

    xhttp.open("GET", "dataBase.json", true);
    xhttp.send();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            console.log(this.responseText);
            let data = JSON.parse(this.responseText);
            console.log(data);

            let res = document.querySelector('#res');
            res.innerHTML = "";
            for (let item of data) {
                console.log(item.name);
                res.innerHTML += `
                <tr>
                    <th>${item.name}</th>
                    <th>${item.surname}</th>
                    <th>${item.company}</th>
                    <th>${item.mail}</th>
                    <th>${item.need}</th>
                    <th>${item.summary}</th>
                </tr>
                `
            }
        }
    }
}