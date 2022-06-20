// Template  Literals

// const fullName = 'Sena Turan';
// const city = 'Kocaeli';
// const yearOfBirth = 2005;

// let val;


// val = 'my name is '+fullName+
//       ' I\'m '+(2018-yearOfBirth)+' years old '+
//       ' and I live in '+city;

// val = `my name is ${fullName} I'm ${(2018-yearOfBirth>=18)?'over 18':'under 18'} and I live in ${city}`;


// console.log(val);

// // Demo : Strings

// // var sentence = "  Template Literals or template strings is the ability Have multi-line strings without any funny business. ";

// // var url = "http://sadikturan.com/Modern Javascipt KURSU sıfırdan ileri seviye ü ö ş";

// // // cümle kaç karakterlidir ?
// // console.log(sentence.length);

// // // kaç kelimeden oluşuyor ?
// // console.log(sentence.trim().split(' ').length);

// // // Tüm cümleyi küçük harfe çevirin.
// // console.log(sentence.toLowerCase())
// // console.log(sentence.toUpperCase());

// // // Cümlenin başındaki ve sonundaki boşlukları siliniz.
// // console.log(sentence.trim());

// // // '-' karakterini silin.
// // console.log(sentence.replace('-',''));

// // // url'nin içinden str kısmını çıkarınız.
// // var str = 'http://';
// // console.log(url.substr(str.length));
// // console.log(url.slice(str.length));

// // // url hangi protocol'u kullanmaktadır ? (http,https)
// // console.log(url.startsWith('http'));
// // console.log(url.startsWith('https'));

// // // url, '.com' ifadesini içeriyor mu?
// // console.log(url.indexOf('.com'));
// // console.log(url.includes('.com'));

// // // url string ifadesini geçerli bir url olarak düzenleyiniz.

// // console.log(url.toLowerCase()
// //                .replace(/ /g,'-') 
// //                .replace(/ı/g,'i')
// //                .replace(/ü/g,'u')
// //                .replace(/ö/g,'o')
// //                .replace(/ş/g,'s')
// //                .replace(/ç/g,'c')
// // );

// // Arrays

// let names = ['çınar','sena','ada','yiğit'];
// let years = [2017,1970,1990,1998];
// let mix = ['sadık','turan',1983,null,undefined,['sinema','kitap']];

// // // get array item
// // console.log(names[0])
// // console.log(names[3])

// // // set array item
// // names[names.length]='emel';

// // // add item
// // years.push(1986);
// // years.unshift(1986);

// // // remove item
// // years.pop();
// // years.shift();

// // //indexof
// // let index = names.indexOf('ada');
// // console.log(' index : '+index);

// // // reverse
// // names.reverse();

// // // sort
// // years.sort();

// // //concat
// // let val = years.concat(names);
// // console.log(val);

// // splice
// // console.log(names);
// // names.splice(0,1);

// function over18(year){
//     let age = 2018 - year;
//     return age>=18;
// }

// // find

// // filter
// let val = years.filter(over18);

// console.log(val);

// console.log(names);
// console.log(names.length);
// console.log(typeof names);

// // // console.log(years);
// // // console.log(mix);

// var arr = ["bwm,mercedes.opel.mazda"]

// arr.push('toyota')

// arr.unshift('seat')

// console.log(arr)

// var studentA = ['yiğit,bilgi,2010']
// var studentB = ['kaan,cankat,2008']


// console.log(students)

// const firstname='kaan'
// const age = 14
// const isStudent = true
// const school = 'highscool'

// if(firstname === 'kaan'){
//     console.log('merhaba kaan')
// }
// if(age == 14){
//     console.log('yaşınız 14')
// }

// if(isStudent==true){
//     console.log('merhaba öğrenci')
// }else{
//     console.log('merhaba işler nasıl')
// }

// if (age>=18){

//     if (school =='university'){
//         console.log('ehliyet alabilirsiniz')
//     }else{
//         console.log('eğitim durumunuz yetersiz')
//     }
    

// }else{
//     console.log('ehliyet alamazsınız')
// }

// if (age > 0 && age<12 ){
//     console.log(`${firstname} is a child`)
// }else if (age>=13 && age <=19){
//     console.log(`${firstname} is a teenager)
// }

// let category = 'telefon'

// switch(category){
//     case'telefon':
// console.log(telefon katagorisi)
// break;

// case'bilgisiyar'
// console.log('bilgisiyar katagorisi');

// default
// console.log('yanlış katagori')

// }
// let val


// let person = {
//     firstName :'kaan',
//     lastName :'cankat'
    

// }

// val =person.firstName
// val=person.lastName
// val=person['firstName']
// console.log(person)
// console.log(typeof person)





