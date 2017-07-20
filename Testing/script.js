var navBar = document.getElementById('nav');

navBar.addEventListener("click", navNotice);


function navNotice(){
  navBar.innerHTML = "This is the navBar";
}
