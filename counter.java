//Given an integer n, return a counter function. This counter function initially returns n and then returns 1 more than the previous value every subsequent time it is called (n, n + 1, n + 2, etc).

//solution code:

const createCounter = function (n) {
  let count = n;
  return function () {
    return count++;
  };
};

let counter = createCounter(10);

console.log(counter()); //10
console.log(counter()); //11
console.log(counter()); //12

class Counter {
  constructor(n) {
    this.n = n;
  }

  increment() {
    return this.n++;
  }
}

const counter1 = new Counter(10);

console.log(counter1.increment()); //10
console.log(counter1.increment()); //11
console.log(counter1.increment()); //12
