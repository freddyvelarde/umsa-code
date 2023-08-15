import { useState } from "./useState";
const btn = document.getElementById("btn");
const ctn = document.getElementById("ctn");

const [counter, setCounter] = useState(0);

ctn.textContent = counter();
const addCounter = () => {
  setCounter(counter() + 1);
  ctn.textContent = counter();
};

btn.addEventListener("click", addCounter);
