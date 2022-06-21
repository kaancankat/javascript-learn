//function

function yasHesapla(dogumyılı){
return 2018 - dogumyılı
}

let ageAda = yasHesapla(2012)
let ageYigit = yasHesapla(2010)
let ageCinar = yasHesapla(2017)

console.log(ageAda)
console.log(ageYigit)
console.log(ageCinar)

function EmekligeKacYilKaldı(dogumyılı,isim){
    let yas =yasHesapla(dogumyılı)
    let emeklilik = 65 - yas

}
  

//uygulama

// 1- Kendisine gönderilen kelimeyi belirtilen kez ekranda yazan fonksiyonu yapınız.

function kelimeYazdir(kelime, adet) {
    for (let i=0; i < adet; i++) {
        console.log(kelime);
    }
}

// kelimeYazdir("merhaba", 2);

// 2- Dikdörtgenin alan ve çevresini hesaplayan fonksiyonu yazınız.

function alanCevreHesapla(kisa, uzun) {
    let alan = kisa * uzun;
    let cevre = (kisa + uzun) * 2;

    return `alan: ${alan} çevre: ${cevre}`;
}

let sonuc = alanCevreHesapla(7, 10);
sonuc = alanCevreHesapla(7, 12);
// console.log(sonuc);

// 3- Yazı tura uygulamasını fonksiyon kullanarak yapınız.

function yaziTuraAt() {
    let random = Math.random(); // 0-1

    if(random < 0.5) {
        console.log("yazı");
    } else {
        console.log("tura");
    }
    console.log(random);
}

// yaziTuraAt();

// 4- Kendisine gönderilen bir sayının tam bölenlerini dizi şeklinde döndüren fonksiyonu yazınız.

function tamBolenler(sayi) {
    let sayilar = [];

    for(let i=2; i < sayi; i++) {
        if(sayi % i == 0) {
            sayilar.push(i);
        }
    }

    return sayilar;
}


// console.log(tamBolenler(10));    // 2, 5
// console.log(tamBolenler(15));    // 3, 5
// console.log(tamBolenler(35));    // 3, 5

// 5- Değişken sayıda parametre alan toplam isminde bir fonksiyon tanımlayınız.

function toplam() {
    let sonuc = 0;

    for(let i = 0; i < arguments.length; i++) {
        sonuc += arguments[i];
    }

    return sonuc;
}

console.log(toplam(2, 5));
console.log(toplam(2, 5, 7));   
console.log(toplam(2, 5, 7, 10));  



