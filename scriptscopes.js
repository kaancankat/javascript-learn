var isim= "Ahmet";
const adres ="istanbul"

function yazdır(){
    var isim = "ayşe"
    var yas =20
    console.log("function scope", isim,yas)
}
if(true){
    var isim = "zeynep"
    console.log(isim)
}
yazdır()
console.log(isim)





