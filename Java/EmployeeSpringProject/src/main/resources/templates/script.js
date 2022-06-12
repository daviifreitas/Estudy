const formulario = document.querySelector("form");

const Iname = document.querySelector(".name");
const Idepartment = document.querySelector(".department");
const Isalary = document.querySelector(".salary");

function cadastrar(){
  fetch("http://localhost:8090/api/employee",
      {
          headers: {
              'Accept' : 'application/json',
              'Content-Type' : 'application/json'
          },
          method : "POST",
          body : JSON.stringify({
              name :Iname.value ,
              department: Idepartment.value ,
              salary: Isalary.value
          })
      })
      .then(function(res){console.log(res)})
      .catch(function (res) {console.log(res)})

};

function limpar(){
    Iname.value = "";
        Idepartment.value = "";
        Isalary.value = null;
}

formulario.addEventListener('submit', function(event) {
    event.preventDefault();

    cadastrar();

    limpar();
}) ;

