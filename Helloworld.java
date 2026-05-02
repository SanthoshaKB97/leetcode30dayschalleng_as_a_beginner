//Write a function createHelloWorld. It should return a new function that always returns "Hello World".

//solution-code:

const createHelloWorld = function () {
  return (...args) => "Hello World";
};
