function message(){
}

function check() {
  var name = document.forms["formulary"]["name"].value;
  var surname = document.forms["formulary"]["surname"].value;
  var company = document.forms["formulary"]["company"].value;
  var company = document.forms["formulary"]["mail"].value;
  var message = document.forms["formulary"]["other"].value;
  if (name == "" || surname=="" || company=="" || mail==""){
    alert("The information is incomplete");
    return false;
  }else{
      alert(`Thanks for the data, in somedays i will contact you`);
  }
}

function clean() {
  setTimeout('document.formulary.reset()',2000);
  return false; 
}

ScrollReveal().reveal('.showcase');
ScrollReveal().reveal('.info', { delay: 500 });
ScrollReveal().reveal('.footer', { delay: 500 });

