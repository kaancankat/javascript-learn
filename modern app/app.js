const api_key = "<api_key>";
const url = "https://v6.exchangerate-api.com/v6/" + api_key;

// elements
const currency_one = document.getElementById("currency_one");
const currency_two = document.getElementById("currency_two");
const list_one = document.getElementById("list_one");
const list_two = document.getElementById("list_two");
const amount = document.getElementById("amount");
const calculate = document.getElementById("calculate");
const result = document.getElementById("result");

fetch(url + "/codes")
    .then(res => res.json())
    .then(data => {
        const items = data.supported_codes;
        
        let options;
        for(let item of items) {
            options += `<option value=${item[0]}>${item[1]}</option>`;    
        }
        list_one.innerHTML = options;
        list_two.innerHTML = options;
    });

calculate.addEventListener("click", function(){
    const doviz1 = currency_one.value;
    const doviz2 = currency_two.value;
    const miktar = amount.value;

    fetch(url + "/latest/" + doviz1)
        .then(res => res.json())
        .then(data => {
            const sonuc = (data.conversion_rates[doviz2] * miktar).toFixed(3);
            result.innerHTML = `
                <div class="card border-primary">
                    <div class="card-body text-center" style="font-size:30px;" >
                        ${miktar} ${doviz1} = ${sonuc} ${doviz2}
                    </div>
                </div>
            `;
        })

});

var FullTime = function(){
    this.hourly = '30TL';
}

var PartTime = function(){
    this.hourly = '20TL';
}

var Temporary = function(){
    this.hourly = '15TL';
}

var factory = new Factory();

var employees = [];

employees.push(factory.createEmployee('fulltime'));
employees.push(factory.createEmployee('parttime'));
employees.push(factory.createEmployee('parttime'));
employees.push(factory.createEmployee('temporary'));
employees.push(factory.createEmployee('temporary'));
employees.push(factory.createEmployee('fulltime'));
const form = document.getElementById('form');
const username = document.getElementById('username');
const email = document.getElementById('email');
const password = document.getElementById('password');
const repassword = document.getElementById('repassword');

function error(input, message) {
    input.className = 'form-control is-invalid';
    const div = input.nextElementSibling;
    div.innerText = message;
    div.className = 'invalid-feedback';
}

function success(input) {
    input.className = 'form-control is-valid';
}

function checkEmail(input) {
    const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
   
    if(re.test(input.value)) {
        success(input);
    } else {
        error(input, 'hatalı bir mail adresi');
    }
}

function checkRequired(inputs) {
    inputs.forEach(function(input) {
        if(input.value === '') {
            error(input, `${input.id} is required.`);
        } else {
            success(input);
        }
    });  
}

function checkLength(input, min, max) {
    if (input.value.length < min) {
        error(input, `${input.id} en az ${min} karakter olmalıdır`);
    }else if (input.value.length > max) {
        error(input, `${input.id} en fazla ${max} karakter olmalıdır`);
    }else {
        success(input);
    }
}

function checkPasswords(input1,input2) {
    if(input1.value !== input2.value) {
        error(input2, 'Parolalar eşleşmiyor');
    }
}

function checkPhone(input) {
    var exp = /^\d{10}$/;   
    if(!exp.test(input.value)) 
        error(input, 'Telefon 10 karakterli olmalıdır.');
}

form.addEventListener('submit', function(e) {
    e.preventDefault();

    checkRequired([username,email,password,repassword,phone]);
    checkEmail(email);
    checkLength(username,7,15);
    checkLength(password,7,12);
    checkPasswords(password,repassword);
    checkPhone(phone);
});
