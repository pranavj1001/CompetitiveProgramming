const computeFactorial = () => {
    const number = document.getElementById('number').value;
    if(number != '')  {
        let resultArray = [];
        let resultSize = 1;
        resultArray[0] = 1;
        for(let i = 2; i <= number; i++) {
            resultSize = calculate(i, resultArray, resultSize);
        } 
        // console.log(resultArray);
        // console.log(resultSize);
        let factorial = '';
        for(let i = resultSize - 1; i >= 0; i--) {
            factorial += resultArray[i];
        }
        // console.log(factorial);
        document.getElementById('output').innerHTML = `<p style="word-break:break-word">${factorial}</p>`;
    }
};

const calculate = (i, resultArray, resultSize) => {
    let carry = 0;
    for(let j = 0; j < resultSize; j++) {
        let mul = resultArray[j] * i + carry;
        resultArray[j] = mul % 10;
        carry = Math.floor(mul / 10);
    }
    //console.log(carry);
    while(carry !== 0) {
        resultArray[resultSize] = carry % 10;
        carry = Math.floor(carry / 10);
        resultSize++;
    }
    return resultSize;
};
